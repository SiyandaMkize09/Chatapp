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
         
        while(true) {
       //this is the menu display     
            System.out.println("Menu");
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            System.out.println("choose your option");
            
            int option = input.nextInt();
            input.nextLine();
   
           switch(option){
              
               case 1: 
                  Register.RegisterUser();
                   break;
                
               case 2:
                   Login.loginUser();

    System.out.println("\n=== Login ===");

    System.out.print("Enter Username: ");
    String logUsername = input.nextLine().trim();

    System.out.print("Enter Password: ");
    String logPassword = input.nextLine().trim();

    // Use Login class now
    boolean status = Login.loginUserAuth(logUsername, logPassword);

    // Show message
    System.out.println(Login.returnLoginStatus(status));

    break;
   
               case 3:
                   System.out.println("Goodbye");
                             System.exit(1);
                             break;
               default:
             System.out.println("invalid option.");
           }
        }
    }
}
 