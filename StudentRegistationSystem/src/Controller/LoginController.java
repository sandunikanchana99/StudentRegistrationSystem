
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import View.StudentRegForm;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LoginController {
    
    public static void Login(String usName, String pass) {
        try {
 
            String username = null; // initial value of the username
            String password = null; // initial value of the password
 
            ResultSet rs = new DBSearch().searchLogin(usName);
            //Process the Query
            while (rs.next()) {
            username = rs.getString("UserID"); //assign database login name to the variable
            password = rs.getString("Password"); //assign database password to the variable
            }
 
            if (username != null && password != null&&usName.equals(usName)) {
                if (password.equals(pass)) {
 
                    System.out.println("Login Successfull");
                    StudentRegForm.getFrames()[1].dispose();
                    new StudentRegForm().setVisible(true);
                 
                } 
                else{
                    JOptionPane.showMessageDialog(null, "Please check your Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else{
                JOptionPane.showMessageDialog(null, "\"Please check your User Name\"", "Error", JOptionPane.ERROR_MESSAGE);
            }
    
            DBConnection.closeCon();
        }
        catch (SQLException ex){ 
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
