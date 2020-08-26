package sample;

import Elements.Element;
import Elements.ElementType;

import javax.lang.model.util.Elements;
import java.util.Random;

public class gameTable {

    private Controller[][] gameTable;

    public gameTable(){

        gameTable = new Controller[8][8];
        createEmptyFields();
        createHero();
        createBomb();
        createTreasure();
    }

    private void createBomb(){

        int randomRow = 0;
        int randomColumn = 0;

        do {

            (new Random().nextInt(6) + 2);
            (new Random().nextInt(6) + 2);

            this.gameTable[randomColumn][randomRow] = new Elements(ElementType.BOMB);
        }while (int i =0; i == 5){

        }
    }

    private void createNoise(int valami){


    }

    private void createTreasure(){

        int randomRow = (new Random().nextInt(6) +2);
        int randomColumn = (new Random(). nextInt(6) +2);

        this.gameTable[randomColumn][randomRow] = new Elements(ElementType.TREASURE);

    }

    private void createHero(){

        this.gameTable[0][0] = new Controller(ElementType.HERO);
    }

    private void createEmptyFields(){

        for(int i = 0; i < gameTable.length; i++) {

            for (int j = 0; j < gameTable.length; j++) {
                this.gameTable[0][0] = new Controller(ElementType.EMPTY);
            }
        }
    }
}
