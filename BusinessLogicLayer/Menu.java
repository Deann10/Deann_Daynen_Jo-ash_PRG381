package BusinessLogicLayer;

public class Menu {
    int selection;
    Scanner input = new Scanner(System.in);

    /***************************************************/

    System.out.println("Choose from these choices");
    System.out.println("-------------------------\n");
    System.out.println("Make a booking ");
    System.out.println("View all events that can be held");
    System.out.println("View all items on the menu"); 
    System.out.println("Close ");

    selection = input.nextInt();
    return selection;    
}
    
}
