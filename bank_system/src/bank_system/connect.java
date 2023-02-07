/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moham
 */
public class connect {
    public static Connection con;
public static Connection ConnectToSQL1(){ // to connect to SQL
try {
String url = "jdbc:sqlserver://localhost:1433;databaseName=Bank_sys";
String username ="mohamed";
String password ="123456";
con = DriverManager.getConnection(url, username,password);
System.out.println("CONNECTED");
} catch (SQLException ex) {
Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
System.out.println("Error CONNECTION");
}
return con;}
public static void Close () { // to close the connection of SQL
try { con.close();}
catch (SQLException ex) { System.out.println("ERROR Connection"); }
} 
}
