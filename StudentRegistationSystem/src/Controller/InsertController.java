/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.PaymentDetails;
import View.PaymentDetails1;
import View.StudentRegForm;
import com.sun.javafx.geom.transform.BaseTransform.Degree;
import java.util.jar.Attributes.Name;
import javax.swing.JOptionPane;



public class InsertController {
    
   
    public static void AddLecture(String LName, String Age, String gender, String Degree, String lec, String Nationality){
    
        //int con = Integer.parseInt(Contact);
        new Model.AddRecord().LectureDetails(LName,Age,gender,Degree,lec,Nationality);
        JOptionPane.showMessageDialog(null, "New Recode has been Added","Successfull", JOptionPane.INFORMATION_MESSAGE);
        
    } 
    
    public static void AddCoures(String Degree,String Credit, String Duration, String Fee,String code){
        
        new Model.AddRecord().CourseDetails(Degree,Credit, Duration,  Fee, code);
        JOptionPane.showMessageDialog(null, "New Recode has been Added","Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void RegStu(String Name, String ContactNo, String Adress, String dob, String NIC, String Gender, String Degree, String Deuration, String DegreeType, String email, String payment ){
        
       /* if(Name.length()== 0|| ContactNo.length()==0 || Adress.length()==0 || dob.length()==0 || NIC.length()==0 || Gender.length()==0 || Degree.length() == 0 || Deuration.length()==0 || DegreeType.length()==0 || email.length()==0 || payment.length()==0){
            JOptionPane.showMessageDialog(null, " Insufficient values ","Error", JOptionPane.ERROR_MESSAGE); 
            StudentRegForm n = new StudentRegForm();
            n.setVisible(true);
            
        }
        
 
    else{*/
        new Model.AddRecord().RegDetails( Name, ContactNo, Adress, dob, NIC, Gender, Degree, Deuration, DegreeType, email,payment);
        JOptionPane.showMessageDialog(null, "New Recode has been Added","Successfull", JOptionPane.INFORMATION_MESSAGE);
       PaymentDetails1 s = new PaymentDetails1();
       s.setVisible(true);
      //  }   
}

    
     public static void CreateNewStd(String FName,String LName,String UName, String PW, String PW1){
        
       // new Model.AddRecord().NewStdDetails(FName,LName,UName, PW, PW1);
        //JOptionPane.showMessageDialog(null, "New Recode has been Added","Successfull", JOptionPane.INFORMATION_MESSAGE);
    
        if(UName.equals(UName)&&PW.equals(PW1)){
            String pass = PW;
           // int Tele = Integer.parseInt(Contact);
            new Model.AddRecord().NewStdDetails(FName,LName,UName, pass);
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }
        else{    
            JOptionPane.showMessageDialog(null, " Invalid Password ","Error", JOptionPane.ERROR_MESSAGE); 
        }
     
     }
     public static void CreateAdmin(String FName,String LName,String Position, String Email, String UserName, String pw1, String pw2){
        
       // new Model.AddRecord().NewStdDetails(FName,LName,UName, PW, PW1);
        //JOptionPane.showMessageDialog(null, "New Recode has been Added","Successfull", JOptionPane.INFORMATION_MESSAGE);
    
        if(pw1.equals(pw2)){
            String pass1 = pw1;
           // int Tele = Integer.parseInt(Contact);
            new Model.AddRecord().NewAdminDetails(FName,LName,Position, Email,UserName,pass1);
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }
        else{    
            JOptionPane.showMessageDialog(null, " Invalid Password ","Error", JOptionPane.ERROR_MESSAGE); 
        }
     
     }
    
   }


    

