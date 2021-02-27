package BusinessLogicLayer;

import java.util.Scanner;

public class Admin {
    
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
