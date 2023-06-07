
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;




/**
 *
 * @author EMON KABIR
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/lms","emon","1234");
           return con;
           
        }
        catch(Exception e)
        {
            System.out.println("Connection Error");
            return null;
        }
    }
    
}
