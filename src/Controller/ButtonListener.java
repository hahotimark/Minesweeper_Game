package Controller;

public class ButtonListener {

 public static int i = 0;

 /*
    Count filed click.
  */


  public static int clickCounter(){

        i = i + 1;

        System.out.println("Try" + i + " time");

        return i;

    }


}
