

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kunal
 */
package HomePagePackage;


public class RegistrationHomePage extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationHomePage
     */
    public RegistrationHomePage() {
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

        RegisterAsVoterButton = new javax.swing.JButton();
        RegisterAsCandidateButton = new javax.swing.JButton();
        RegisterAsAdminButton = new javax.swing.JButton();
        WelcomeLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegisterAsVoterButton.setBackground(new java.awt.Color(240, 108, 50));
        RegisterAsVoterButton.setText("Register as Voter");
        RegisterAsVoterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterAsVoterButtonActionPerformed(evt);
            }
        });

        RegisterAsCandidateButton.setBackground(new java.awt.Color(63, 126, 50));
        RegisterAsCandidateButton.setText("Register as Candidate");
        RegisterAsCandidateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterAsCandidateButtonActionPerformed(evt);
            }
        });

        RegisterAsAdminButton.setBackground(new java.awt.Color(62, 17, 240));
        RegisterAsAdminButton.setText("Register as Admin");
        RegisterAsAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterAsAdminButtonActionPerformed(evt);
            }
        });

        WelcomeLabel.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        WelcomeLabel.setText("                      Welcome To Registration Portal");

        BackButton.setBackground(new java.awt.Color(240, 108, 10));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroungImage/vote.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterAsAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterAsVoterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterAsCandidateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addComponent(imageLabel)))
                .addGap(103, 103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(RegisterAsVoterButton)
                        .addGap(59, 59, 59)
                        .addComponent(RegisterAsCandidateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(imageLabel)))
                .addGap(15, 15, 15)
                .addComponent(RegisterAsAdminButton)
                .addGap(42, 42, 42)
                .addComponent(BackButton)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterAsAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterAsAdminButtonActionPerformed
        // TODO add your handling code here:
       dispose();
       new Registration("Admin").setVisible(true);
    }//GEN-LAST:event_RegisterAsAdminButtonActionPerformed

    private void RegisterAsVoterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterAsVoterButtonActionPerformed
        // TODO add your handling code here:
       dispose();
       new Registration("Voter").setVisible(true);
    }//GEN-LAST:event_RegisterAsVoterButtonActionPerformed

    private void RegisterAsCandidateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterAsCandidateButtonActionPerformed
        // TODO add your handling code here:
       dispose();
       new Registration("Candidate").setVisible(true);
    }//GEN-LAST:event_RegisterAsCandidateButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
       dispose();
       new MainPage().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton RegisterAsAdminButton;
    private javax.swing.JButton RegisterAsCandidateButton;
    private javax.swing.JButton RegisterAsVoterButton;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel imageLabel;
    // End of variables declaration//GEN-END:variables
}