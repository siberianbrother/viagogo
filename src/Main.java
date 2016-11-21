/**
 * Coding test for viagogo implemented by German Mikulski
 */

public class Main {

    public static void main(String[] args) {

        //taking user input of a point
        Input_taker.take_input();

        //randomly generate events and tickets for them
        Generator generator = new Generator(Input_taker.x,Input_taker.y);

        System.out.printf("\nClosest events to (%d,%d):\n\n", Input_taker.x,Input_taker.y);

        //creating a list of closest events
        Calculator calculator = new Calculator(generator.events);

        //printing closest events
        for (Event event : calculator.closest_events) {
            event.print_event();
        }

    }
}