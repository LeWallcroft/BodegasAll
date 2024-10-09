/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author wallc
 */
public class PasswordUtils {
    
    public static String hashedPassword (String password){
        
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte [] hashedBytes = md.digest(password.getBytes());
            
            
            StringBuilder sb = new StringBuilder ();
            for (byte b: hashedBytes){
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
            
        }catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);                   
        
        }
        
    } 

   
    
}
