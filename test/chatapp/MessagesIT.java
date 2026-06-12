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
public class MessagesIT {
    
    public MessagesIT() {
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
     * Test of generateMessageID method, of class Messages.
     */
    @Test
    public void testGenerateMessageID() {
        System.out.println("generateMessageID");
        Messages instance = null;
        String expResult = "";
        String result = instance.generateMessageID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkRecipientCell method, of class Messages.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        Messages instance = null;
        boolean expResult = false;
        boolean result = instance.checkRecipientCell();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkMessageLength method, of class Messages.
     */
    @Test
    public void testCheckMessageLength() {
        System.out.println("checkMessageLength");
        Messages instance = null;
        String expResult = "";
        String result = instance.checkMessageLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of createMessageHash method, of class Messages.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        Messages instance = null;
        String expResult = "";
        String result = instance.createMessageHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sentMessages method, of class Messages.
     */
    @Test
    public void testSentMessages() {
        System.out.println("sentMessages");
        Messages instance = null;
        String expResult = "";
        String result = instance.sentMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printMessageDetails method, of class Messages.
     */
    @Test
    public void testPrintMessageDetails() {
        System.out.println("printMessageDetails");
        Messages instance = null;
        instance.printMessageDetails();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of saveMessageToJSON method, of class Messages.
     */
    @Test
    public void testSaveMessageToJSON() {
        System.out.println("saveMessageToJSON");
        Messages instance = null;
        instance.saveMessageToJSON();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of returnTotalMessages method, of class Messages.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        Messages instance = null;
        int expResult = 0;
        int result = instance.returnTotalMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMessageID method, of class Messages.
     */
    @Test
    public void testGetMessageID() {
        System.out.println("getMessageID");
        Messages instance = null;
        String expResult = "";
        String result = instance.getMessageID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNumMessages method, of class Messages.
     */
    @Test
    public void testGetNumMessages() {
        System.out.println("getNumMessages");
        Messages instance = null;
        int expResult = 0;
        int result = instance.getNumMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRecipient method, of class Messages.
     */
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        Messages instance = null;
        String expResult = "";
        String result = instance.getRecipient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMessage method, of class Messages.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Messages instance = null;
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMessageHash method, of class Messages.
     */
    @Test
    public void testGetMessageHash() {
        System.out.println("getMessageHash");
        Messages instance = null;
        String expResult = "";
        String result = instance.getMessageHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
