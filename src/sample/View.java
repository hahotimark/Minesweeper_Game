package sample;

import Elements.ElementType;
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

import static Elements.ElementType.*;

public class View {


    public void start(Stage stage, GameTable gt) throws Exception{

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

       // Image image = new Image(new FileInputStream("C:\\Users\\hahot\\IdeaProjects\\Minesweeper\\src\\Elements\\imag.jpg"), 40, 40, false, false);

//
  //      gridPane.getChildren().add(new ImageView(image));

        //Setting the position of the image
//        imageView.setLayoutY(1);

        /** VIEW ELEMENTS */

        // debug button

        Button mode = new Button();
        mode.setText("D");
        gridPane.add(mode, 2, 10);
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

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {

                System.out.print("Add_button: " + x + " ,");
                System.out.print("Add_button: " + y + " " );


                String gamefieldContent = gt.getCellContent(x, y);

                Button field = new Button(gamefieldContent);
                field.setText("[]");
                gridPane.add(field, x, y);

                field.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {

                        Debug.checkAndPrint(isAktiv, "Click button");

                        ButtonListener.clickCounter();

                       if (gamefieldContent == "B"){
                           field.setText("B");
                           field.setStyle("-fx-background-color: #000000; ");

                           Stage lostWindow = new Stage();

                           LostView victory = new LostView();
                           try {
                               victory.start(lostWindow);
                           } catch (Exception ex) {
                               ex.printStackTrace();
                           }

                           // vesztes ablak meghívása

                            System.out.println("You ara dead!");
                        }
                       else if (gamefieldContent == "E"){
                            field.setText("E");
                            field.setStyle("-fx-background-color: #f2eb16; ");

                            System.out.println("Empty field!");
                        }
                       else if (gamefieldContent == "N"){
                           field.setText("N");
                           field.setStyle("-fx-background-color: #e37209; ");

                           System.out.println("Noise field!");
                       }
                       else if (gamefieldContent == "H"){
                           field.setText("H");
                           field.setStyle("-fx-background-color: #FFFFF; ");

                           System.out.println("This is teh Hero!");
                       }
                       else{
                           field.setText("T");
                           field.setStyle("-fx-background-color: #24c7bf; ");

                           Stage newWindow = new Stage();

                           VictoryView victory = new VictoryView();
                           try {
                               victory.start(newWindow);
                           } catch (Exception ex) {
                               ex.printStackTrace();
                           }
                           // nyertes ablak meghívása


                           System.out.println("Victory field!");

                        }

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
