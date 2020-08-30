package sample;

import Elements.ElementType;
import java.util.ArrayList;
import java.util.Random;

public class Controller {

    ElementType[][] anArray = new ElementType[10][14];

    private Controller elementType;

    public Controller (Controller elementType) {

        super();
        this.elementType = elementType;
    }


    private ArrayList generateBomb() {

        ArrayList bombs = null;

        if (bombs.size() < 6) {
            //Random bombtoArray = new Random();
            bombs.add(new Random().nextInt(10));


        }
        return bombs;
    }

    protected void listIsBomb() {


    }


    protected void addContent() {


        for (int i = 0; i < 100; i++) {


            for (int j = 0; j < 100; j++) {


                anArray[i][j] = (ElementType.EMPTY);
                //System.out.print(anArray[i][j]);
            }
        }


    }
}