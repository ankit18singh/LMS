/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package try4;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sony
 */
public class ReportWindow extends javax.swing.JFrame {
public DefaultTableModel tmasgmntrep;
public DefaultTableModel tmtestrep;
    /**
     * Creates new form ReportWindow
     */
    public ReportWindow() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel_AttndnceRep = new javax.swing.JPanel();
        Label_Attndence_ProgRep = new javax.swing.JLabel();
        TextField_Attendence_Rep = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Panel_TestRep = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table_TestRep = new javax.swing.JTable();
        Panel_ProgRep = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        Panel_AssgmntRep = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_AsgmntRep = new javax.swing.JTable();
        Label_Name_StdRep = new javax.swing.JLabel();
        Label_ID_StdRep = new javax.swing.JLabel();
        TextField_Name_StdRep = new javax.swing.JTextField();
        TextField_ID_StdRep = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Report");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        Panel_AttndnceRep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        Label_Attndence_ProgRep.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_Attndence_ProgRep.setText("Attendence:");

        TextField_Attendence_Rep.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_Attendence_Rep.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel2.setText("%");

        jLabel13.setFont(new java.awt.Font("Constantia", 1, 15)); // NOI18N
        jLabel13.setText("Attendence Report");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Panel_AttndnceRepLayout = new javax.swing.GroupLayout(Panel_AttndnceRep);
        Panel_AttndnceRep.setLayout(Panel_AttndnceRepLayout);
        Panel_AttndnceRepLayout.setHorizontalGroup(
            Panel_AttndnceRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AttndnceRepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_AttndnceRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_AttndnceRepLayout.createSequentialGroup()
                        .addComponent(Label_Attndence_ProgRep)
                        .addGap(51, 51, 51)
                        .addComponent(TextField_Attendence_Rep, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(Panel_AttndnceRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        Panel_AttndnceRepLayout.setVerticalGroup(
            Panel_AttndnceRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AttndnceRepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_AttndnceRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Attndence_ProgRep)
                    .addComponent(TextField_Attendence_Rep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Attendence Report", Panel_AttndnceRep);

        Panel_TestRep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 15)); // NOI18N
        jLabel18.setText("Test Report");

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));

        Table_TestRep.setModel(new javax.swing.table.DefaultTableModel());
        Object colheads11[] = {
            "                 S.No.", "                 Subject", "                 Test", "                 Marks"};
        Object rows11[][] = {{},{}};
        tmtestrep = new javax.swing.table.DefaultTableModel();
        tmtestrep.addColumn(colheads11[0]);
        tmtestrep.addColumn(colheads11[1]);
        tmtestrep.addColumn(colheads11[2]);
        tmtestrep.addColumn(colheads11[3]);
        Table_TestRep.setModel(tmtestrep);
        Table_TestRep.setCellSelectionEnabled(true);
        Table_TestRep.setEnabled(true);
        jScrollPane4.setViewportView(Table_TestRep);

