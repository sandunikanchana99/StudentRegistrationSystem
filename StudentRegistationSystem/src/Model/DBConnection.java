
package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
 
    static Connection conn;
    static Statement stat = null;
 
    public static Statement getStatementConnection() {
         try {
            //Establish the connection
            String url = "jdbc:mysql://localhost:3306/SDU";
            conn = DriverManager.getConnection(url, "root", "");
            //Create the connection
            stat = conn.createStatement();
        }
    
        catch (SQLException e) {
        }
        return stat;
    }

    //Close the connection
    public static void closeCon() throws SQLException {
        conn.close();
    }
    
}

