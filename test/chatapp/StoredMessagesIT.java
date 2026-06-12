/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package chatapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SIYANDA
 */
public class StoredMessagesIT {
    
    public StoredMessagesIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addSentMessage method, of class StoredMessages.
     */
    @Test
    public void testAddSentMessage() {
        System.out.println("addSentMessage");
        String message = "";
        String messageID = "";
        String messageHash = "";
        StoredMessages.addSentMessage(message, messageID, messageHash);
        
        
    }

    /**
     * Test of addDisregardedMessage method, of class StoredMessages.
     */
    @Test
    public void testAddDisregardedMessage() {
        System.out.println("addDisregardedMessage");
        String message = "";
        StoredMessages.addDisregardedMessage(message);
        
        
    }

    /**
     * Test of addStoredMessage method, of class StoredMessages.
     */
    @Test
    public void testAddStoredMessage() {
        System.out.println("addStoredMessage");
        String message = "";
        String messageID = "";
        String messageHash = "";
        StoredMessages.addStoredMessage(message, messageID, messageHash);
        
        
    }

    /**
     * Test of displaySentMessages method, of class StoredMessages.
     */
    @Test
    public void testDisplaySentMessages() {
        System.out.println("displaySentMessages");
        StoredMessages.displaySentMessages();
        
        
    }

    /**
     * Test of displayStoredMessages method, of class StoredMessages.
     */
    @Test
    public void testDisplayStoredMessages() {
        System.out.println("displayStoredMessages");
        StoredMessages.displayStoredMessages();
       
        
    }

    /**
     * Test of displayHashes method, of class StoredMessages.
     */
    @Test
    public void testDisplayHashes() {
        System.out.println("displayHashes");
        StoredMessages.displayHashes();
       
        
    }

    /**
     * Test of displayIDs method, of class StoredMessages.
     */
    @Test
    public void testDisplayIDs() {
        System.out.println("displayIDs");
        StoredMessages.displayIDs();
      
    }
    
}
