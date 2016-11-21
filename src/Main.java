import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Input a point"); //read input string of a point
        Scanner input = new Scanner(System.in);
        String point = input.nextLine();
        input.close();

        Scanner parse = new Scanner(point); //parse the string into x and y coordinates of a point
        parse.useDelimiter(",");
        int x = parse.nextInt();
        int y = parse.nextInt();
        parse.close();

        Generator generator = new Generator(x,y);

        for (Event event : generator.events) {
            event.print_event();

        }

        System.out.printf("Closest events to (%d,%d)\n", x,y);


        Calculator calculator = new Calculator(generator.events);

        for (Event event : calculator.closest_events) {
            event.print_event();
        }


       

    }
}