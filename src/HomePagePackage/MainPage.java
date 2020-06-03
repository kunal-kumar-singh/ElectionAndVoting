
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

import CandidatePackage.CandidatePoliticalHistoryPage;
import ElectionPackage.ActiveElection;
import ElectionPackage.ResultPage;


public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public MainPage() {
        initComponents();
        System.out.println("MainPage");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePageRegistrationButton = new javax.swing.JButton();
        HomePageLoginButton = new javax.swing.JButton();
        ElectionAndVotingLabel = new javax.swing.JLabel();
        ActiveElectionButton = new javax.swing.JButton();
        ResultButton = new javax.swing.JButton();
        CandidateHistoryButton = new javax.swing.JButton();
        ImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(31, 117, 215));
        setForeground(new java.awt.Color(20, 75, 255));

        HomePageRegistrationButton.setBackground(new java.awt.Color(240, 108, 10));
        HomePageRegistrationButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        HomePageRegistrationButton.setText("Click Here To Register");
        HomePageRegistrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomePageRegistrationButtonActionPerformed(evt);
            }
        });

        HomePageLoginButton.setBackground(new java.awt.Color(62, 17, 190));
        HomePageLoginButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        HomePageLoginButton.setText("Click Here To Login");
        HomePageLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomePageLoginButtonActionPerformed(evt);
            }
        });

        ElectionAndVotingLabel.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        ElectionAndVotingLabel.setText("                     Election And Voting Portal");

        ActiveElectionButton.setBackground(new java.awt.Color(62, 17, 190));
        ActiveElectionButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        ActiveElectionButton.setText("Check Active Election");
        ActiveElectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActiveElectionButtonActionPerformed(evt);
            }
        });

        ResultButton.setBackground(new java.awt.Color(63, 126, 50));
        ResultButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        ResultButton.setText("Click Here To View Result");
        ResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultButtonActionPerformed(evt);
            }
        });

        CandidateHistoryButton.setBackground(new java.awt.Color(240, 108, 10));
        CandidateHistoryButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        CandidateHistoryButton.setText("Check Candidate Political History");
        CandidateHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandidateHistoryButtonActionPerformed(evt);
            }
        });

        ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroungImage/Your-Voice-Matters-Web_2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ElectionAndVotingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HomePageLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HomePageRegistrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CandidateHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActiveElectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ElectionAndVotingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(CandidateHistoryButton)
                .addGap(26, 26, 26)
                .addComponent(ActiveElectionButton)
                .addGap(36, 36, 36)
                .addComponent(ResultButton)
                .addGap(45, 45, 45)
                .addComponent(HomePageRegistrationButton)
                .addGap(37, 37, 37)
                .addComponent(HomePageLoginButton)
                .addGap(142, 142, 142))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomePageLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomePageLoginButtonActionPerformed
        // TODO add your handling code here:
       dispose();
       new LoginHomePage().setVisible(true);
    }//GEN-LAST:event_HomePageLoginButtonActionPerformed

    private void HomePageRegistrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomePageRegistrationButtonActionPerformed
        // TODO add your handling code here:
       dispose();
       new RegistrationHomePage().setVisible(true);
    }//GEN-LAST:event_HomePageRegistrationButtonActionPerformed

    private void ActiveElectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActiveElectionButtonActionPerformed
        // TODO add your handling code here:
       dispose();
       new ActiveElection().setVisible(true);
    }//GEN-LAST:event_ActiveElectionButtonActionPerformed

    private void ResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultButtonActionPerformed
        // TODO add your handling code here:
       dispose();
       new ResultPage().setVisible(true);
        
    }//GEN-LAST:event_ResultButtonActionPerformed

    private void CandidateHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandidateHistoryButtonActionPerformed
        // TODO add your handling code here:
       dispose();
       new CandidatePoliticalHistoryPage().setVisible(true);
    }//GEN-LAST:event_CandidateHistoryButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActiveElectionButton;
    private javax.swing.JButton CandidateHistoryButton;
    private javax.swing.JLabel ElectionAndVotingLabel;
    private javax.swing.JButton HomePageLoginButton;
    private javax.swing.JButton HomePageRegistrationButton;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JButton ResultButton;
    // End of variables declaration//GEN-END:variables
}
