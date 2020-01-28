import java.io.IOException;
import java.util.Scanner;

// log:

public class main {



    public void testKey(){


    }

    public static void main(String[] args) throws IOException {
        int x = 0;
        int y = 1;
        String totalFs = "";
        while (y == 1) {
            Scanner keyboard = new Scanner(System.in);
            logger Logger = new logger();
            x += 1;
            System.out.println("enter an integer");
            String myint = keyboard.nextLine();
            totalFs = String.valueOf(x);
            if (myint.equals("f")){
                try {
                    Logger.fatal("medium", totalFs);
                    System.out.println(myint);
                } catch (IOException e){
                    e.printStackTrace();
                    System.out.println("didnt work");
                }
            }
        }




    }
}
