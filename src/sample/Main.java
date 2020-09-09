package sample;

import Controller.GameTable;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {


        GameTable gt = new GameTable();

        View gameOn = new View();
        gameOn.start(stage, gt);




    }
}
