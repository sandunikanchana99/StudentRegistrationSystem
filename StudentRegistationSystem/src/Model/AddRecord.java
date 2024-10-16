/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;


public class AddRecord {
    
    Statement stmt;
   
public void LectureDetails(String Lname ,String Age ,String Gender ,String Degree ,String Lecture ,String Nationality){
         try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("INSERT INTO addlecture VALUES('"+Lname+"', '"+Age+"', '"+Gender+"', '"+Degree+"','"+Lecture+"','"+Nationality+"')");
            
        }
        catch(SQLException e){
        }

    }

public void CourseDetails(String Degree,String Credit, String Duration, String Fee,String code){
    try {
        stmt = DBConnection.getStatementConnection();
        
        stmt.executeUpdate("INSERT INTO addcoures VALUES('"+Degree+"', '"+Credit+"', '"+Duration+"','"+Fee+"','"+code+"')");
    }
    catch(SQLException e){
        
    }
}
    
    public void RegDetails(String Name, String ContactNo, String Adress, String dob, String NIC, String Gender, String Degree, String Deuration, String DegreType, String email,String pay){
         try {
        stmt = DBConnection.getStatementConnection();
        
        stmt.executeUpdate("INSERT INTO registernewstu VALUES('"+Name+"', '"+ContactNo+"', '"+Adress+"','"+dob+"','"+NIC+"','"+Gender+"', '"+Degree+"', '"+Deuration+"','"+DegreType+"','"+email+"','"+pay+"')");
    }
    catch(SQLException e){
        
    }
        }
    public void NewStdDetails(String FName, String LName, String USName, String Pass){
         try {
        stmt = DBConnection.getStatementConnection();
        
        stmt.executeUpdate("INSERT INTO studentlogin VALUES('"+FName+"', '"+LName+"', '"+USName+"','"+Pass+"')");
    }
    catch(SQLException e){
        
    }
        }
    public void NewAdminDetails(String FName, String LName, String Position, String Email, String usName, String Pass1){
         try {
        stmt = DBConnection.getStatementConnection();
        
        stmt.executeUpdate("INSERT INTO adminlogin VALUES('"+FName+"', '"+LName+"', '"+Position+"', '"+Email+"', '"+usName+"','"+Pass1+"')");
    }
    catch(SQLException e){
        
    }
        }
    
}
    


    
