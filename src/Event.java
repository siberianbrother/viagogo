import java.util.ArrayList;

public class Event implements Comparable<Event> {

    private int id;
    private int x;
    private int y;
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private String cheapest_info;
    public int distance;


    public Event(int id, int x, int y, int[] prices) {
        this.id = id;
        this.x = x;
        this.y = y;

        for(int price : prices) {
            Ticket ticket = new Ticket(this.id, price);
            tickets.add(ticket);
        }

        this.cheapest_info = this.get_cheapest();
    }

    public void set_distance(int x, int y) {

        this.distance = Math.abs(x - this.x) + Math.abs(y - this.y);
    }

    private String get_cheapest() {
        double price;

        if(tickets.size() == 0) { //if no tickets added for an event
            return "no tickets available";
        }
        else {
            price = this.tickets.get(1).get_price(); //set random ticket as cheapest

            for (Ticket ticket : this.tickets) { //if any other cheaper - overwrite
                if (ticket.get_price() < price) {
                    price = ticket.get_price();
                }
            }

            return "$"+price;
        }
    }

    public void print_event() {
        System.out.printf("Event %03d - %s, Distance %d\n", this.id,this.cheapest_info,this.distance);


    }

    public int compareTo (Event compare_event) {
        int compare_distance = compare_event.distance;
        int distance = this.distance;

        return distance - compare_distance;
    }
}