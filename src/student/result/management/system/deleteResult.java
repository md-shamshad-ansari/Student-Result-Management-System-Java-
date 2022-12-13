/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student.result.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohammad Irshad
 */
public class deleteResult extends javax.swing.JFrame {

    /**
     * Creates new form deleteResult
     */
    public deleteResult() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addNewStudent = new javax.swing.JButton();
        insertNewStudent = new javax.swing.JButton();
        registeredStudent = new javax.swing.JButton();
        allStudentsResults = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Result");
        setBackground(new java.awt.Color(204, 204, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addNewStudent.setBackground(java.awt.SystemColor.activeCaptionBorder);
        addNewStudent.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        addNewStudent.setText("Add New Student");
        addNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewStudentActionPerformed(evt);
            }
        });
        jPanel1.add(addNewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 230, 44));

        insertNewStudent.setBackground(java.awt.SystemColor.activeCaptionBorder);
        insertNewStudent.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        insertNewStudent.setText("Insert New Result");
        insertNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNewStudentActionPerformed(evt);
            }
        });
        jPanel1.add(insertNewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 230, 45));

        registeredStudent.setBackground(java.awt.SystemColor.activeCaptionBorder);
        registeredStudent.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        registeredStudent.setText("Registered Students");
        registeredStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredStudentActionPerformed(evt);
            }
        });
        jPanel1.add(registeredStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 289, 230, 46));

        allStudentsResults.setBackground(java.awt.SystemColor.activeCaptionBorder);
        allStudentsResults.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        allStudentsResults.setText("All Students Results");
        allStudentsResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentsResultsActionPerformed(evt);
            }
        });
        jPanel1.add(allStudentsResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 361, 230, 51));

        jButton5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/result/management/system/download.jpg"))); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 430, -1, 57));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setText("Update Result");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 43));

        jButton2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/result/management/system/image_processing20220801-17461-itiohr.png"))); // NOI18N
        jButton2.setText("Delete Result");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 44));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 500));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("Enter Roll Number");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 60));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 240, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/result/management/system/del.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 120, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 470, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminHome().setVisible(true);
    }//GEN-LAST:event_addNewStudentActionPerformed

    private void insertNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNewStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new insertNewResult().setVisible(true);
    }//GEN-LAST:event_insertNewStudentActionPerformed

    private void registeredStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new registeredStudent().setVisible(true);
    }//GEN-LAST:event_registeredStudentActionPerformed

    private void allStudentsResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentsResultsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new allStudentResult().setVisible(true);
    }//GEN-LAST:event_allStudentsResultsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null,
            "Do you want to Logout?", "Select an Option...",JOptionPane.YES_NO_OPTION);
        if(input==0){
            setVisible(false);
            new adminIndex().setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateResult().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new deleteResult().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private int string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public int getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(int string) {
        this.string = string;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String rollno = jTextField1.getText();
        if(rollno.length()==0)
            JOptionPane.showMessageDialog(null, "Please Insert the Roll number");
        else{
        int input = JOptionPane.showConfirmDialog(null,
            "Do you want to Delete Result of this Roll Number ?", "Select an Option...",JOptionPane.YES_NO_OPTION);
        if(input==JOptionPane.NO_OPTION){
            setVisible(false);
            new deleteResult().setVisible(true);
        }
        else if(input == JOptionPane.YES_OPTION){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srms", "root","786@92MySQL");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from result where Roll_No='"+rollno+"'");
                if(rs.next()){
                    st.executeUpdate("DELETE FROM result WHERE Roll_No='"+rollno+"'");
                    st.executeUpdate("DELETE FROM student WHERE Roll_No='"+rollno+"'");
                    JOptionPane.showMessageDialog(null, "Successfully Deleted");
                    setVisible(false);
                    new deleteResult().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Roll number does not exist");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(deleteResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewStudent;
    private javax.swing.JButton allStudentsResults;
    private javax.swing.JButton insertNewStudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton registeredStudent;
    // End of variables declaration//GEN-END:variables
}