        javax.swing.GroupLayout Panel_TestRepLayout = new javax.swing.GroupLayout(Panel_TestRep);
        Panel_TestRep.setLayout(Panel_TestRepLayout);
        Panel_TestRepLayout.setHorizontalGroup(
            Panel_TestRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TestRepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_TestRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(295, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        Panel_TestRepLayout.setVerticalGroup(
            Panel_TestRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TestRepLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel18)
                .addGap(2, 2, 2)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Test Report", Panel_TestRep);

        Panel_ProgRep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel19.setFont(new java.awt.Font("Constantia", 1, 15)); // NOI18N
        jLabel19.setText("Progress Report");

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout Panel_ProgRepLayout = new javax.swing.GroupLayout(Panel_ProgRep);
        Panel_ProgRep.setLayout(Panel_ProgRepLayout);
        Panel_ProgRepLayout.setHorizontalGroup(
            Panel_ProgRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProgRepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_ProgRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        Panel_ProgRepLayout.setVerticalGroup(
            Panel_ProgRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProgRepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Progress Report", Panel_ProgRep);

        Panel_AssgmntRep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel17.setFont(new java.awt.Font("Constantia", 1, 15)); // NOI18N
        jLabel17.setText("Assignment Report");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        Table_AsgmntRep.setModel(new javax.swing.table.DefaultTableModel());
        Object colheads10[] = {
            "                 S.No.", "                 Subject", "                 Assignment", "                 Marks"};
        Object rows10[][] = {{},{}};
        tmasgmntrep = new javax.swing.table.DefaultTableModel();
        tmasgmntrep.addColumn(colheads10[0]);
        tmasgmntrep.addColumn(colheads10[1]);
        tmasgmntrep.addColumn(colheads10[2]);
        tmasgmntrep.addColumn(colheads10[3]);
        Table_AsgmntRep.setModel(tmasgmntrep);
        Table_AsgmntRep.setCellSelectionEnabled(true);
        Table_AsgmntRep.setEnabled(true);
        jScrollPane3.setViewportView(Table_AsgmntRep);

        javax.swing.GroupLayout Panel_AssgmntRepLayout = new javax.swing.GroupLayout(Panel_AssgmntRep);
        Panel_AssgmntRep.setLayout(Panel_AssgmntRepLayout);
        Panel_AssgmntRepLayout.setHorizontalGroup(
            Panel_AssgmntRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AssgmntRepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_AssgmntRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AssgmntRepLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel_AssgmntRepLayout.setVerticalGroup(
            Panel_AssgmntRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AssgmntRepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(4, 4, 4)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Assignment Report", Panel_AssgmntRep);

        Label_Name_StdRep.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_Name_StdRep.setText("Name:");

        Label_ID_StdRep.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        Label_ID_StdRep.setText("Student ID:");

        TextField_Name_StdRep.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_Name_StdRep.setEnabled(false);

        TextField_ID_StdRep.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        TextField_ID_StdRep.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        jLabel16.setText("Student Report");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_ID_StdRep)
                                    .addComponent(Label_Name_StdRep))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField_Name_StdRep, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField_ID_StdRep, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 232, Short.MAX_VALUE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Name_StdRep)
                    .addComponent(TextField_Name_StdRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_ID_StdRep)
                    .addComponent(TextField_ID_StdRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jScrollBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String sid = TextField_ID_StdRep.getText();
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","sagar");
            String sql1 = "select * from assignmentmarks where s_id=?";
            PreparedStatement ps1 = con1.prepareStatement(sql1);
            ps1.setString(1, sid);
            ResultSet rs1 = ps1.executeQuery();
            ResultSetMetaData rd1 = rs1.getMetaData();
            int col1 = rd1.getColumnCount();
            while(rs1.next())
            {
                Object [] rowData1 = new Object[col1];
                for(int i = 1; i < rowData1.length; ++i)
                {
                    if(i==1)
                    {
                        rowData1[i] = rs1.getObject("subject");
                    }
                    else if(i==2)
                    {
                        rowData1[i] = rs1.getObject("ASSIGNMENT_NAME_AND_NUMBER");
                    }
                    else if(i==3)
                    {
                        rowData1[i] = rs1.getObject("marks");
                    }
                    else
                    {}
                }
                tmasgmntrep.addRow(rowData1);
                tmasgmntrep.addRow(rowData1);
            }
        }
        catch(ClassNotFoundException e)
        {}
        catch(Exception e)
        {}
        Table_AsgmntRep.setModel(tmasgmntrep);
        int rowcount=0;
        for(int r=0;r<Table_AsgmntRep.getRowCount();++r)
        {
            tmasgmntrep.setValueAt(++rowcount,r,0);
        }
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","sagar");
            String sql1 = "select * from result where s_id=?";
            PreparedStatement ps1 = con1.prepareStatement(sql1);
            ps1.setString(1, sid);
            ResultSet rs1 = ps1.executeQuery();
            ResultSetMetaData rd1 = rs1.getMetaData();
            int col1 = rd1.getColumnCount();
            while(rs1.next())
            {
                Object [] rowData1 = new Object[col1];
                for(int i = 1; i < rowData1.length; ++i)
                {
                    if(i==1)
                    {
                        rowData1[i] = rs1.getObject("subject");
                    }
                    else if(i==2)
                    {
                        rowData1[i] = rs1.getObject("test_id");
                    }
                    else if(i==3)
                    {
                        rowData1[i] = rs1.getObject("marks");
                    }
                    else
                    {}
                }
                tmtestrep.addRow(rowData1);
                tmtestrep.addRow(rowData1);
            }
        }
        catch(ClassNotFoundException e)
        {}
        catch(Exception e)
        {}
        Table_TestRep.setModel(tmtestrep);
        int rowcount1=0;
        for(int r=0;r<Table_TestRep.getRowCount();++r)
        {
            tmtestrep.setValueAt(++rowcount1,r,0);
        }
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","sagar");
            String sql = "select count(*) from attendance where p1='1' and p2='1' and p3='1' and p4='1' and p5='1' and p6='1' and p7='1'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        }
        catch(ClassNotFoundException e)
        {}
        catch(Exception e)
        {}
    }//GEN-LAST:event_formWindowOpened

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

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
            java.util.logging.Logger.getLogger(ReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ReportWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Label_Attndence_ProgRep;
    private javax.swing.JLabel Label_ID_StdRep;
    public javax.swing.JLabel Label_Name_StdRep;
    public javax.swing.JPanel Panel_AssgmntRep;
    public javax.swing.JPanel Panel_AttndnceRep;
    public javax.swing.JPanel Panel_ProgRep;
    public javax.swing.JPanel Panel_TestRep;
    public javax.swing.JTable Table_AsgmntRep;
    public javax.swing.JTable Table_TestRep;
    public javax.swing.JTextField TextField_Attendence_Rep;
    public javax.swing.JTextField TextField_ID_StdRep;
    public javax.swing.JTextField TextField_Name_StdRep;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
