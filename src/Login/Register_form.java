/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kpach
 */
public class Register_form extends javax.swing.JFrame {
    private Connection con;
    /**
     * Creates new form Register_form
     */
    public Register_form() {
        initComponents();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root1234");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to connect to the database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }// 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtuser = new javax.swing.JTextField();
        jtuser2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jtuser1 = new javax.swing.JTextField();
        jtuser3 = new javax.swing.JTextField();
        jtuser4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jButtonRegister1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtuserActionPerformed(evt);
            }
        });

        jtuser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtuser2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 153));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 0, -1, -1));

        jtuser1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jtuser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jtuser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtuser1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 490, 40));

        jtuser3.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jtuser3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jtuser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtuser3ActionPerformed(evt);
            }
        });
        getContentPane().add(jtuser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 490, 40));

        jtuser4.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jtuser4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jtuser4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtuser4ActionPerformed(evt);
            }
        });
        getContentPane().add(jtuser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 490, 40));

        jComboBox1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Developer", "Manager" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 270, 50));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jButton1.setText("Exit");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 140, 70));

        jButtonRegister.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 180, 70));

        jButtonRegister1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jButtonRegister1.setText("Login");
        jButtonRegister1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButtonRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegister1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, 190, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Untitled design (4).png"))); // NOI18N
        background.setText("jLabel6");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtuserActionPerformed

    private void jtuser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtuser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtuser1ActionPerformed

    private void jtuser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtuser2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtuser2ActionPerformed

    private void jtuser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtuser3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtuser3ActionPerformed

    private void jtuser4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtuser4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtuser4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
         try {
        String username = jtuser3.getText();
        String email = jtuser1.getText();
        String password=jtuser4.getText();
        String role= (String) jComboBox1.getSelectedItem();

        // Create SQL query to check username and password
        String query = "insert into users values(1,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        
        pstmt.setString(1, username);
        pstmt.setString(2, email);
        pstmt.setString(3, password);
        pstmt.setString(4, role);

        ResultSet rs = pstmt.executeQuery();
        JOptionPane.showMessageDialog(null, "Login Successful");


    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "An error occurred while attempting to log in: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegister1ActionPerformed
        // TODO add your handling code here:
        Login_Application reg = new Login_Application();
        reg.setVisible(true);
        
        reg.pack();
        reg.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOpertaion(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonRegister1ActionPerformed

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
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonRegister1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtuser;
    private javax.swing.JTextField jtuser1;
    private javax.swing.JTextField jtuser2;
    private javax.swing.JTextField jtuser3;
    private javax.swing.JTextField jtuser4;
    // End of variables declaration//GEN-END:variables
}
