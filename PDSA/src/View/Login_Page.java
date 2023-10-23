/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.dbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Yasiru
 */
public class Login_Page extends javax.swing.JFrame {

    /**
     * Creates new form Admin_logIn_page
     */
    public Login_Page() {
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

        lbl_DisplayLogin = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        pf_password = new javax.swing.JPasswordField();
        btn_SignIn = new javax.swing.JButton();
        lbl_accountStatus = new javax.swing.JLabel();
        lbl_signup = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        lblwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_DisplayLogin.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lbl_DisplayLogin.setText("LOG IN");
        getContentPane().add(lbl_DisplayLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 270, 70));

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 280, 50));

        pf_password.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(pf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 280, 50));

        btn_SignIn.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn_SignIn.setText("SIGN IN");
        btn_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignInActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 280, 50));

        lbl_accountStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_accountStatus.setText("Don't Have An Account");
        getContentPane().add(lbl_accountStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        lbl_signup.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_signup.setText("SIGN UP");
        lbl_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_signupMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 150, -1));

        lblpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblpassword.setText("PASSWORD");
        getContentPane().add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 50));

        lblusername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblusername.setText("USERNAME");
        getContentPane().add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 150, 110, 60));

        lblwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SignIn.jpg"))); // NOI18N
        getContentPane().add(lblwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignInActionPerformed
        
        String username,Password;
        username=txt_username.getText();
        Password=pf_password.getText();
          try
            {
            Statement st=dbConnection.createDbConnection().createStatement();
            String sql="Select * from user where username='"+username+"' and Password='"+Password+"' ";
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
              Home h1 = new Home();
              h1.setVisible(true);
              this.setVisible(false);
            }
            else
            {
             Login_Page login_Page=new Login_Page();
             login_Page.setVisible(true);
             this.setVisible(false);
            }
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
          
        
        
    }//GEN-LAST:event_btn_SignInActionPerformed

    private void lbl_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_signupMouseClicked
        // TODO add your handling code here:
        SignUp al=new SignUp();
        al.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_signupMouseClicked

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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SignIn;
    private javax.swing.JLabel lbl_DisplayLogin;
    private javax.swing.JLabel lbl_accountStatus;
    private javax.swing.JLabel lbl_signup;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel lblwallpaper;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}