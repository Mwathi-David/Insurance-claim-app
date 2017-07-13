/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author Mehran & Mahboobeh
 */
public class Customer {
    
    public Customer () {
    }
    // return CUSTOMER INFO           
    public static Vector<String> getInfo(String id)throws FileNotFoundException
    {
        Vector<String> vec= new Vector<>();
        String path=id+ ".txt";
         
            Scanner readFile;
                readFile = new Scanner(new File(path));
                
            while (readFile.hasNext())
            {
                vec.add(readFile.next());
            }
                readFile.close();
        
        return vec;
        
    }   
    // return CLAIM
    public static Vector<String> getClaim(String id)throws FileNotFoundException
    {
                Vector<String> vec2= new Vector<>();
                String path2=id+ "claim.txt";

            
            Scanner readFile;
                readFile = new Scanner(new File(path2));  
                while (readFile.hasNext())
            {
                vec2.add(readFile.next());
            }
                readFile.close();
        return vec2;
    }
    
    public static boolean setClaim(String id, String c, String d){
        
        String file= id+"claim.txt";
        boolean s=false;
        try {
              BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(new File(file), true));
                        bw.write(c);
                        bw.newLine();
                        bw.write(d);
                        bw.newLine();
                        bw.write("nothandled");
                        bw.close();
                        s= true;
                } catch (Exception e) {
                    
                }
        return s;
        
    }
    
}
