/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomePagePackage;

import VoterPackage.VoterHomePage;
import CandidatePackage.CandidateHomePage;
import java.sql.*;
/**
 *
 * @author kunal
 */
public class ApplicationStatus extends javax.swing.JFrame {

    /**
     * Creates new form VoterApplicationStatus
     */
    private String userid,name,applicationid,status,password,status_type;
    public ApplicationStatus(String userid,String voter_name,String password,String status_type) {
        initComponents();
        this.userid=userid;
        this.name=name;
        this.password=password;
        this.status_type=status_type;
        switch (status_type)
        {
            case "Voter":
             sql_database_get_Voterapplication_status_query();
             break;
            case "Candidate":
             sql_database_get_CandidateApplication_status();
             break;
              
        }
        WelcomeLabel.setText("Welcome To "+this.status_type+" Application Status");
        ApplicationIdField.setText(applicationid);
        ApplicationIdField.setEditable(false);
        VoterNameField.setText(this.name);
        VoterNameField.setEditable(false);
        StatusField.setText(status);
        StatusField.setEditable(false);
        UserIdLabel.setText(this.userid);
    }
    
    public ApplicationStatus() {
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

        WelcomeLabel = new javax.swing.JLabel();
        ApplicationIdLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        ApplicationIdField = new javax.swing.JTextField();
        VoterNameField = new javax.swing.JTextField();
        StatusField = new javax.swing.JTextField();
        ImageLabel = new javax.swing.JLabel();
        UserIdLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        WelcomeLabel.setText("                           Welcome To Application Status");

        ApplicationIdLabel.setText("ApplicationId");

        NameLabel.setText("Name");

        Status.setText("Status");

        CloseButton.setBackground(new java.awt.Color(62, 17, 190));
        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        StatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusFieldActionPerformed(evt);
            }
        });

        ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroungImage/Your-Voice-Matters-Web_2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Status, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ApplicationIdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(VoterNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(ApplicationIdField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(StatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56)
                        .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApplicationIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApplicationIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VoterNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(CloseButton)
                        .addGap(0, 156, Short.MAX_VALUE))
                    .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sql_database_get_Voterapplication_status_query()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT ApplicationId,Status FROM VoterApplication WHERE UserId = "+"'"+userid+"'"+" AND Password = "+"'"+password+"'"+" ; ";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results;
           results=prestat.executeQuery();  
           while(results.next()){
           applicationid=results.getString("ApplicationId"); 
           status=results.getString("Status");                              
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
    private void sql_database_get_CandidateApplication_status()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT ApplicationId,Status FROM CandidateApplication WHERE UserId = "+"'"+userid+"'"+" AND Password = "+"'"+password+"'"+" ; ";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results;
           results=prestat.executeQuery();  
           while(results.next()){
           applicationid=results.getString("ApplicationId"); 
           status=results.getString("Status");                              
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
    
    
    private void StatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusFieldActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        switch (status_type)
        {
            case "Voter":
             dispose();
             new VoterHomePage(userid,name,password).setVisible(true);
             break;
            case "Candidate":
             dispose();
             new CandidateHomePage(userid,name,password).setVisible(true);
             break;
              
        }
        
       
    }//GEN-LAST:event_CloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ApplicationStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApplicationIdField;
    private javax.swing.JLabel ApplicationIdLabel;
    private javax.swing.JButton CloseButton;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel Status;
    private javax.swing.JTextField StatusField;
    private javax.swing.JLabel UserIdLabel;
    private javax.swing.JTextField VoterNameField;
    private javax.swing.JLabel WelcomeLabel;
    // End of variables declaration//GEN-END:variables
}
