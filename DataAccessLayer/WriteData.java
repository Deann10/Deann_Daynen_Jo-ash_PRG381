package DataAccessLayer;

import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    
    public void SaveBooking(String firstname, String lastname, String phoneNumber, String email, String eventType, String eventDateandTime,
   String eventAddress, String eventTheme, int foodItem, String foodName, String foodType, String foodDescription)
   {
    try {
        FileWriter myWriter = new FileWriter("BookingDetails.txt");
        myWriter.write(firstname+","+lastname+","+phoneNumber+","+eventType+","+eventDateandTime+","+eventAddress+","
        +eventTheme+","+foodItem+","+foodName+","+foodType+","+foodDescription);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
   }
}
