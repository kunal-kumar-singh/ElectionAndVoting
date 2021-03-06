/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kunal
 */
package VoterPackage;

import RatingsAndFeedback.RatingAndFeedbackPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class VotingPage extends javax.swing.JFrame {

    /**
     * Creates new form VotingPage
     */
    
    private String userid,voter_name,password,constituency,electionid,string,applicantname,partyname,selectedcandidate,candidateid;
    private ArrayList<String> candidateids = new ArrayList<String>();
    private boolean allowvoting=true;
    private boolean didvoting=false;
    public VotingPage(String userid,String voter_name,String password) {
        initComponents();
        this.userid=userid;
        this.voter_name=voter_name;
        this.password=password;
        UserIdResultLabel.setText(userid);
        NameResultLabel.setText(voter_name);
        sql_database_get_constituency_query();
        ConstituencyResultLabel.setText(constituency);
        sql_database_get_electionid_query();
        ElectionIdResultLabel.setText(electionid);
        CandidateBox.removeAllItems();
        sql_database_get_candidate_query();
    }
    
    public VotingPage() {
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
        UserIdResultLabel = new javax.swing.JLabel();
        NameResultLabel = new javax.swing.JLabel();
        ConstituencyResultLabel = new javax.swing.JLabel();
        UserIdLabel = new javax.swing.JLabel();
        VoterNameLabel = new javax.swing.JLabel();
        ConstituencyLabel = new javax.swing.JLabel();
        CandidateBox = new javax.swing.JComboBox<>();
        SelectCandidateLabel = new javax.swing.JLabel();
        SelectionResultLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        ElectionIdLabel = new javax.swing.JLabel();
        ElectionIdResultLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        RateAndSubmitFeedbackButton = new javax.swing.JButton();
        ImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        WelcomeLabel.setText("                        Welcome To Voting Portal");

        UserIdLabel.setText("Voter userid");

        VoterNameLabel.setText("Voter Name");

        ConstituencyLabel.setText("Constituency");

        CandidateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CandidateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandidateBoxActionPerformed(evt);
            }
        });

        SelectCandidateLabel.setText("Select Candidate");

        SubmitButton.setBackground(new java.awt.Color(63, 126, 50));
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ElectionIdLabel.setText("ElectionId");

        BackButton.setBackground(new java.awt.Color(62, 17, 190));
        BackButton.setText("BackToProfile");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        RateAndSubmitFeedbackButton.setBackground(new java.awt.Color(240, 108, 10));
        RateAndSubmitFeedbackButton.setText("Rate And Submit Feedback");
        RateAndSubmitFeedbackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateAndSubmitFeedbackButtonActionPerformed(evt);
            }
        });

        ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroungImage/votefinger.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ElectionIdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserIdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VoterNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConstituencyLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelectCandidateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ElectionIdResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UserIdResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NameResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ConstituencyResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CandidateBox, 0, 277, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SelectionResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RateAndSubmitFeedbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ElectionIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(ElectionIdResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserIdResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VoterNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConstituencyResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConstituencyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SelectCandidateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CandidateBox, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                    .addComponent(ImageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(SelectionResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(BackButton)
                    .addComponent(RateAndSubmitFeedbackButton))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CandidateBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandidateBoxActionPerformed
        // TODO add your handling code here:
        //System.out.println(CandidateBox.getSelectedIndex());
        if(CandidateBox.getSelectedIndex()>=0)
        {
        selectedcandidate = CandidateBox.getItemAt(CandidateBox.getSelectedIndex());
        candidateid=candidateids.get(CandidateBox.getSelectedIndex());
        SelectionResultLabel.setText(selectedcandidate+"Selected Having CandidateId "+candidateid);
        }
    }//GEN-LAST:event_CandidateBoxActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        sql_query_toverify_voting();
        if(allowvoting)
        {
        run_do_voting_query();
        SelectionResultLabel.setText("Voting Successful!");
        didvoting=true;
        }
        else
        {
            SelectionResultLabel.setText("You Have Already Voted to CandidateId "+candidateid);
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new VoterHomePage(userid,voter_name,password).setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void RateAndSubmitFeedbackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateAndSubmitFeedbackButtonActionPerformed
        // TODO add your handling code here:
        if(didvoting)
        {
        dispose();
        new RatingAndFeedbackPage(electionid,constituency,candidateid,selectedcandidate,userid,password,voter_name).setVisible(true);
        }
        else
        {
          SelectionResultLabel.setText("Please Vote First In Order To Proceed To Rating And Feedback Submission!");  
        }
    }//GEN-LAST:event_RateAndSubmitFeedbackButtonActionPerformed

    private void sql_database_get_constituency_query()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT Constituency FROM VoterApplication WHERE UserId = "+"'"+userid+"'"+" AND Password = "+"'"+password+"'"+" ; ";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results;
           results=prestat.executeQuery();  
           while(results.next()){
           constituency=results.getString("Constituency");                              
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
        
    }
    
    private void sql_database_get_electionid_query()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT ElectionId FROM ElectionSchedule WHERE Constituency = "+"'"+constituency+"'"+" ; ";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results;
           results=prestat.executeQuery();  
           while(results.next()){
           electionid=results.getString("ElectionId"); 
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
        
    }
    
    
    private void sql_database_get_candidate_query()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT ApplicantName,PartyName,ApplicantUserId FROM NominationFiling WHERE Constituency = "+"'"+constituency+"'"+" ; ";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results;
           results=prestat.executeQuery();  
           while(results.next()){
           applicantname=results.getString("ApplicantName");
           partyname=results.getString("PartyName");
           candidateid=results.getString("ApplicantUserId");
           string=applicantname+"   "+partyname;
           candidateids.add(candidateid);
           CandidateBox.addItem(string);
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
        
    }
    
    public void sql_query_toverify_voting()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT CandidateId FROM VotingData WHERE VoterId = "+"'"+userid+"'"+" AND ElectionId = "+"'"+electionid+"'"+" ; ";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results;
           results=prestat.executeQuery();
           while(results.next()){
           candidateid=results.getString("CandidateId");                           
           allowvoting=false;                               
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
    
    
    public void run_do_voting_query()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="INSERT INTO VotingData VALUES (?, ?, ?, ?)";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           prestat.setString(1, userid);
           prestat.setString(2, candidateid);
           prestat.setString(3, electionid);
           prestat.setString(4, constituency);
           prestat.executeUpdate();
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(VotingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VotingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VotingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VotingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VotingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> CandidateBox;
    private javax.swing.JLabel ConstituencyLabel;
    private javax.swing.JLabel ConstituencyResultLabel;
    private javax.swing.JLabel ElectionIdLabel;
    private javax.swing.JLabel ElectionIdResultLabel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel NameResultLabel;
    private javax.swing.JButton RateAndSubmitFeedbackButton;
    private javax.swing.JLabel SelectCandidateLabel;
    private javax.swing.JLabel SelectionResultLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel UserIdLabel;
    private javax.swing.JLabel UserIdResultLabel;
    private javax.swing.JLabel VoterNameLabel;
    private javax.swing.JLabel WelcomeLabel;
    // End of variables declaration//GEN-END:variables
}
