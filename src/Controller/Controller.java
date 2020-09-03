package Controller;

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
/*
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
                /** CREATE NOISE *
                // Click the other empty cells!
                field.setText("E");
                field.setStyle("-fx-background-color: #f2eb16; ");
            }

        }

    }
}

 */

}