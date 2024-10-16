/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author UPEKA
 */
public class DeleteRecord {
    
     Statement stmt;
    
    
    public void DeleteLec(String NIC){
         try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM addlecture WHERE NIC='"+NIC+"' ");
        }
        catch(SQLException e){
        } 
        
    }
    
        public void DeleteStd(String UID){
         try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM registernewstu WHERE NIC='"+UID+"' ");
        }
        catch(SQLException e){
        } 
        
    }
        
            public void DeleteCou(String Name){
         try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM addcoures WHERE DegreeProgramme='"+Name+"' ");
        }
        catch(SQLException e){
        } 
        
    }
 
}
