import java.util.Scanner;

/**
 * Class in charge of taking user input and ensuring it is in correct bounds
 */

public class Input_taker {

    public static int x;
    public static int y;

    public static void take_input() {

        System.out.println("Input a point"); //read input string of a point
        Scanner input = new Scanner(System.in);
        String point = input.nextLine();

        Scanner parse = new Scanner(point); //parse the string into x and y coordinates of a point
        parse.useDelimiter(",");
        Input_taker.x = parse.nextInt();
        Input_taker.y = parse.nextInt();


        while(x > 10 || y > 10 || x < -10 || y < -10) { //if outside of range
            System.out.println("Incorrect input! Values must be between -10 and 10");
            take_input(); //try once again
        }

        input.close();
        parse.close();

    }
}
