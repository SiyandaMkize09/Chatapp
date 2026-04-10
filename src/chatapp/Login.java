/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;
/// * @author SIYANDA
public class Login {
    //method to handle login
 public static void loginUser(){
     System.out.println("");//You can add username or passord logic here
 }
 public static void main(String[]args){
     Login.loginUser();
 
 }
  
        
    
    //this are variables for the user
    private final String username;
    private final String password;
    private final String phone_number;
    private final String firstName;
    private final String lastName;
    
   
    //CONSTRUCTOR
    //Will run when you create a login object
 public Login(String username, String password, String phone_number, String firstName, String lastName){
    this.username = username;
    this.password = password;
    this.phone_number = phone_number;
    this.firstName = firstName;
    this.lastName = lastName;
 }

//check username
 //Name must contain "_" and not more then 5  
 public boolean checkUserName() {
     return username.contains("_")&& username.length()<=5;
 }
 //Check password complexity
 //Password must have atleast 8 characters
 //Also must contain a capital letter, number and a special character
 public boolean checkPasswordComplexity() {
     boolean hasUppercase = false;
     boolean hasDigit = false;
     boolean hasSPCharacter = false;
     //loop through each character in the password
     for(int S = 0; S < password.length();S++) {
         
     //get the character at postion S
         char MK = password.charAt(S);
          
         if
                 
    //check if the character is an uppercase(capital letter)(A-Z)
                 (Character.isUpperCase(MK)){
                   hasUppercase = true;
         }else if
                 
    //Check if the character is a number(0-9)
                 (Character.isDigit(MK)){
                   hasDigit = true;
         }else if
                 (Character.isLetterOrDigit(MK)){
                    hasSPCharacter = true;
         }
     }
 return password.length()>= 8 && hasUppercase && hasDigit && hasSPCharacter;
 }
 //Check phone number
 //Phone number must start with +27 and must have 12 digits in total
  public boolean checkPhone_Number(){
      return
              phone_number.startsWith("+27") && phone_number.length()==12;
  }
  //Register user
  //Confirms all details before registering
  public String RegisterUser(){
      //Check username
      if(!checkUserName()){
          return "Username is not correctly formatted. It must contain'_' and be no more than 5 characters";
      }
      if(!checkPasswordComplexity()){
          return "Password is not correctly formatted. It must be at least 8 characters, contain a capital latter, number, and special character ";
      }
      //Check phone number
      if(!checkPhone_Number()) {
          return "Phone number is incorrectly formatted. It must start with +27 and be 12 digits.";
      }
      //if all the checks pass
      return "Username successfully captured.And password successfully captured. And phone number successfully added";
  } 
  //Login check
  //Will compare input with stored username & password and checks if it matches the ones stored
  //.equals is used to compare strings
  public boolean loginUsername(String inputUsername, String inputPassword){
      return
              this.username.equals(inputUsername) &&
              this.password.equals(inputPassword);
  //return true only if username & password are correct
    }
  //this is the login message
  //returns maessage based on the login results
  public String returnLoginStatus(boolean status, String firstName, String lastName){
      if(status){
  //this method returns a meesage based on whether login was succesful or not
          return"Welcome"+ firstName+""+lastName+",it is great to see you again";
      }
      else{
          return " Username or password is incorrect, please try again.";
      }
    }
  }
  
  
         