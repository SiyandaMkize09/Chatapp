/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatapp;

import java.util.Scanner;
//Poe Part1
public class ChatApp {
    
    public static void main(String[] args) {
   //Creating scanner object to read user input
    
    
        Scanner input = new Scanner(System.in);
        //message counter
         int totalMessages = 0;
        while(true) {
       //this is the menu display     
            System.out.println("Menu");
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3 Send message");
            System.out.println("4.Stored messages");
            System.out.println("5.Exit");
            System.out.println("choose your option");
            
            int option = input.nextInt();
            input.nextLine();
   
           switch(option){
              
               case 1: 
                  Register.RegisterUser();
                   break;
                
               case 2:
                   Login.loginUser();

    System.out.println("\n Login ");

    // Ask user for username
    System.out.print("Enter Username: ");
    String logUsername = input.nextLine().trim();

    // Ask user for password
    System.out.print("Enter Password: ");
    String logPassword = input.nextLine().trim();

    // Check login details from file
    boolean status = Login.loginUserAuth(logUsername, logPassword);

    // If details are correct
    if (status) {

        System.out.println("Login successful!");
        System.out.println("Welcome " + logUsername);

    } else {

        // If details are incorrect
        System.out.println("Username or password incorrect.");
    }

    break;
    
               case 3:
                   System.out.println("Send message");
                   totalMessages++;
                   //Recipient input must their number
                   System.out.print("Enter recipient number(+27):");
                   String recipient = input.nextLine();
                   //Message input
                   System.out.print("Enter your message");
                   String text = input.nextLine();
                   //Creating message object
                   Messages msg = new Messages(
                           totalMessages,
                           recipient,
                           text);
                   // Check recipient number
                    if (!msg.checkRecipientCell()) {

                        System.out.println(
                                "Cell phone number incorrectly formatted.");
                    }

                    // Check message length
                    System.out.println(
                            msg.checkMessageLength());

                    // Display options
                    System.out.println(
                            msg.sentMessages());

                    // Print message details
                    msg.printMessageDetails();

                    // Save message into JSON file
                    msg.saveMessageToJSON();

                    // Display total messages
                    System.out.println(
                            "Total messages sent: "
                                    + msg.returnTotalMessages());
           
                   break;
   
     case 4:
    //display mhaeding for stored messages
    System.out.println(" Stored Messages");
    //display all stored messages
    StoredMessages.displayStoredMessages();
    //display heading for IDs
    System.out.println(" Message IDS");
    //display all stored message IDs
    StoredMessages.displayIDs();
    //display heading for message hashes
    System.out.println("Mesage Hashes");
    //display all stored message hashes
    StoredMessages.displayHashes();
    break;
               case 5:
                   System.out.println("Goodbye");
                             System.exit(1);
                             break;
               default:
             System.out.println("invalid option.");
           }
        }
    }
}