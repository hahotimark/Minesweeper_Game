package sample;

import Controller.ButtonListener;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LostView {


    public void start(Stage lostWindow) throws Exception{



        GridPane gridPane = new GridPane();

        //Set layout
        //Setting size for the pane
        gridPane.setMinSize(300, 300);

        //Setting the padding
        //gridPane.setPadding(new Insets(10, 20, 10, 20));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        Text text2 = new Text("Ohh NOO!!! YOU LOST GAME! YOU ARE NOOB!");
        gridPane.add(text2, 0, 1);

        ButtonListener count = new ButtonListener();

        int step = count.clickCounter();

        Text text3 = new Text( "You are lost " + step + " with steps!");
        gridPane.add(text3, 0, 2);

        Button newGame = new Button("New Game");

        gridPane.add(newGame, 0, 3);


        //Creating a scene object
        Scene scene = new Scene(gridPane);

        System.out.println("\n Make scene...");

        //Setting title to the Stage
        Stage stage;
        lostWindow.setTitle("Minesweeper");

        //Adding scene to the stage
        lostWindow.setScene(scene);

        //Displaying the contents of the stage
        lostWindow.show();

    }
}