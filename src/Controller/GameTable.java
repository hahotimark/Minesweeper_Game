package Controller;

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

    /*
        Show empty cell
     */

    private void createONfields(int emptyCellRow, int emptyCellColumn)
    {

        int topRowIndex = 0, bottomRowIndex = 0;
        int leftColumnIndex = 0, rightColumnIndex = 0;


        if(emptyCellRow == 0)
        {

            topRowIndex = 0;
            bottomRowIndex = 1;
        }
        else if (emptyCellRow == (this.gameTable.length -1))
        {

            topRowIndex = (this.gameTable.length - 2);
            bottomRowIndex = (this.gameTable.length - 1);
        }
        else
        {

            topRowIndex = (emptyCellRow - 1);
            bottomRowIndex = (emptyCellRow + 1);
        }


        if(emptyCellColumn == 0)
        {

            leftColumnIndex = 0;
            rightColumnIndex = 1;
        }
        else if(emptyCellColumn == (this.gameTable.length -1))
        {

            leftColumnIndex = (this.gameTable.length - 2);
            rightColumnIndex = (this.gameTable.length - 1);
        }
        else
        {

            leftColumnIndex = (emptyCellColumn - 1);
            rightColumnIndex = (emptyCellColumn + 1);
        }


        for (int row = topRowIndex; row <= bottomRowIndex; row++) {

            for (int column = leftColumnIndex; column <= rightColumnIndex; column++) {


                if(this.gameTable[row][column].getElementType() == ElementType.EMPTY)
                {
                    // Click the other empty cells!
                    //field.setText("E");
                    //field.setStyle("-fx-background-color: #f2eb16; ");
                }

            }

        }
    }
}
