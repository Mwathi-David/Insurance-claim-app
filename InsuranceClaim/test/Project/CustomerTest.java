/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.io.FileNotFoundException;
import java.util.Vector;
import junit.framework.TestCase;

/**
 *
 * @author Mehran & Mahboobeh
 */
public class CustomerTest extends TestCase {
    
    public CustomerTest(String testName) {
        super(testName);
    }

    /**
     * Test of getInfo method, of class Customer.
     */
    public void testGetInfo() throws Exception {
                try
        {
            System.out.println("getInfo");

            Vector expResult = new Vector();
            // test if correct elements in a correct order is added to the vector
            expResult.add("mahboobeh");
            expResult.add("y");
            expResult.add("23/3");
            expResult.add("12341344");
            expResult.add("3/4");
            expResult.add("283456");
            expResult.add("4/2");
            expResult.add("8264");
            expResult.add("5/1");
            expResult.add("2344");
            Vector result = Customer.getInfo("2");
            assertEquals(expResult, result);
            
            // test if last content of the vector is replaced with new elements 
            expResult.removeAllElements();
            expResult.add("mehran");
            expResult.add("x");
            expResult.add("12/5");
            expResult.add("234341");
            result = Customer.getInfo("1");
            assertEquals(expResult, result);

            }
        catch (FileNotFoundException ex)
                {

                }
        try
        {
//  test  if method throws exception when there is no claim record for a particular customer
            Vector expResult = new Vector();
            expResult.removeAllElements();
            Vector result = Customer.getInfo("4");
            assertEquals(expResult, result);
            fail("FileNotFoundException was expected");
        }
        catch (FileNotFoundException ex)
                {
                }
    }
    /**
     * Test of getClaim method, of class Customer.
     */
    public void testGetClaim() {
        try
        {
            System.out.println("getClaim");

            Vector expResult = new Vector();
            // test  if correct elements in a correct order is added to the vector
            expResult.add("123456");
            expResult.add("9/8");
            Vector result = Customer.getClaim("1");
            assertEquals(expResult, result);
            
            // test if last content of vector is replaced with new elements 
            expResult.removeAllElements();
            result = Customer.getClaim("2");
            assertEquals(expResult, result);

            }
        catch (FileNotFoundException ex)
                {

                }
        try
        {
// test see if method throws exception when there is no claim record for a particular customer
            Vector expResult = new Vector();
            expResult.removeAllElements();
            Vector result = Customer.getClaim("4");
            assertEquals(expResult, result);
            fail("FileNotFoundException was expected");
        }
        catch (FileNotFoundException ex)
                {
                }
        }
    
    public void testSetClaim() {
        System.out.println("setClaim");
        String id = "3";
        String c = "3456";
        String d = "9/8";
        boolean expResult = true;
        boolean result = Customer.setClaim(id, c, d);
        assertEquals(expResult, result);
        
    }
        }
        
    
