/**
 * Class for a single event ticket
 */

public class Ticket {

    private int event_id;
    private double price;

    //initialise a ticket with event id and price
    public Ticket(int event_id, double price) {

        this.event_id = event_id;
        this.price = price;
    }

    //return price of this ticket
    public double get_price() {

        return this.price;
    }
}
