/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandidatePackage;

import HomePagePackage.ApplicationConfirmation;
import java.sql.*;

/**
 *
 * @author kunal
 */
public class NominationFiling extends javax.swing.JFrame {

    /**
     * Creates new form NominationFiling
     */
    
    private String nomination_id,user_id,election_id,constituency,party,property,pending_case="No",applicantname;
    public NominationFiling() {
        initComponents();
    }

    
    public void sql_database_insert_NominationDetails()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="INSERT INTO NominationFiling VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           prestat.setString(1, nomination_id);
           prestat.setString(2, user_id);
           prestat.setString(3, applicantname);
           prestat.setString(4, election_id);
           prestat.setString(5, constituency);
           prestat.setString(6, party);
           prestat.setString(7, property);
           prestat.setString(8, pending_case);
           prestat.setString(9, "APPROVED");
           prestat.executeUpdate();
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
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

        WelcomeLabel = new javax.swing.JLabel();
        CandidateUserIdLabel = new javax.swing.JLabel();
        ElectionIdLabel = new javax.swing.JLabel();
        ConstituencyLabel = new javax.swing.JLabel();
        PartyLabel = new javax.swing.JLabel();
        PropertyLabel = new javax.swing.JLabel();
        CourtLabel = new javax.swing.JLabel();
        CandidateUserIdField = new javax.swing.JTextField();
        ElectionIdField = new javax.swing.JTextField();
        ConstituencyField = new javax.swing.JTextField();
        PartyNameField = new javax.swing.JTextField();
        PropertyField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        ApplicantNameLabel = new javax.swing.JLabel();
        ApplicantNameField = new javax.swing.JTextField();
        YesBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        WelcomeLabel.setText("                                Welcome To Nomination Filing Portal");

        CandidateUserIdLabel.setText("Candidate UserId");

        ElectionIdLabel.setText("ElectionId");

        ConstituencyLabel.setText("Constituency");

        PartyLabel.setText("Party");

        PropertyLabel.setText("Property(In Lakhs)");

        CourtLabel.setText("Pending Court Case Any");

        PartyNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartyNameFieldActionPerformed(evt);
            }
        });

        SubmitButton.setBackground(new java.awt.Color(62, 17, 190));
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ApplicantNameLabel.setText("Applicant Name");

        YesBox.setText("Thick This Field Only If there is Pending Case ");
        YesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ElectionIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(ConstituencyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(PartyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(PropertyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(CourtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(ApplicantNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(ApplicantNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ElectionIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                            .addComponent(ConstituencyField)
                                            .addComponent(PartyNameField)
                                            .addComponent(PropertyField)
                                            .addComponent(YesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CandidateUserIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(CandidateUserIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CandidateUserIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CandidateUserIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ApplicantNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApplicantNameField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ElectionIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ElectionIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConstituencyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConstituencyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PartyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PartyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PropertyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PropertyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YesBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(SubmitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PartyNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartyNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PartyNameFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        
        user_id=CandidateUserIdField.getText();
        applicantname=ApplicantNameField.getText();
        election_id=ElectionIdField.getText();
        constituency=ConstituencyField.getText();
        party=PartyNameField.getText();
        property=PropertyField.getText();
        nomination_id="NOM"+user_id;
        sql_database_insert_NominationDetails();
        dispose();
        new ApplicationConfirmation(nomination_id,"Nomination Filing").setVisible(true);
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void YesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesBoxActionPerformed
        // TODO add your handling code here:
        pending_case="Yes";
    }//GEN-LAST:event_YesBoxActionPerformed

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
            java.util.logging.Logger.getLogger(NominationFiling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NominationFiling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NominationFiling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NominationFiling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NominationFiling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApplicantNameField;
    private javax.swing.JLabel ApplicantNameLabel;
    private javax.swing.JTextField CandidateUserIdField;
    private javax.swing.JLabel CandidateUserIdLabel;
    private javax.swing.JTextField ConstituencyField;
    private javax.swing.JLabel ConstituencyLabel;
    private javax.swing.JLabel CourtLabel;
    private javax.swing.JTextField ElectionIdField;
    private javax.swing.JLabel ElectionIdLabel;
    private javax.swing.JLabel PartyLabel;
    private javax.swing.JTextField PartyNameField;
    private javax.swing.JTextField PropertyField;
    private javax.swing.JLabel PropertyLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JCheckBox YesBox;
    // End of variables declaration//GEN-END:variables
}
