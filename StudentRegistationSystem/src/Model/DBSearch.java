/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSearch {
    
    Statement stmt;
    ResultSet rs;
    
    String nic;

    public ResultSet searchLogin(String usName) {
        try {
 
            stmt = DBConnection.getStatementConnection();
            String name = usName;
            //Execute the Query
            rs = stmt.executeQuery("SELECT * FROM studentlogin where UserID='" + name + "'");
        }   
        catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

  /* public ResultSet searchStudents(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM studentlogin");
        }
        catch(Exception e){
         }
        
        return rs;
    }*/
    public ResultSet ViewLec(){
         try {
            stmt = DBConnection.getStatementConnection();
            
            rs = stmt.executeQuery("select * from addlecture ");
            
        }
        catch(SQLException e){
        }
         return rs;
    }

    public ResultSet ViewStu(){
         try {
            stmt = DBConnection.getStatementConnection();
            
            rs = stmt.executeQuery("select * from registernewstu ");
            
        }
        catch(SQLException e){
        }
         return rs;
    }
    
    public ResultSet ViewCourse(){
         try {
            stmt = DBConnection.getStatementConnection();
            
            rs = stmt.executeQuery("select * from addcoures ");
            
        }
        catch(SQLException e){
        }
         return rs;
    }
     public ResultSet SerachAdmin(String ID){
         try {
            stmt = DBConnection.getStatementConnection();
            
            rs = stmt.executeQuery("select * from adminlogin ");
            
        }
        catch(SQLException e){
        }
         return rs;
    }
         public ResultSet SerachStd(String UID){
         try {
            stmt = DBConnection.getStatementConnection();
            
            rs = stmt.executeQuery("select * from studentlogin");
            
        }
        catch(SQLException e){
        }
         return rs;
    }
         public ResultSet Searchlec(String LNIC){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM addlecture WHERE NIC = '"+LNIC+"' ");
        }
        catch(SQLException e){     
        }    
    return rs;
    }
     public ResultSet SearchCourse(String Degree){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM addcoures WHERE DegreeProgramme = '"+Degree+"' ");
        }
        catch(SQLException e){     
        }    
    return rs;
    }
     public ResultSet setStu(String userID){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM registernewstu WHERE NIC = '"+userID+"' ");
        }
        catch(SQLException e){     
        }    
    return rs;
    }
     public ResultSet searchpay(String Upay){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM registernewstu WHERE pay = '"+Upay+"' ");
        }
        catch(SQLException e){     
        }    
    return rs;
    }
      public ResultSet SearchCourse1(String code1){
        try{
            stmt=DBConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM addcoures WHERE CourseCode = '"+code1+"' ");
        }
        catch(SQLException e){     
        }    
    return rs;
    }
         
}
