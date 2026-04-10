/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import java.util.Scanner;

public class Register {
public static void RegisterUser()
{
    Scanner input = new Scanner(System.in);
    
    System.out.println("Registration");
    
    //User input
    //Get username
    System.out.print("Enter Username:");
    String username = input.nextLine();
    
    //password input
    //ask user to enter their password
    System.out.print("Enter your password:");
    String password = input.nextLine();
    
    //Get user's phone number
    System.out.print("Enter your phone number(+27):");
    String Phone_number = input.nextLine();//Store phone number
    
    //Show message to show registration was successful
    System.out.println("User registered successfully!");
    
    //Show the entered Username
    System.out.println("Username:" + username);
    System.out.println("Password:"+ password);
    System.out.println("phonenumber:"+ Phone_number);
   }
 }
