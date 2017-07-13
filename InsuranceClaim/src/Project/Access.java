/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mehran & Mahboobeh
 */
public class Access {
        /**
     *
     */
    public Access () {
    }
    static String ID;
    
    public static boolean logCustomer (String u, String p)
    {
        String path="customer account.txt";
        boolean found = false;
        String user;
        String pass;
        String tempID;
        

        if (u==null || p==null) {
            return false;
        }
       
        else {
            try {
                // TODO add your handling code here:
                Scanner readFile;
                    readFile = new Scanner(new File(path));
                //readFile.useDelimiter("\\s+");
                    ID=null;
                while(readFile.hasNext())
                {  
                 tempID=readFile.next();
                 user=readFile.next();
                 pass=readFile.next();
                if(u.equals(user)&& p.equals(pass))
                {
                    found=true;
                    ID=tempID;
                    break;
                }
                }
                    readFile.close();
            } 
            
            catch (FileNotFoundException ex) {
                Logger.getLogger(Access.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error 12324# conection faild");
            }
    } 
    
         if (found) { 
            return true;
        }

            else {
            return false;
        }
}

    public static String getID(){
        return ID;
    }
            
    public static boolean logEmployee (String u, String p)
    {
        String path="account.txt";
        boolean found= false;
        String user;
        String pass;
        if (u==null || p==null) {
            return false;
        }
       
        else {
            
    try {
            // TODO add your handling code here:
            Scanner readFile;
                readFile = new Scanner(new File(path));
            //readFile.useDelimiter("\\s+");
            while(readFile.hasNext())
            {
                 user=readFile.next();
                 pass=readFile.next();
            if(u.equals(user)&& p.equals(pass))
            {
                found=true;
                break;
                
            }
            }
                readFile.close();
    } 
    
        catch (FileNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error 12324# conection faild");
                     }
        }
    
         if (found) { 
            return true;
        }
            else {
            return false;
        }
}
}