package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VictoryView {


    public void start(Stage newWindow) throws Exception {


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

        Text text2 = new Text("Congratulation! You are winner!");
        gridPane.add(text2, 1, 1);

        ButtonListener count = new ButtonListener();

        Text text3 = new Text("You are win " + count.clickCounter() + " with steps!");

        gridPane.add(text2, 2, 2);


        //Creating a scene object
        Scene scene = new Scene(gridPane);

        System.out.println("\n Make scene...");

        //Setting title to the Stage
        newWindow.setTitle("Victory!");

        //Adding scene to the stage
        newWindow.setScene(scene);

        //Displaying the contents of the stage
        newWindow.show();


    }
}