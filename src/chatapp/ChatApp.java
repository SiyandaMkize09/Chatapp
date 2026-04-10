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
                   System.out.print("Enter Username:");
                   String Username = input.nextLine(); 
                   System.out.print("Enter your password:");
                   String Password = input.nextLine();
                   
                      // Simple login check (no file handler)
    if (Username.equals("stuart") && Password.equals("1234")) {
        System.out.println("Welcome, " + Username + "!");
       
    } else {
        System.out.println("Username or password are incorrect.");
    }

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
 