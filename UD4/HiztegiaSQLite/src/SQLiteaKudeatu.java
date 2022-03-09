
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodriguez.markel
 */
public class SQLiteaKudeatu {
     /*public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\rodriguez.markel\\Documents\\GitHub\\program21-22\\UD4\\HiztegiaSQLite\\src\\db\\Hiztegia.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
     */
    
     private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:\\Users\\rodriguez.markel\\Documents\\GitHub\\program21-22\\UD4\\HiztegiaSQLite\\src\\db\\Hiztegia.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
     public void selectAll(){
        String sql = "SELECT id, euskaraz, gazteleraz FROM Terminoak";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("euskaraz") + "\t" +
                                   rs.getString("gazteleraz"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
