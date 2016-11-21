import java.util.ArrayList;

/**
 * Class for a single event
 */

public class Event implements Comparable<Event> {

    private int id; //event id
    private int x; //x coordinate
    private int y; //y coordinate
    private ArrayList<Ticket> tickets = new ArrayList<>(); //tickets for the event
    private String cheapest_info; //information about the cheapest ticket available
    public int distance; //distance from user set point


    public Event(int id, int x, int y, double[] prices) {

        this.id = id;
        this.x = x;
        this.y = y;

        for(double price : prices) {
            //create new tickets with prices passed to the object and add the to array of tickets
            Ticket ticket = new Ticket(this.id, price);
            tickets.add(ticket);
        }

        this.cheapest_info = this.get_cheapest();
    }

    //working out distance from the user-set point
    public void set_distance(int x, int y) {

        //computing Manhattan distance
        this.distance = Math.abs(x - this.x) + Math.abs(y - this.y);
    }

    private String get_cheapest() {

        double price; //buffer ticket price

        if(tickets.size() == 0) { //if no tickets added for an event
            return "no tickets available";
        }
        else {
            price = 50; //set zero as cheapest

            for (Ticket ticket : this.tickets) { //if any other cheaper - overwrite
                if (ticket.get_price() < price) {
                    price = ticket.get_price();
                }
            }

            return "$"+price; //return price in US dollar format
        }
    }
    //print event's data
    public void print_event() {

        System.out.printf("Event %03d - %s, Distance %d\n", this.id,this.cheapest_info,this.distance);
    }

    //custom method for comparing events by distance
    public int compareTo (Event compare_event) {
        int compare_distance = compare_event.distance;
        int distance = this.distance;

        return distance - compare_distance;
    }
}