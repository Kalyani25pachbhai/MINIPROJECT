/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 *
 * @author kpach
 */
public class AddBugs_page extends javax.swing.JFrame {
    private Connection con;
    /**
     * Creates new form AddBugs_page
     */
    public AddBugs_page() {
        initComponents();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root1234");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to connect to the database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jtuser3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 40)); // NOI18N
        jLabel3.setText("Bug Description:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jtuser3.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jtuser3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jtuser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtuser3ActionPerformed(evt);
            }
        });
        getContentPane().add(jtuser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 540, 40));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 40)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 640, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frontend ", "Backend" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 254, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 540, 200));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 40)); // NOI18N
        jLabel7.setText("Bug Title:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 40)); // NOI18N
        jLabel8.setText("Bug Type:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, 50));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel10.setText("ADD BUGS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Click here to new account (5).png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtuser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtuser3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtuser3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
//        String bug_id=jtuser4.getText();
//        int bugIdInt = Integer.parseInt(bug_id);

        String bug_title=jtuser3.getText();
        String bug_type=(String)jComboBox1.getSelectedItem();
        String bug_desc=jTextArea1.getText();
//        Date currentDate = new Date();
       LocalDate today = LocalDate.now();
        
        // Define a date formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        // Format today's date using the formatter
        String formattedDate = today.format(formatter);
        
        // Print today's date
        System.out.println("Today's Date: " + formattedDate);


//        String dateString=currentDate.toString();
//        System.out.println(bug_id);
                System.out.println(bug_title);
        System.out.println(bug_type);
        System.out.println(bug_desc);
        System.out.println(formattedDate);

        
        if(jtuser3.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out bug title!!");
        }
        if(jTextArea1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out Bug description!!");
        }
        else{
            
           try{
              String query = "INSERT INTO bugs ( bug_title, bug_desc, bug_status, bug_type, posted_at) VALUES ( ?, ?, ?, ?, ?)";
PreparedStatement pstmt = con.prepareStatement(query);

// Set dynamic values
//pstmt.setString(1, bug_id);  // assuming 102 is the fixed bug_id
pstmt.setString(1, bug_title);
pstmt.setString(2, bug_desc);
pstmt.setString(3, "open");
pstmt.setString(4, bug_type);
pstmt.setString(5, formattedDate);

// Execute the query
//int rowsAffected = pstmt.executeUpdate();                
//                int rowsAffected = pstmt.executeUpdate();

       

        ResultSet rs = pstmt.executeQuery();
                    JOptionPane.showMessageDialog(null, "Bug added Successfully ");
           } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "An error occurred while attempting to log in: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        }
        dashboarddeveloper dash = new dashboarddeveloper();
        dash.setVisible(true);
        dash.pack();
        dash.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOpertaion(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddBugs_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBugs_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBugs_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBugs_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBugs_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jtuser3;
    // End of variables declaration//GEN-END:variables
}
