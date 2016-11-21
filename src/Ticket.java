/**
 * Created by siberianbro on 20/11/16.
 */
public class Ticket {

    private int event_id;
    private double price;

    public Ticket(int event_id, double price) {

        this.event_id = event_id;
        this.price = price;
    }

    public double get_price() {

        return this.price;
    }


    public void print_ticket() {

        System.out.println("Event " + event_id + ", price " + price);
    }

}
