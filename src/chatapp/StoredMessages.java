/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import java.util.ArrayList;

public class StoredMessages {

    // Array for sent messages
    public static ArrayList<String> sentMessages = new ArrayList<>();

    // Array for disregarded messages
    public static ArrayList<String> disregardedMessages = new ArrayList<>();

    // Array for stored messages
    public static ArrayList<String> storedMessages = new ArrayList<>();

    // Array for message hashes
    public static ArrayList<String> messageHashes = new ArrayList<>();

    // Array for message IDs
    public static ArrayList<String> messageIDs = new ArrayList<>();


    //Add sent messages 
    public static void addSentMessage(String message,
                                      String messageID,
                                      String messageHash) {

        sentMessages.add(message);
        messageIDs.add(messageID);
        messageHashes.add(messageHash);
    }


    //Adding discarde messages
    public static void addDisregardedMessage(String message) {

        disregardedMessages.add(message);
    }

    //Adding stored Messages
    public static void addStoredMessage(String message,
                                        String messageID,
                                        String messageHash) {


        storedMessages.add(message);
        messageIDs.add(messageID);
        messageHashes.add(messageHash);
    }


    // Display sent messages
    public static void displaySentMessages() {

        System.out.println("Sent messages");

        for (String message : sentMessages) {

            System.out.println(message);
        }
    }


    //Display stored messages
    public static void displayStoredMessages() {

        System.out.println(" Stored messages");

        for (String message : storedMessages) {

            System.out.println(message);
        }
    }


    // Display message hashes
    public static void displayHashes() {

        System.out.println("Message hashes");

        for (String hash : messageHashes) {

            System.out.println(hash);
        }
    }


    // Display message IDs
    public static void displayIDs() {

        System.out.println(" Message IDS");

        for (String id : messageIDs) {

            System.out.println(id);
        }
    }
}