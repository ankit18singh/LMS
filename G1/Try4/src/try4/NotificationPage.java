/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package try4;

/**
 *
 * @author Sony
 */
public class NotificationPage extends javax.swing.JFrame {

    /**
     * Creates new form NotificationPage
     */
    public NotificationPage() {
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

        Panel_Notification = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_StdAdmssn = new javax.swing.JTable();
        Button_StdAdmssn = new javax.swing.JButton();
        Button_FcltyAdmssn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_FacltyAdmssn = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Notification.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Panel_Notification.setPreferredSize(new java.awt.Dimension(4, 431));

        Table_StdAdmssn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "                      S.No.", "                      Name", "                      Registration Number", "                      Date"
            }
        ));
        jScrollPane1.setViewportView(Table_StdAdmssn);

        Button_StdAdmssn.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        Button_StdAdmssn.setText("Student Admission");
        Button_StdAdmssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_StdAdmssnActionPerformed(evt);
            }
        });

        Button_FcltyAdmssn.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        Button_FcltyAdmssn.setText("Faculty Admission");

        Table_FacltyAdmssn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "                        S.No.", "                        Name", "                        Registration Number", "                        Date "
            }
        ));
        jScrollPane2.setViewportView(Table_FacltyAdmssn);

        javax.swing.GroupLayout Panel_NotificationLayout = new javax.swing.GroupLayout(Panel_Notification);
        Panel_Notification.setLayout(Panel_NotificationLayout);
        Panel_NotificationLayout.setHorizontalGroup(
            Panel_NotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NotificationLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_NotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_NotificationLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Panel_NotificationLayout.createSequentialGroup()
                        .addComponent(Button_StdAdmssn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_FcltyAdmssn)
                        .addGap(0, 188, Short.MAX_VALUE))))
        );
        Panel_NotificationLayout.setVerticalGroup(
            Panel_NotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_NotificationLayout.createSequentialGroup()
                .addGroup(Panel_NotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_StdAdmssn)
                    .addComponent(Button_FcltyAdmssn))
                .addGap(6, 6, 6)
                .addGroup(Panel_NotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(Panel_NotificationLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(Panel_Notification, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Panel_Notification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_StdAdmssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_StdAdmssnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Button_StdAdmssnActionPerformed

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
            java.util.logging.Logger.getLogger(NotificationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotificationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotificationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotificationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NotificationPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_FcltyAdmssn;
    private javax.swing.JButton Button_StdAdmssn;
    private javax.swing.JPanel Panel_Notification;
    private javax.swing.JTable Table_FacltyAdmssn;
    private javax.swing.JTable Table_StdAdmssn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
