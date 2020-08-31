package Debugmode;

public class Debug {

    public static boolean OnDebugmode(){

        boolean debug = true;

        return debug;
    }

    public static void checkAndPrint(boolean related, String text){

        if (related == true){

            System.out.println(text);

        }

    }

}
