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
public class ChangeRecorde {
    
    Statement stmt; 
    
    public void AdminReset(String ID, String pw){
      
        try{
            stmt =DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE adminlogin SET Password = '"+pw+"' WHERE UserName='"+ID+"' ");
        
        }
        catch(SQLException e){
        } 
    }
    
        public void StdPwReset(String UID, String pw1){
      
        try{
            stmt =DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE studentlogin SET Password = '"+pw1+"' WHERE UserID='"+UID+"' ");
        
        }
        catch(SQLException e){
        } 
    }
          public void UpdateCourse(String code,String name, String Credit,String Diu,String fee){
      
        try{
            stmt =DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE addcoures SET CourseCode = '"+code+"',DegreeProgramme = '"+name+"',Credit = '"+Credit+"',TimeDuration = '"+Diu+"',CourseFee = '"+fee+"' WHERE CourseCode='"+code+"' ");
        
        }
        catch(SQLException e){
        } 
    }
    
}
