package BusinessLogicLayer;

<<<<<<< HEAD
import java.time.Duration;

public class Booking {
    int selection;
    Scanner input = new Scanner(System.in);

    /***************************************************/

    System.out.println("Choose from these choices");
    System.out.println("-------------------------\n");
    System.out.println("Book an event  ");
    System.out.println("check date availalibity ");
    System.out.println("make a payment"); 
    System.out.println("Close ");

    selection = input.nextInt();
    return selection;    

  if (selection==1 ) { 
   
    String name  = JOptionPane.showInputDialog("Please enter the Name of the booking ")
    String Event = JOptionPane.showInputDialog("Please enter type of event.")
    

  }
    if( selection == 2) { 
        date DateOfEvent = String name  = JOptionPane.showInputDialog("Date of booking ") ; 

        date current = new date() ; 
        long days = Duration.between(current, DateOfEvent) ; 
        if (days <15)  { 
            System.out.println("Date Not Available  ");
        }
        else {
            System.out.println("Date is available ");
        }
    }
    
=======
import java.util.concurrent.atomic.AtomicInteger;

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

>>>>>>> 89438e9ff3b3e1431b817362a9c64e0c014593dd
}
