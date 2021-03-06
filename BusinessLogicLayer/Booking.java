package BusinessLogicLayer;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;

public class Booking {
        private int bookingID;
        private Menu menu;
        private Event event;
        private Client client;
        private Payment payment;

        private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);//system generates id

        public Booking(Menu _menu, Event _event, Client _client, Payment _payment ){
            this.bookingID = ID_GENERATOR.getAndIncrement();
            this.menu = _menu;
            this.event = _event;
            this.client = _client;
            this.payment = _payment;

        }
        public Booking(){}

        public Menu getMenu(){
            return menu;
        }

        public Event getEvent(){
            return event;
        }

        public Client getClient(){
            return client;
        }

        public Payment getPayment(){
            return payment;
        }

        public void comfirmedBookings(){

        }

        public void notComfirmedBookings(){

        }

        ArrayList<Booking> bookingList = new ArrayList<Booking>();

        public ArrayList<Booking> bookingList(){
            return bookingList;
        }
}
