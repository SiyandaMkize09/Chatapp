/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SIYANDA
 */
public class Filehandler {
       public static boolean checkLogin(String username, String password){
        
        try{
            File file = new File("RegisterUser.txt");
            Scanner reader = new Scanner(file);
            while
                    (reader.hasNextLine()){
                String line = reader.nextLine();
                String[]data = line.split(",");
                
    String storedUsername = data[1];
    String storedPassword = data[2];
            if 
    (storedUsername.equals(username)&& storedPassword.equals(password)){ 
                reader.close();
                return true;
            }               
            }
            reader.close();
            
        }catch(IOException e){
            System.out.println("Error reading file");
        }
        return false;
    }
    }

