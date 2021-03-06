import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import BusinessLogicLayer.*;
import PresentationLayer.*;

public class App {
    public static void main(String[] args) throws IOException {
       
        Display display = new Display();
        Client client = new Client();
        Booking booking = new Booking();
        boolean login = false, register = false, admin = false, run = true;
        int option;
        String username = "";

        int opt = display.mainMenu();

        switch (opt) {
            case 1:
                {
                    while (!login) {            
                      client.Login();
                    }
                    System.out.println("Welcome");
                }
                break;
            case 2:
                {
                    while (!register) {
                        client.Register();
                    }
                    System.out.println("Welcome");
                }
                break;
        }
        
        while (run) {

            if (admin) {
                option = display.AdminMenu();
                switch (option) {
                   
                    case 1:
                        {
                            switch (display.AdminViewBookings()) {
                                case 1:
                                    {
                                        System.out.println("Not Confirmed Bookings:");
                                        booking.notComfirmedBookings();
                                    }
                                    break;
                                case 2:
                                    {
                                        System.out.println("Confirmed:");
                                        booking.comfirmedBookings();
                                    }
                                    break;
                            }
                        }
                        break;
                    case 3:
                        {
                            System.exit(0);
                        }
                        break;    
                }
            }
            else{
                option = display.ClientMenu();
                switch (option) {
                    case 1:
                        {
                            System.out.println(" Bookings:");
                            booking.bookingList();
                        }
                        break;
                    case 2:
                        {
                             display.BookingMenu();
                        }
                        break;
                    case 3:
                        {
                            System.exit(0);
                        }
                        break;  
                }
            }
        }
    }
}
