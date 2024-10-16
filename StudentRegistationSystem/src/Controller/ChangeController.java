/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import View.ViewSingleCourse;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author UPEKA
 */
public class ChangeController {

    
     public static void AdminReset(String ID, String pass1, String pass2){
        try {
            String CID = null;
 
            ResultSet rs = new DBSearch().SerachAdmin(ID);
            //Process the Query
            while (rs.next()) {
            CID= rs.getString("UserName");
            }
 
            if (CID != null) {
                if(pass1.equals(pass2)){
                    String pass = pass2;            
                    new Model.ChangeRecorde().AdminReset(ID, pass);
                    JOptionPane.showMessageDialog(null, "Password has been reset", "Succesfull",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Passwords Doesn't match", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Invalid Username", "Error", JOptionPane.ERROR_MESSAGE);
            }
            DBConnection.closeCon();
        }
        catch (SQLException ex) {
        }
    }   
    
    

    
    
    public static void StudentPwReset(String UserID, String pw1, String pw2){
        try {
            String StdId = null;
 
            ResultSet rs = new DBSearch().SerachStd(UserID);
            //Process the Query
            while (rs.next()) {
            StdId= rs.getString("UserID");
            }
 
            if (StdId != null) {
                if(pw1.equals(pw2)){
                    String pass = pw1;            
                    new Model.ChangeRecorde().StdPwReset(UserID, pass);
                    JOptionPane.showMessageDialog(null, "Password has been reset", "Succesfull",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Passwords Doesn't match", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Invalid Username", "Error", JOptionPane.ERROR_MESSAGE);
            }
            DBConnection.closeCon();
        }
        catch (SQLException ex) {
        }
    } 
    
    public static void UpdateCourse(String code1,String code,String DegreeName, String Credit, String Diu,String fee){
        try {
            String Course = null;
            String Degree = null;
            
            //ViewSingleCourse v = new ViewSingleCourse();
          // Degree= v.CnameTF.getText();
            ResultSet rs = new DBSearch().SearchCourse1(code);
            //Process the Query
            while (rs.next()) {
            Course= rs.getString("CourseCode");
            }
 
            if (Course != null) {
                if(Course.equals(code)){
                   // String pass = pw1;            
                    new Model.ChangeRecorde().UpdateCourse(code,DegreeName, Credit, Diu, fee);
                    JOptionPane.showMessageDialog(null, "Updated Degree Programme", "Succesfull",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid ID", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Please Course ID", "Error", JOptionPane.ERROR_MESSAGE);
            }
            DBConnection.closeCon();
        }
        catch (SQLException ex) {
        }
    }
  
}
