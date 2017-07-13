/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.io.FileNotFoundException;
import junit.framework.TestCase;

/**
 *
 * @author Mehran & Mahboobeh
 */
public class AccessTest extends TestCase {
    
    public AccessTest(String testName) {
        super(testName);
    }

    /**
     * Test of logEmployee method, of class Access.
     */
    public void testLogEmployee() throws FileNotFoundException {
        System.out.println("log");
        assertFalse(Access.logEmployee(null, null));
        assertFalse(Access.logEmployee("mahboobeh", null));
        assertFalse(Access.logEmployee(null, "mahboobeh"));
        assertFalse(Access.logEmployee("mah", "mahboobeh"));
        assertFalse(Access.logEmployee("mahboobeh", "mahboo"));
        
        assertFalse(Access.logEmployee("mahboobeh", "mahboobeh"));
        
        assertTrue(Access.logEmployee("mahboobeh", "mah"));
    } 
    
    public void testLogCustomer() throws FileNotFoundException {
        System.out.println("log");
        assertFalse(Access.logCustomer(null, null));
        assertFalse(Access.logCustomer("mm", null));
        assertFalse(Access.logCustomer(null, "mm"));
        
        assertFalse(Access.logCustomer("m", "mm"));
        assertFalse(Access.logCustomer("mm", "m"));
        
        assertFalse(Access.logCustomer("nn", "nn"));
        
        assertTrue(Access.logCustomer("nn", "mm"));
    } 
    
    public void testgetID(){
        System.out.println("ID");
        if (Access.logCustomer("nn", "mm")){
            assertEquals("2", Access.getID());
        }
        if (Access.logCustomer("nn", "nn")==false){
            assertNull(Access.getID());
        }
    }
    
}
