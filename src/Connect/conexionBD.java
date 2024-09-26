/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author wallc
 */
public class conexionBD {
    
    static String url = "jdbc:mysql://shared.azk.one:3306/brakeout_bodegas_poo?maxAllowedPacket=256000000";
    
    static String user = "brakeout_bodegas";
    static String password = "W@llco25";
    
    
    public static Connection conexion () {
        
        Connection cx = null;
        
        try 
        {
            cx = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa!");
        }catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
                
        return cx;
        
        
     
      
    }  
      
   
 
}
