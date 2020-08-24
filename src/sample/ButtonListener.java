package sample;

public class ButtonListener {

 protected static int i = 0;


    static int clickCounter(){

        i = i + 1;

        System.out.println("Try" + i + " time");

        return i;

    }



}
