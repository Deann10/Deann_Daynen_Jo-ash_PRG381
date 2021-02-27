package BusinessLogicLayer;

<<<<<<< HEAD

    import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("PRG.1.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  
}
=======
import java.util.Scanner;

public class Admin {
>>>>>>> 89438e9ff3b3e1431b817362a9c64e0c014593dd
    
    String adminName = "Raheal";
    String password = "1234";

    public void Login(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter admin name: ");
            String _adminName = scanner.nextLine();

            System.out.print(" Enter password: ");
            String _password = scanner.nextLine();

            if (adminName.equals(_adminName) && password.equals(_password)) {
                System.out.println(" User successfully logged-in.. ");
            } else {
                System.out.println(" In valid userName of password ");
            }
        }
    }

    public void Logout(){
        //To do
    }

    public void GetBookings(){
        //To do
    }
}
