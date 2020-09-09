package Elements;

public class Element {

    private ElementType elementType;

    public Element(ElementType elementType) {
        super();
        this.elementType = elementType;
    }

    /*
        Print character
     */

    public String getElementLetter()
    {
        String letter = "";

        if(elementType == ElementType.EMPTY)
        {
            letter = "E";
        }
        else if(elementType == ElementType.BOMB)
        {
            letter = "B";
        }
        else if(elementType == ElementType.TREASURE)
        {
            letter = "T";
        }
        else if(elementType == ElementType.NOISE)
        {
            letter = "N";
        }


        return letter;
    }

    public ElementType getElementType() {
        return elementType;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }



}
