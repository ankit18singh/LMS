/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package try4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sony
 */
public class LoginPage1 extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage1
     */
    public LoginPage1() {
        initComponents();
        Label_Warning_Login.setVisible(false);
        Label_HashPassWarng_Login.setVisible(false);
        Label_HashUserIDWarng_Login.setVisible(false);
        Label_HashCategWarng_Login.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Panel_Login = new javax.swing.JPanel();
        Label_Login = new javax.swing.JLabel();
        Label_UserID_Loign = new javax.swing.JLabel();
        Label_Password_Login = new javax.swing.JLabel();
        TextField_UserID_Login = new javax.swing.JTextField();
        Label_Categ_Login = new javax.swing.JLabel();
        ComboBox_Categ_Login = new javax.swing.JComboBox();
        Button_Reset_Login = new javax.swing.JButton();
        Button_Login = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        PasswordField_Password_Login = new javax.swing.JPasswordField();
        Label_Warning_Login = new javax.swing.JLabel();
        Label_HashUserIDWarng_Login = new javax.swing.JLabel();
        Label_HashPassWarng_Login = new javax.swing.JLabel();
        Label_HashCategWarng_Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Panel_Login.setBackground(new java.awt.Color(204, 204, 204));
        Panel_Login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        Label_Login.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        Label_Login.setText("Login Form");

        Label_UserID_Loign.setFont(new java.awt.Font("Constantia", 1, 15)); // NOI18N
        Label_UserID_Loign.setText("UserID:");

        Label_Password_Login.setFont(new java.awt.Font("Constantia", 1, 15)); // NOI18N
        Label_Password_Login.setText("Password:");

        TextField_UserID_Login.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_UserID_Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Label_Categ_Login.setFont(new java.awt.Font("Constantia", 1, 15)); // NOI18N
        Label_Categ_Login.setText("Category:");

        ComboBox_Categ_Login.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        ComboBox_Categ_Login.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----- Select Category -----", "Admin", "Clerk", "Faculty", "Student" }));
        ComboBox_Categ_Login.setBorder(null);

        Button_Reset_Login.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        Button_Reset_Login.setText(" Reset");
        Button_Reset_Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button_Reset_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Reset_LoginActionPerformed(evt);
            }
        });

        Button_Login.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        Button_Login.setText("Login");
        Button_Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LoginActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 0, 51));
        jSeparator1.setPreferredSize(new java.awt.Dimension(2, 2));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        PasswordField_Password_Login.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        PasswordField_Password_Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Label_Warning_Login.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_Warning_Login.setForeground(new java.awt.Color(255, 0, 0));
        Label_Warning_Login.setText("!!Please enter valid Login Credentials!!");

        Label_HashUserIDWarng_Login.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        Label_HashUserIDWarng_Login.setForeground(new java.awt.Color(255, 0, 0));
        Label_HashUserIDWarng_Login.setText("*");

        Label_HashPassWarng_Login.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        Label_HashPassWarng_Login.setForeground(new java.awt.Color(255, 0, 0));
        Label_HashPassWarng_Login.setText("*");

        Label_HashCategWarng_Login.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        Label_HashCategWarng_Login.setForeground(new java.awt.Color(255, 0, 0));
        Label_HashCategWarng_Login.setText("*");

        javax.swing.GroupLayout Panel_LoginLayout = new javax.swing.GroupLayout(Panel_Login);
        Panel_Login.setLayout(Panel_LoginLayout);
        Panel_LoginLayout.setHorizontalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Button_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_Reset_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Warning_Login)
                            .addComponent(Label_Login))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Password_Login)
                            .addComponent(Label_Categ_Login)
                            .addComponent(Label_UserID_Loign))
                        .addGap(70, 70, 70)
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField_UserID_Login)
                            .addComponent(PasswordField_Password_Login)
                            .addComponent(ComboBox_Categ_Login, 0, 154, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_HashUserIDWarng_Login)
                            .addComponent(Label_HashPassWarng_Login)
                            .addComponent(Label_HashCategWarng_Login))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        Panel_LoginLayout.setVerticalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Label_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Warning_Login)
                .addGap(18, 18, 18)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_UserID_Loign)
                    .addComponent(TextField_UserID_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_HashUserIDWarng_Login))
                .addGap(28, 28, 28)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Password_Login)
                    .addComponent(PasswordField_Password_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_HashPassWarng_Login))
                .addGap(20, 20, 20)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Categ_Login)
                    .addComponent(ComboBox_Categ_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_HashCategWarng_Login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Reset_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        Label_Warning_Login.setVisible(false);
        Label_HashUserIDWarng_Login.setVisible(false);
        Label_HashPassWarng_Login.setVisible(false);
        Label_HashPassWarng_Login.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(Panel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(Panel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Reset_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Reset_LoginActionPerformed
        // TODO add your handling code here:
        TextField_UserID_Login.setText(null);
        PasswordField_Password_Login.setText(null);
        ComboBox_Categ_Login.setSelectedIndex(0);
        Label_Warning_Login.setVisible(false);
        Label_HashPassWarng_Login.setVisible(false);
        Label_HashUserIDWarng_Login.setVisible(false);
        Label_HashCategWarng_Login.setVisible(false);
    }//GEN-LAST:event_Button_Reset_LoginActionPerformed

    private void Button_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LoginActionPerformed

        // TODO add your handling code here:
        String uid,pass,categ;
        uid=TextField_UserID_Login.getText();
        char p[]=PasswordField_Password_Login.getPassword();
        pass=new String(p);
        categ=ComboBox_Categ_Login.getSelectedItem().toString();
        try
	{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","sagar");
            String sql="select * from login where user_id=? and user_pass=? or user_cat=?";
            PreparedStatement ps=con.prepareStatement(sql); 
            ps.setString(1, uid);
            ps.setString(2, pass);
            ps.setString(3, categ);
            ResultSet rs = ps.executeQuery();
            //int i=ps.executeUpdate();
            if(rs.next())
            {
                String cat = rs.getString("user_cat");
                String userid = rs.getString("user_id");
                String password = rs.getString("user_pass");
                String WelcomeName = rs.getString("user_name");
                if(uid.equals(userid)&& pass.equals(password) && categ.equals(cat))
                {
                    this.setVisible(false);
                    Home1Page u = new Home1Page();
                    u.setVisible(true); 
                    u.Label_WelcomeUserName.setText(WelcomeName);
                
                }
                 else
                {
                    Label_Warning_Login.setVisible(true);
                    Label_HashPassWarng_Login.setVisible(true);
                    Label_HashUserIDWarng_Login.setVisible(true);
                    Label_HashCategWarng_Login.setVisible(true);
                }
            }
	}
	catch(ClassNotFoundException e)
        {}
	catch(Exception e)
        {}

        /*Home1Page u = new Home1Page();
        u.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_Button_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LoginPage1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Login;
    private javax.swing.JButton Button_Reset_Login;
    private javax.swing.JComboBox ComboBox_Categ_Login;
    private javax.swing.JLabel Label_Categ_Login;
    private javax.swing.JLabel Label_HashCategWarng_Login;
    private javax.swing.JLabel Label_HashPassWarng_Login;
    private javax.swing.JLabel Label_HashUserIDWarng_Login;
    private javax.swing.JLabel Label_Login;
    private javax.swing.JLabel Label_Password_Login;
    private javax.swing.JLabel Label_UserID_Loign;
    private javax.swing.JLabel Label_Warning_Login;
    public javax.swing.JPanel Panel_Login;
    private javax.swing.JPasswordField PasswordField_Password_Login;
    private javax.swing.JTextField TextField_UserID_Login;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
