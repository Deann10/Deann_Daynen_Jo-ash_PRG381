package BusinessLogicLayer;

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
    
}
