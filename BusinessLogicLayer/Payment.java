package BusinessLogicLayer;

public class Payment {
    
    int Input = Integer.parseInt( JOptionPane.showInputDialog("Please enter 1 for cash, 2 for eft 3 for card") ); 
    if ( input == 1) { 
        System.out.println("Payment in full done in cash");
    }

    if ( input == 2 ){ 
        System.out.println("Bank : FNB");
        System.out.println("Branch code : 12345");
        System.out.println("Account number : 123456789");

    }
    if ( input == 3) { 
        System.out.println("Card payment done on site. );
    }
    
    
}
