/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author Sony
 */
public class StudentAdmssnAccept extends javax.swing.JFrame {

    /**
     * Creates new form StudentAdmssnAccept
     */
    public StudentAdmssnAccept() {
        initComponents();
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Test2 = new javax.swing.JLabel();
        Label_Test1 = new javax.swing.JLabel();
        Label_StdNameReport = new javax.swing.JLabel();
        TextField_RegNoStdAccpt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextField_GendStdAccpt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TextField_NameStdAccpt = new javax.swing.JTextField();
        Label_AttndnceReport1 = new javax.swing.JLabel();
        Label_AttndnceReport5 = new javax.swing.JLabel();
        TextField_SteramStdAccpt = new javax.swing.JTextField();
        TextField_YearStdAccpt = new javax.swing.JTextField();
        TextField_BranchStdAccpt = new javax.swing.JTextField();
        Label_AttndnceReport = new javax.swing.JLabel();
        Label_AttndnceReport6 = new javax.swing.JLabel();
        TextField_RollStdAccpt = new javax.swing.JTextField();
        Label_AttndnceReport7 = new javax.swing.JLabel();
        TextField_StdIDStdAccpt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Button_DoneStdAccpt = new javax.swing.JButton();
        Label_AttndnceReport2 = new javax.swing.JLabel();
        TextField_SemStdAccpt = new javax.swing.JTextField();

        setDefaultCloseOperation(Button_DoneStdAccpt.getComponentCount());
        setTitle("Admission Accepted");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Label_Test2.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_Test2.setText("Gender:");
        Label_Test2.setToolTipText("Admission Accepted");

        Label_Test1.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_Test1.setText("Registration Number:");
        Label_Test1.setToolTipText("Admission Accepted");

        Label_StdNameReport.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_StdNameReport.setText("Name:");
        Label_StdNameReport.setToolTipText("Admission Accepted");

        TextField_RegNoStdAccpt.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_RegNoStdAccpt.setToolTipText("Admission Accepted");
        TextField_RegNoStdAccpt.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        jLabel1.setText("Admission Successful");
        jLabel1.setToolTipText("Admission Accepted");

        TextField_GendStdAccpt.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_GendStdAccpt.setToolTipText("Admission Accepted");
        TextField_GendStdAccpt.setEnabled(false);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("Admission Accepted");

        TextField_NameStdAccpt.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_NameStdAccpt.setToolTipText("Admission Accepted");
        TextField_NameStdAccpt.setEnabled(false);

        Label_AttndnceReport1.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_AttndnceReport1.setText("Branch:");

        Label_AttndnceReport5.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_AttndnceReport5.setText("Year:");

        TextField_SteramStdAccpt.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_SteramStdAccpt.setEnabled(false);

        TextField_YearStdAccpt.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_YearStdAccpt.setEnabled(false);

        TextField_BranchStdAccpt.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_BranchStdAccpt.setEnabled(false);

        Label_AttndnceReport.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_AttndnceReport.setText("Stream:");

        Label_AttndnceReport6.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_AttndnceReport6.setText("Roll Number:");

        TextField_RollStdAccpt.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_RollStdAccpt.setEnabled(false);

        Label_AttndnceReport7.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_AttndnceReport7.setText("Student ID:");

        TextField_StdIDStdAccpt.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_StdIDStdAccpt.setEnabled(false);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setToolTipText("Admission Accepted");

        Button_DoneStdAccpt.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        Button_DoneStdAccpt.setText("Done");
        Button_DoneStdAccpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DoneStdAccptActionPerformed(evt);
            }
        });

        Label_AttndnceReport2.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_AttndnceReport2.setText("Semester:");

        TextField_SemStdAccpt.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_SemStdAccpt.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(Label_AttndnceReport)
                                    .addComponent(Label_AttndnceReport1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label_AttndnceReport6)
                                            .addComponent(Label_AttndnceReport7)
                                            .addComponent(Label_AttndnceReport5))
                                        .addGap(82, 82, 82)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextField_YearStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextField_StdIDStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextField_RollStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(203, 203, 203)
                                        .addComponent(Button_DoneStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 210, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_StdNameReport)
                            .addComponent(Label_Test1)
                            .addComponent(Label_Test2)
                            .addComponent(Label_AttndnceReport2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_SemStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_BranchStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_GendStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_RegNoStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_NameStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_SteramStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_StdNameReport)
                    .addComponent(TextField_NameStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Test1)
                    .addComponent(TextField_RegNoStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Test2)
                    .addComponent(TextField_GendStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_AttndnceReport)
                    .addComponent(TextField_SteramStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_AttndnceReport1)
                    .addComponent(TextField_BranchStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_AttndnceReport2)
                    .addComponent(TextField_SemStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_AttndnceReport6)
                    .addComponent(TextField_RollStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_AttndnceReport7)
                    .addComponent(TextField_StdIDStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_AttndnceReport5)
                    .addComponent(TextField_YearStdAccpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_DoneStdAccpt)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing
String coursefee;
    private void Button_DoneStdAccptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DoneStdAccptActionPerformed
        // TODO add your handling code here:
        
        String dob="",pass="",categ="",cont="",father="",parentcont="",email="",blood="",add="",fee="-";
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@LocalHost:1521:XE","SYSTEM","sagar");
            String sql1 = "select * from s_registration where regist_no=?";
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setString(1, TextField_RegNoStdAccpt.getText());
            ResultSet rs = ps1.executeQuery();
            while(rs.next())
            {
                dob=rs.getString("dob");
                pass=rs.getString("s_mobno");
                categ=rs.getString("s_category");
                cont=rs.getString("s_mobno");
                father=rs.getString("father_name");
                parentcont=rs.getString("parent_mobno");
                email=rs.getString("s_email_id");
                blood=rs.getString("s_bloodgroup");
                add=rs.getString("s_address");
            }
        }
        catch(ClassNotFoundException e)
        {}
        catch(Exception e)
        {}
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@LocalHost:1521:XE","SYSTEM","sagar");
            String sql1 = "select course_fee from course where stream=? and branch=? and sem=?";
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setString(1, TextField_SteramStdAccpt.getText());
            ps1.setString(2, TextField_BranchStdAccpt.getText());
            ps1.setString(3, TextField_SemStdAccpt.getText());
            ResultSet rs = ps1.executeQuery();
            while(rs.next())
            {
                coursefee=rs.getString("course_fee");
            }
        }
        catch(ClassNotFoundException e)
        {}
        catch(Exception e)
        {}
        try
        {
          Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con = DriverManager.getConnection("jdbc:oracle:thin:@LocalHost:1521:XE","SYSTEM","sagar");
          String sql = "insert into s_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, TextField_RollStdAccpt.getText());
          ps.setString(2, TextField_SteramStdAccpt.getText());
          ps.setString(3, TextField_NameStdAccpt.getText());
          ps.setString(4, dob);
          ps.setString(5, TextField_BranchStdAccpt.getText());
          ps.setString(6, TextField_SemStdAccpt.getText());
          ps.setString(7, TextField_StdIDStdAccpt.getText());
          ps.setString(8, pass);
          ps.setString(9, TextField_YearStdAccpt.getText());
          ps.setString(10, categ);
          ps.setString(11, cont);
          ps.setString(12, father);
          ps.setString(13, parentcont);
          ps.setString(14, TextField_GendStdAccpt.getText());
          ps.setString(15, email);
          ps.setString(16, blood);
          ps.setString(17, add);
          ps.setString(18, fee);
          ps.setString(19, TextField_RegNoStdAccpt.getText());
          ps.setString(20, coursefee);
          int i = ps.executeUpdate();
          if(i>0)
          {
              JOptionPane.showMessageDialog(this,"!!Admission Granted!!");
          }
          
        }
        catch(ClassNotFoundException e)
        {}
        catch(Exception e)
        {}
                try
        {
          Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con = DriverManager.getConnection("jdbc:oracle:thin:@LocalHost:1521:XE","SYSTEM","sagar");
          String sql = "insert into login values(?,?,?,?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, TextField_StdIDStdAccpt.getText());
          ps.setString(2, pass);
          ps.setString(3, "student");
          ps.setString(4, TextField_NameStdAccpt.getText());
          int i = ps.executeUpdate();
          if(i>0)
          {}          
        }
        catch(ClassNotFoundException e)
        {}
        catch(Exception e)
        {}
        this.setVisible(false);
    }//GEN-LAST:event_Button_DoneStdAccptActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentAdmssnAccept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAdmssnAccept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAdmssnAccept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAdmssnAccept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new StudentAdmssnAccept().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Button_DoneStdAccpt;
    private javax.swing.JLabel Label_AttndnceReport;
    private javax.swing.JLabel Label_AttndnceReport1;
    private javax.swing.JLabel Label_AttndnceReport2;
    private javax.swing.JLabel Label_AttndnceReport5;
    private javax.swing.JLabel Label_AttndnceReport6;
    private javax.swing.JLabel Label_AttndnceReport7;
    private javax.swing.JLabel Label_StdNameReport;
    private javax.swing.JLabel Label_Test1;
    private javax.swing.JLabel Label_Test2;
    public javax.swing.JTextField TextField_BranchStdAccpt;
    public javax.swing.JTextField TextField_GendStdAccpt;
    public javax.swing.JTextField TextField_NameStdAccpt;
    public javax.swing.JTextField TextField_RegNoStdAccpt;
    public javax.swing.JTextField TextField_RollStdAccpt;
    public javax.swing.JTextField TextField_SemStdAccpt;
    public javax.swing.JTextField TextField_StdIDStdAccpt;
    public javax.swing.JTextField TextField_SteramStdAccpt;
    public javax.swing.JTextField TextField_YearStdAccpt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
