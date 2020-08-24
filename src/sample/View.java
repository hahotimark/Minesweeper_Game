package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;


import javax.swing.*;
import java.io.FileInputStream;

public class View {


    public void start(Stage stage) throws Exception{

       boolean isAktiv = Debug.OnDebugmode();
       Debug.checkAndPrint(isAktiv, "Make Grid...");




        GridPane gridPane = new GridPane();

        //Set layout
        //Setting size for the pane
        gridPane.setMinSize(300, 300);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 20, 10, 20));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        Debug.checkAndPrint(true,"GridPane completed!");

        Image image = new Image(new FileInputStream("C:\\Users\\hahot\\IdeaProjects\\Minesweeper\\src\\Elements\\imag.jpg"), 40, 40, false, false);

        ImageView imageView = new ImageView(image);

        gridPane.getChildren().add(new ImageView(image));

        //Setting the position of the image
        imageView.setX(100);
        imageView.setY(100);

        /** VIEW ELEMENTS */

        // debug button

        Button mode = new Button();
        mode.setText("D");
        gridPane.add(mode, 0, 0);
        mode.setStyle("-fx-background-color: #cfcedb; ");

        mode.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                System.out.println("Debug mode is ON!");


                Debug onbutton = new Debug();
                boolean devmode = onbutton.OnDebugmode();


                mode.setStyle("-fx-background-color: #b50d0d; ");

            }

        });

        // buttons

        for (int x = 0; x < 10; x++) {
            for (int y = 2; y < 16; y++) {

                System.out.print("Add_button: " + x + " ,");
                System.out.print("Add_button: " + y + " " );

                Button field = new Button();
                field.setText("M");
                gridPane.add(field, x, y);

                field.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {

                        Debug.checkAndPrint(isAktiv, "Click button");

                        ButtonListener.clickCounter();



                    }


                });



            }
        }



        /** VIEW ELEMENTS */


        //Creating a scene object
        Scene scene = new Scene(gridPane);

        System.out.println("\n Make scene...");

        //Setting title to the Stage
        stage.setTitle("Minesweeper");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();





    }

}
