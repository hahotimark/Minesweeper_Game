package sample;

import java.util.Random;


import Elements.ElementType;
import Elements.Element;

public class GameTable {

    private Element[][] gameTable;


    public GameTable() {

        System.out.println("Make game table...");

        gameTable = new Element[8][8];

        /** EMPTY */
        createEmptyFields();

        /** HERO */
       // createHero();

        /** BOMB */
        createWumpus(3);

        /** TREASURE */
        createTreasure();

        draw();
    }


    /** WUMPUS */
    private void createWumpus(int wumpusNumber)
    {
        int counter = 0;

        while(counter < wumpusNumber)
        {
            int randomRow = 0;
            int randomColumn = 0;

            do
            {
                randomRow = (new Random().nextInt(6) + 2);
                randomColumn = (new Random().nextInt(6) + 2);
            } while( this.gameTable[randomRow][randomColumn].getElementType() != ElementType.EMPTY );


            this.gameTable[randomRow][randomColumn] = new Element(ElementType.BOMB);

            createNoise(randomRow, randomColumn);

            counter++;
        }
    }


    /** NOISE */
    private void createNoise(int wumpusRow, int wumpusColumn)
    {

        int topRowIndex = 0, bottomRowIndex = 0;
        int leftColumnIndex = 0, rightColumnIndex = 0;

        /** ROW */
        if(wumpusRow == 0)
        {
            /** FIRST ROW */
            topRowIndex = 0;
            bottomRowIndex = 1;
        }
        else if(wumpusRow == (this.gameTable.length -1))
        {
            /** LAST ROW */
            topRowIndex = (this.gameTable.length - 2);
            bottomRowIndex = (this.gameTable.length - 1);
        }
        else
        {
            /** MID */
            topRowIndex = (wumpusRow - 1);
            bottomRowIndex = (wumpusRow + 1);
        }

        /** COLUMN */
        if(wumpusColumn == 0)
        {
            /** FIRST COLUMN */
            leftColumnIndex = 0;
            rightColumnIndex = 1;
        }
        else if(wumpusColumn == (this.gameTable.length -1))
        {
            /** LAST COLUMN */
            leftColumnIndex = (this.gameTable.length - 2);
            rightColumnIndex = (this.gameTable.length - 1);
        }
        else
        {
            /** MID */
            leftColumnIndex = (wumpusColumn - 1);
            rightColumnIndex = (wumpusColumn + 1);
        }


        for (int row = topRowIndex; row <= bottomRowIndex; row++) {

            for (int column = leftColumnIndex; column <= rightColumnIndex; column++) {


                if(this.gameTable[row][column].getElementType() == ElementType.EMPTY)
                {
                    /** CREATE NOISE */
                    this.gameTable[row][column] = new Element(ElementType.NOISE);
                }

            }

        }
    }


    /** TREASURE */
    private void createTreasure()
    {
        int randomRow = 0;
        int randomColumn = 0;

        do
        {
            randomRow = (new Random().nextInt(6) + 2);
            randomColumn = (new Random().nextInt(6) + 2);
        } while( this.gameTable[randomRow][randomColumn].getElementType() != ElementType.EMPTY );

        this.gameTable[randomRow][randomColumn] = new Element(ElementType.TREASURE);
    }


    /** HERO */
    private void createHero()
    {
        this.gameTable[0][0] = new Element(ElementType.HERO);
    }


    /** EMPTY */
    private void createEmptyFields()
    {
        for (int i = 0; i < gameTable.length; i++) {

            for (int j = 0; j < gameTable.length; j++) {
                this.gameTable[i][j] = new Element(ElementType.EMPTY);
            }

        }
    }


    public String getCellContent(int row, int column)
    {
        return (this.gameTable[row][column].getElementLetter());
    }


    private void draw()
    {

        for (int i = 0; i < gameTable.length; i++) {

            for (int j = 0; j < gameTable.length; j++) {
                System.out.print(this.gameTable[i][j].getElementLetter() + " ");
            }
            System.out.println();
        }

    }
}


/*
package sample;

import Elements.Element;
import Elements.ElementType;

import javax.lang.model.util.Elements;
import java.util.Random;

public class GameTable {

    private Controller[][] gameTable;

    public GameTable(){

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

*/
