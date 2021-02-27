package BusinessLogicLayer;

import java.util.Scanner;
import java.util.ArrayList;

public class Client {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String username;
    private String password;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Client(){}

    public Client(String _firstName, String _lastName, String _phoneNumber, String _email, String _username,
     String _password)
     {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.phoneNumber = _phoneNumber;
        this.email = _email;
        this.username = _username;
        this.password = _password;
     }

     ArrayList<Client> clientList = new ArrayList<Client>();//list to store client information

    ArrayList<Client> Register()
    {
        
        Client client = new Client();

        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.print(" Enter firstName: ");
             firstName = scanner.nextLine();
             client.setFirstName(firstName);

            System.out.print(" Enter lastName: ");
             lastName = scanner.nextLine();
             client.setLastName(lastName);

            System.out.print(" Enter username: ");
             username = scanner.nextLine();
             client.setUsername(username);

            System.out.print(" Enter password: ");
             password = scanner.nextLine();
             client.setPassword(password);

            System.out.print(" Enter email: ");
             email = scanner.nextLine();
             client.setEmail(email);

            System.out.print(" Enter phoneNumber: ");
             phoneNumber = scanner.nextLine();
             client.setPhoneNumber(phoneNumber);

             clientList.add(client);

             scanner.close();

            return clientList;
        }
    }

    public void Login() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to the system \n Enter your Username and Password to continue \n Username: ");
        String temp = scanner.nextLine();
        System.out.println(" Password: ");
        String temp2 = scanner.nextLine();
    
        for (int i = 0; i < clientList.size(); i++) {
            if (clientList.get(i).CheckUsername(temp) && clientList.get(i).CheckPassword(temp2))
            {
                System.out.println(" User successfully logged-in.. ");
            }
            else
            {
                System.out.println(" In valid userName of password ");
            }   
        }        
         
        scanner.close();
    }

    public Boolean CheckPassword(String password)
    {         
        return this.password.equals(password);
    }   
    
    public Boolean CheckUsername(String username) 
    {         
        return this.username.equals(username);
    }

    public void Logout()
    {
        //TO-DO
    }

}
