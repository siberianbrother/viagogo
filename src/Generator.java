import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Class that generates random seed data
 */

public class Generator {

    public ArrayList<Event> events = new ArrayList<>();
    private int events_number;


    public Generator(int x, int y) {

        //random number of events
        this.events_number = ThreadLocalRandom.current().nextInt(1, 31);

        for (int i = 0; i < events_number; i++) { //for each  event
            //random number of tickets
            int tickets_number = ThreadLocalRandom.current().nextInt(0, 11);
            double[] tickets = new double[tickets_number];

            for (int j = 0; j < tickets_number; j++) { //construct array of ticket prices
                double price = ThreadLocalRandom.current().nextDouble(0.1, 51);
                tickets[j] = Math.round(price * 100.0) / 100.0;;
            }

            //generate event with id, random tickets and random position
            Event event = new Event(i,ThreadLocalRandom.current().nextInt(-10, 11),ThreadLocalRandom.current().nextInt(-10, 11),tickets);
            //calculate distance form point set by user
            event.set_distance(x,y);
            //add event to array of events
            events.add(event);
        }
    }
}
