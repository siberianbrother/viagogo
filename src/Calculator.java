/**
 * Produces an array of 5 events that are the closest to a given point
 */

import java.util.ArrayList;
import java.util.Collections;

public class Calculator {

    ArrayList<Event> closest_events = new ArrayList<>(5);

    public Calculator(ArrayList<Event> events) {

        for(Event event : events) {

            if (closest_events.size() < 5) { //if less than 5 events, just add to the list of shortest
                closest_events.add(event);
            }
            else { //if the list is full, check if the last item in the list is further than the new event

                if(closest_events.get(4).distance > event.distance){ //if further - replace with new event
                    closest_events.set(4,event);
                }
            }

            Collections.sort(closest_events);
        }
    }


}
