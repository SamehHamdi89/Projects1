import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {


    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        userID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PhoneNOF = new javax.swing.JTextField();
        usernameFiled = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        passwordField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Mail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        National_ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("User_ID");
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 79, -1, -1));

        userID.setName("userID"); // NOI18N
        userID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userIDKeyPressed(evt);
            }
        });
        getContentPane().add(userID, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 75, 107, -1));

        jLabel5.setText("First Name");
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 148, -1, -1));

        Fname.setName("Fname"); // NOI18N
        Fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FnameKeyPressed(evt);
            }
        });
        getContentPane().add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 140, 107, -1));

        jLabel6.setText("LastName");
        jLabel6.setName("jLabel6"); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 217, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Register");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 17, -1, -1));

        lastName.setName("lastName"); // NOI18N
        lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastNameKeyPressed(evt);
            }
        });
        getContentPane().add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 209, 107, -1));

        jLabel2.setText("UserName");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        jLabel7.setText("Phone Number");
        jLabel7.setName("jLabel7"); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 340, -1, -1));

        jLabel3.setText("password");
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, -1));

        PhoneNOF.setName("PhoneNOF"); // NOI18N
        PhoneNOF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNOFActionPerformed(evt);
            }
        });
        PhoneNOF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneNOFKeyPressed(evt);
            }
        });
        getContentPane().add(PhoneNOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 336, 107, -1));

        usernameFiled.setName("usernameFiled"); // NOI18N
        usernameFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFiledActionPerformed(evt);
            }
        });
        usernameFiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFiledKeyPressed(evt);
            }
        });
        getContentPane().add(usernameFiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 107, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon("D:\\icons8-return-26.png")); // NOI18N
        jButton6.setName("jButton6"); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, -1, -1));

        passwordField.setName("passwordField"); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 107, -1));

        jButton2.setText("Register");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 101, 55));

        jLabel8.setText("Mail");
        jLabel8.setName("jLabel8"); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        Mail.setName("Mail"); // NOI18N
        getContentPane().add(Mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 100, -1));

        jLabel9.setText("National_ID");
        jLabel9.setName("jLabel9"); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        National_ID.setName("National_ID"); // NOI18N
        getContentPane().add(National_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userIDKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Fname.requestFocus();
        }

    }//GEN-LAST:event_userIDKeyPressed

    private void FnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FnameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            lastName.requestFocus();
        }

    }//GEN-LAST:event_FnameKeyPressed

    private void lastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            PhoneNOF.requestFocus();
        }
    }//GEN-LAST:event_lastNameKeyPressed

    private void PhoneNOFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNOFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_PhoneNOFActionPerformed

    private void PhoneNOFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNOFKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            usernameFiled.requestFocus();
        }
    }//GEN-LAST:event_PhoneNOFKeyPressed

    private void usernameFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFiledActionPerformed

    private void usernameFiledKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFiledKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            passwordField.requestFocus();
        }
    }//GEN-LAST:event_usernameFiledKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String username = usernameFiled.getText().trim();
        String password = passwordField.getText().trim();
        String id = userID.getText().trim();
        String name = Fname.getText().trim();
        String LastName = lastName.getText().trim();
        String Phoneno = PhoneNOF.getText().trim();
        String mail = Mail.getText().trim();
        String national_id = National_ID.getText().trim();
        
        if("".equals(username) || "".equals(password) || "".equals(id) || "".equals(name)|| "".equals(LastName) || "".equals(Phoneno) || "".equals(mail) || "".equals(national_id)){
            JOptionPane.showMessageDialog(null, "All Fields are required");
        }
        int ID = parseInt(id);
        int PhoneNo = parseInt(Phoneno);
        
        
        if(RegisterController.addUserInfo(ID,name,LastName,mail,PhoneNo,national_id,username, password));
        {
            JOptionPane.showMessageDialog(null, "Successfully registered");
            new Login().setVisible(true);
            this.setVisible(false);
        }

        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Mail;
    private javax.swing.JTextField National_ID;
    private javax.swing.JTextField PhoneNOF;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField userID;
    private javax.swing.JTextField usernameFiled;
    // End of variables declaration//GEN-END:variables
}
