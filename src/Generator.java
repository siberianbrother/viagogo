import java.util.ArrayList;

public class Generator {

    public ArrayList<Event> events = new ArrayList<>();
    private int events_number = 8;
    private int tickets_number = 3;


    public Generator(int x, int y) {

        int[] tickets1 = {40,50,60};
        int[] tickets2 = {41,50,60};
        int[] tickets3 = {42,50,60};
        int[] tickets4 = {43,50,60};
        int[] tickets5 = {44,50,60};
        int[] tickets6 = {45,50,60};
        int[] tickets7 = {46,50,60};
        int[] tickets8 = {47,50,60};

        Event event1 = new Event(0,0,3, tickets1);
        Event event2 = new Event(1,1,4, tickets2);
        Event event3 = new Event(2,2,2, tickets3);
        Event event4 = new Event(3,1,-1, tickets4);
        Event event5 = new Event(4,0,-3, tickets5);
        Event event6 = new Event(5,-1,-1, tickets6);
        Event event7 = new Event(6,-3,-3, tickets7);
        Event event8 = new Event(7,-4,1, tickets8);

        events.add(event1);
        events.add(event2);
        events.add(event3);
        events.add(event4);
        events.add(event5);
        events.add(event6);
        events.add(event7);
        events.add(event8);


        for (Event event : events) //calculate distance form point set by user
        {
            event.set_distance(x,y);
        }

    }




}
