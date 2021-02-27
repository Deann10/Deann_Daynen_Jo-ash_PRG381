package DataAccessLayer;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.List;
import BusinessLogicLayer.*;

public class ReadData 
{
    public List<Client> clients = new ArrayList<Client>();
    public List<Event> events = new ArrayList<Event>();
    public List<Menu> menus = new ArrayList<Menu>(); 

    public ReadData() {
      try {
        File myObj = new File("BookingDetails.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine(); 
          //Split the fields up into an array     
          String[] seperatedData = data.split(",");
          
          clients.add(new Client(seperatedData[0],seperatedData[1],seperatedData[2],seperatedData[3]));

          events.add(new Event(seperatedData[4],seperatedData[5],seperatedData[6],seperatedData[7]));

          menus.add(new Menu(seperatedData[8],seperatedData[9],seperatedData[10],seperatedData[11]));

          System.out.println(data);
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }

    public List<Event> getEvents() {
      return events;
    }

    public List<Client> getClients() {
      return clients;
    }

    public List<Menu> getMenus(){
        return menus;
    }
}

