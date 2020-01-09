/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Walton
 */
public class DatabaseConnection {
    protected Connection Connection;
    public Connection getConnection() throws SQLException{
        final String ConnectionString="jdbc:mysql://localhost/hospitalmanagement";
        try{
            Class.forName("com.mysql.jdbc.driver");
        }
        catch(ClassNotFoundException ex){
            
        }
        Connection=DriverManager.getConnection(ConnectionString,"root","");
        return Connection;
        
    }
}
