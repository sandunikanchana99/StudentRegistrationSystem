/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UPEKA
 */
public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome1
     */
    public AdminHome() {
        initComponents();
    }
        public void ViewAllCourseDetails(){
        
       ViewAllCoures s = new ViewAllCoures();
        ResultSet r = new Model.DBSearch().ViewCourse();
        DefaultTableModel dtm = (DefaultTableModel)s.CourseT.getModel();
        dtm.setRowCount(0); // set the number of rows in the model
        
        try{
            Vector v;
            while (r.next()){
                
                v = new Vector();
                v.add(r.getString("DegreeProgramme"));
                v.add(r.getString("Credit"));
                v.add(r.getString("TimeDuration"));
                v.add(r.getString("CourseFee"));
                v.add(r.getString("CourseCode"));
               // v.add(r.getString("LectureType"));
               // v.add(r.getString("NIC"));
                dtm.addRow(v); // add a row to the end of the model   
            }
            DBConnection.closeCon();
        }
        catch (SQLException e){
        }
        s.setVisible(true);
        super.dispose();
    }
        
    public void ViewAllLectureDetails(){
        
        ViewAllLecture ld = new ViewAllLecture();
        ResultSet r = new Model.DBSearch().ViewLec();
        DefaultTableModel dtm = (DefaultTableModel)ld.viewLecTable.getModel();
        dtm.setRowCount(0); // set the number of rows in the model
        
        try{
            Vector v;
            while (r.next()){
                v = new Vector();
                v.add(r.getString("LectureName"));
                v.add(r.getString("LectureAge"));
                v.add(r.getString("LectureGender"));
                v.add(r.getString("DegreeProgramme"));
                v.add(r.getString("LectureType"));
                v.add(r.getString("NIC"));
                dtm.addRow(v); // add a row to the end of the model   
            }
            DBConnection.closeCon();
        }
        catch (SQLException e){
        }
        ld.setVisible(true);
        super.dispose();
    }
    
        public void ViewAllstdDetails(){
        
        ViewAllStd std = new ViewAllStd();
        ResultSet r = new Model.DBSearch().ViewStu();
        DefaultTableModel dtm = (DefaultTableModel)std.ViewStudentTable.getModel();
        dtm.setRowCount(0); // set the number of rows in the model
        
        try{
            Vector v;
            while (r.next()){
                v = new Vector();
                v.add(r.getString("Name"));
                v.add(r.getString("ContactNo"));
                v.add(r.getString("Address"));
                v.add(r.getString("Date"));
                v.add(r.getString("NIC"));
                v.add(r.getString("Gender"));
                v.add(r.getString("DegreeProgramme"));
                v.add(r.getString("Diuration"));
                v.add(r.getString("DegreeType"));
                v.add(r.getString("Email"));
                v.add(r.getString("pay"));
                dtm.addRow(v); // add a row to the end of the model   
            }
            DBConnection.closeCon();
        }
        catch (SQLException e){
        }
        std.setVisible(true);
        super.dispose();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel9 = new javax.swing.JPanel();
        BtnLogOut7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnLogOut7.setBackground(new java.awt.Color(255, 255, 0));
        BtnLogOut7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        BtnLogOut7.setText("Log out");
        BtnLogOut7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogOut7ActionPerformed(evt);
            }
        });
        jPanel9.add(BtnLogOut7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 660, -1, 40));

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));
        jPanel4.setForeground(new java.awt.Color(0, 51, 153));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("A Home for your Higher ");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Education");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 111));

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("Home");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 149, 146, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ccap2.jpeg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 371, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel3.setText("Student Registation");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 467, 186, 28));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-books-emoji-90.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 224, 119, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-forgot-password-90.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 487, 84, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-lecturer-90.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 487, 113, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-ours-90.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 224, 98, -1));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel8.setText("Courses Details");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 325, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel9.setText("Reset Student Password");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 585, 226, 32));

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel10.setText("Lectures Details");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 595, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel11.setText("View All Student");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 325, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 750, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLogOut7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogOut7ActionPerformed
        // TODO add your handling code here:
        AdminLogin am = new AdminLogin();
        am.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_BtnLogOut7ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
         StudentRegForm1 sb = new StudentRegForm1();
        sb.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
           ViewAllCourseDetails();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
         ViewAllLectureDetails();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
         ViewAllstdDetails();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
         StudForget f = new StudForget();
        f.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogOut7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
