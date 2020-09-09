package sample;

import Controller.ButtonListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VictoryView {


    public void start(Stage newWindow) throws Exception {


        GridPane gridPane2 = new GridPane();

        //Set layout
        //Setting size for the pane
        gridPane2.setMinSize(300, 300);

        //Setting the padding
       // gridPane.setPadding(new Insets(10, 20, 10, 20));

        //Setting the vertical and horizontal gaps between the columns
        gridPane2.setVgap(6);
        gridPane2.setHgap(6);

        //Setting the Grid alignment
        gridPane2.setAlignment(Pos.CENTER);

        Text text2 = new Text("Congratulation! You are winner!");
        gridPane2.add(text2, 0, 1);

        ButtonListener count = new ButtonListener();

        int number = count.clickCounter();

        Text text3 = new Text("You are win " + number + " with steps!");

        gridPane2.add(text3, 0, 2);

        // Quit game

        Button exit = new Button("Quit game");

        gridPane2.add(exit, 0, 3);

        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                System.out.println("Quit game");

                newWindow.close();

            }

        });


        //Creating a scene object
        Scene scene = new Scene(gridPane2);

        System.out.println("\n Make scene...");

        //Setting title to the Stage
        newWindow.setTitle("Victory!");

        //Adding scene to the stage
        newWindow.setScene(scene);

        //Displaying the contents of the stage
        newWindow.show();

    }
}