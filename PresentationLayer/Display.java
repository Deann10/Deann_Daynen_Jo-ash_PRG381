package PresentationLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import BusinessLogicLayer.*;
 
public class Display {

     Scanner scanner = new Scanner(System.in);

        boolean bool = false;
        int a = 0;  

    public int mainMenu() 
    {
        while (!bool) {
            System.out.println("Welcome!!");
            System.out.println("Already a user ?\n1 - Yes\n2 - No");
            a = scanner.nextInt();

            if (a == 1 || a == 2) {
                bool = true;
            } else
                System.out.println("That was not a valid input");

        }
        return a;
    }

    public int AdminMenu() 
    {

        System.out.println(" Welcome Raheal.");
        System.out.println("Menu Items\n1 - View Bookings\n2 - Exit");

        int a = scanner.nextInt();

        if (a == 1 || a == 2 || a == 3) 
        {
            bool = true;
        } else
            System.out.println("That was not a valid input");
        return a;
    }

    public int ClientMenu() 
    {
        System.out.println("Menu Items\n1 - View Booking\n2 - Make Booking\n3");
        System.out.println("================================");

        int a = scanner.nextInt();

        if (a == 1 || a == 2 || a == 3 || a == 4) 
        {
            bool = true;
        } else
            System.out.println("That was not a valid input");
        return a;
    }

    public int EditBookingMenu() 
    {
        boolean flag = true;
        int a = 0;

        while (flag) 
        {
            System.out.println("Make Booking:");
            System.out.println("Booking Options \n1 - Edit Date\n2 - Edit Number Of People\n3 - Delete Booking");
            a = scanner.nextInt();

            if (a == 1 || a == 2 || a == 3) 
            {
                flag = false;
            } else
                flag = true;
        }
        return a;
    }

    public List<String> BookingMenu() 
    {
        List<String> bookingMenu = new ArrayList<>();

        System.out.println("Make Booking");

        System.out.println("Enter Name: ");
        bookingMenu.add(scanner.next());

        System.out.println("Enter Date: <DD/MM/YYYY>");
        bookingMenu.add(scanner.next());

        System.out.println("\nType of Event?");
        bookingMenu.add(scanner.next());

        System.out.println("Enter number of people at event: ");
        bookingMenu.add(scanner.next());

        return bookingMenu;
    }

    public List<String> FoodMenu() throws FileNotFoundException 
    {
        List<String> foodMenu = new ArrayList<>();
        boolean bool = true;

        while (bool) 
        {
            System.out.println("Choose food:");

            System.out.println("What dish do you want?");
            foodMenu.add(scanner.next());

            String line = "Item: ";

            line += scanner.next();

            System.out.println("How much?");

            line += "Amount: " + scanner.next();

            foodMenu.add(line);
            
            System.out.println("\nWant to order More? \n1 - Yes\n2 - No");
            int opt = scanner.nextInt();

            if (opt == 1) {
                bool = true;
            }
            else bool = false;
        }

        return foodMenu;
    }

    public List<String> DecorationsMenu() throws FileNotFoundException 
    {
        List<String> decorations = new ArrayList<>();
        boolean bool = true;

        while (bool) {
            System.out.println("Choose Decorations");

            System.out.println("What decorations do you want?");
            decorations.add(scanner.next());

            String line = "Item: ";

            line += scanner.next();

            System.out.println("How much?");

            line += "Amount: " +scanner.next();

            decorations.add(line);
            
            System.out.println("\nWant to order More? \n1 - Yes\n2 - No");
            int opt = scanner.nextInt();

            if (opt == 1) 
            {
                bool = true;
            }
            else bool = false;
        }

        return decorations;
    }

    public String EventDate(){
        System.out.println("\nPlease Enter The Date : <DD/MM/YY>");
        return scanner.next();
    }

    public int TotalPrice(){
        System.out.println("\nPlease Enter The New Number Of People : ");
        return scanner.nextInt();
    }

    public int AdminViewBookings()
    {
        boolean bool = true;
        int a = 0;
        while (bool) {
            System.out.println("Choose your option Raheal.");
            System.out.println("Menu Items\n1 - View Non-Confirmed Bookings\n2 - View Confirmed Bookings");

            a = scanner.nextInt();

            if (a == 1 || a == 2) {
                bool = false;
            } else  System.out.println("That was not a valid input");
        }


        return a;

    }
}
