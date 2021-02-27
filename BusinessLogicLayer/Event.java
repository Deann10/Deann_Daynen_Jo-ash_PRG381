package BusinessLogicLayer;

import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Event {
    
    String eventType;
    String eventDateandTime;
    String eventAddress;
    String eventTheme;

    public Event(String _eventType, String _eventDateandTime, String _eventAddress, String _eventTheme) {
        this.eventType = _eventType;
        this.eventDateandTime = _eventDateandTime;
        this.eventAddress = _eventAddress;
        this.eventTheme = _eventTheme;
    }

    public void getEventDetails() 
    {
        Scanner scanner = new Scanner(System.in);

         //get event type
        System.out.println("Type of event:");
        eventType = scanner.nextLine();

        //get the date client wants to hold event
        System.out.println("Date & Time: ");
        eventDateandTime = scanner.nextLine();

        //Get todays Date
        Date date = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
                String currentDate = dateFormat.format(date);    

        //Date in String format	  
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    Calendar calendar = Calendar.getInstance();
	    try
        {
	    //Setting the date to the given date
	       calendar.setTime(simpleDateFormat.parse(currentDate));
	    }catch(ParseException e)
        {
		    e.printStackTrace();
	    }
	    //Number of Days to add
	    calendar.add(Calendar.DAY_OF_MONTH, 15);  
    	//Date after adding the days to the given date
	    String newDate = simpleDateFormat.format(calendar.getTime());  
	    //Displaying the new Date after addition of Days
	    System.out.println("The next available date: "+ newDate);

        if(eventDateandTime == newDate)
        {
            System.out.println("Booking date available.");
            System.out.println("Event date sucessfully set.");
        }
        else
        {
            System.out.println("We do not have the date you selected available, please note that you have to place the booking 15 days in advance");
        }

        //Get address Details
        System.out.println("Event Address: ");
        eventAddress = scanner.nextLine();

        //find out about theme
        System.out.println("Do you want a theme?(Yes/No)");
        eventTheme = scanner.nextLine();

        scanner.close();
    }
}
