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

import java.awt.*;

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
        gridPane.add(text2, 1, 1);

        ButtonListener count = new ButtonListener();

        int step = count.clickCounter();

        Text text3 = new Text( "You are lost " + step + " with steps!");
        gridPane.add(text3, 2, 2);

        Button newGame = new Button("New Game");

        gridPane.add(newGame, 3, 1);




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