/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Messages {
    //Variable used to store message information
    private String messageID;
    private int numMessages;
    private String recipient;
    private String message;
    private String MessageHash;
    
    //Constructor used to create a new message object
    public Messages(int numMessages, String recipient, String message){
        //Assign values paseed into the constructor
      this.numMessages = numMessages;
      this.recipient = recipient;
      this.message = message;
      //Generating a unique message
      this.messageID= generateMessageID();
     this.MessageHash = createMessageHash();
     }
    //Method to generate a message ID
   public String generateMessageID() {

    Random random = new Random();

    long number =
            1000000000L
            + (long)(random.nextDouble() * 9000000000L);

    return String.valueOf(number);
}

    //  CHECK RECIPIENT 
    // Number must start with +27
    public boolean checkRecipientCell() {

        return recipient.startsWith("+27")
                &&
                recipient.length() <= 12;
    }

    //  CHECK MESSAGE LENGTH 
    // Message must be less than 250 characters
    public String checkMessageLength() {

        if (message.length() > 250) {

            return "Please enter a message "
                    + "of less than 250 characters.";

        } else {

            return "Message sent";
        }
    }
   
    public String createMessageHash(){
        //Get first 2 digits of message ID
        String firstTwo =messageID.substring(0,2);
        //Split message into words
        String[]words = message.split(" ");
        //First word in Uppercase
        String firstWord = words[0].toUpperCase();
        //Last word in uppercase
        String lastWord = words[words.length-1].toUpperCase();
        //Return formatted hash
        return firstTwo
                +":"
                +numMessages
                +":"
                +firstWord
                +lastWord;
    }
         //Message menu
    public String sentMessages(){
        return"""
              1.Send Message
              2.Disregard Message
              3.Store Message to send later
              """;
    }        
      public void printMessageDetails(){
          System.out.println("Message details");
          System.out.println("Message ID:" + messageID);
          System.out.println("Message Hash:" + MessageHash);
          System.out.println("Recipient:" + recipient);
          System.out.println("Message:" + message);
    }
//Save messages to JSON
      public void saveMessageToJSON(){
          try{
              //Open file in append mode
              FileWriter writer = new FileWriter("messages.json",true);
             // Write JSON object
            writer.write(
                    "{\n" +
                    "\"messageID\": \"" + messageID + "\",\n" +
                    "\"recipient\": \"" + recipient + "\",\n" +
                    "\"message\": \"" + message + "\",\n" +
                    "\"messageHash\": \"" + MessageHash + "\"\n" +
                    "}\n"
            );

            // Close writer
            writer.close();

            System.out.println(
                    "Message stored in JSON file.");

        } catch (IOException e) {

            System.out.println(
                    "Error saving JSON file.");
        }
    }

    // RETURN TOTAL MESSAGES
    public int returnTotalMessages() {

        return numMessages;
    }

    // GETTERS 
    public String getMessageID() {

        return messageID;
    }

    public int getNumMessages() {

        return numMessages;
    }

    public String getRecipient() {

        return recipient;
    }

    public String getMessage() {

        return message;
    }

    public String getMessageHash() {

        return MessageHash;
    }
}

  
    
    
    
   

