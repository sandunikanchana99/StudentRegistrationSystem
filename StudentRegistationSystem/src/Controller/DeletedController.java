/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author UPEKA
 */
public class DeletedController {
     public static void DeleteLecture(String NIC){
        
        new Model.DeleteRecord().DeleteLec(NIC);
        JOptionPane.showMessageDialog(null, "Lecture has been deleted", "Successfull", JOptionPane.ERROR_MESSAGE);
        }
     
     public static void DeleteStudent(String UID){
        
        new Model.DeleteRecord().DeleteStd(UID);
        JOptionPane.showMessageDialog(null, "Student has been deleted", "Successfull", JOptionPane.ERROR_MESSAGE);
        }
         
     public static void DeleteCourse(String UID){
        
        new Model.DeleteRecord().DeleteCou(UID);
        JOptionPane.showMessageDialog(null, "Course has been deleted", "Successfull", JOptionPane.ERROR_MESSAGE);
        }
    
}
