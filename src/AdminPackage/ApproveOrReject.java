/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPackage;
import java.sql.*;

/**
 *
 * @author kunal
 */
public class ApproveOrReject extends javax.swing.JFrame {

    /**
     * Creates new form ApproveOrReject
     */
    private String userid,admin_name,password,applicationid,votername,father_spouse_name,age,address,constituency,originalstatus,type,candidate_name,party_name;
    public ApproveOrReject(String userid,String admin_name,String password,String type) {
        initComponents();
        this.userid=userid;
        this.admin_name=admin_name;
        this.password=password;
        this.type=type;
        WelcomeLabel.setText("Welcome To "+this.type+" Approval Or Rejection Portal");
        switch(this.type)
        {
            case "Voter":
             ConstituencyOrPartyLabel.setText("Constituency");   
             sql_database_query_get_voter_details();
             break;
            case "Candidate":
             ConstituencyOrPartyLabel.setText("Party Name");
             sql_database_query_get_admin_details();
             break;
                
        }
        setFieldValues();
    }
    
    public ApproveOrReject() {
        initComponents();
    }
    
    public void sql_database_query_get_voter_details()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT ApplicationId,VoterName,Father_SpouseName,Age,Address,Constituency,Status FROM VoterApplication WHERE Status = 'PENDING' LIMIT 1;";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results,resultcheck;
           results=prestat.executeQuery();
           resultcheck=results;
           while(results.next()){
               applicationid=results.getString("ApplicationId"); 
               votername=results.getString("VoterName");
               father_spouse_name=results.getString("Father_SpouseName");
               age=results.getString("Age");
               originalstatus=results.getString("Status");
               address=results.getString("Address");
               constituency=results.getString("Constituency");
               
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
    
    public void setFieldValues()
     {
        ApplicationIdField.setText(applicationid);
        ApplicationIdField.setEditable(false);
        switch(type){
            case "Voter":
              NameField.setText(votername);
              ConstituencyOrPartyField.setText(constituency);
              break;
            case "Candidate":
              NameField.setText(candidate_name);
              ConstituencyOrPartyField.setText(party_name);
              break;
        }
        NameField.setEditable(false);
        Father_SpouseNameField.setText(father_spouse_name);
        Father_SpouseNameField.setEditable(false);
        AgeField.setText(age);
        AgeField.setEditable(false);
        AddressField.setText(address);
        AddressField.setEditable(false);
        ConstituencyOrPartyField.setEditable(false);
        StatusField.setText(originalstatus);
        StatusField.setEditable(false);
     }
     
     
    public void sql_database_update_VoterApplication_status(String status)
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="UPDATE VoterApplication SET Status = "+"'"+status+"'"+"WHERE ApplicationId = "+"'"+applicationid+"' ;";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           prestat.executeUpdate();
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
     
    public void resetFieldValues()
     {
        ApplicationIdField.setText("");
        ApplicationIdField.setEditable(false);
        NameField.setText("");
        NameField.setEditable(false);
        Father_SpouseNameField.setText("");
        Father_SpouseNameField.setEditable(false);
        AgeField.setText("");
        AgeField.setEditable(false);
        AddressField.setText("");
        AddressField.setEditable(false);
        ConstituencyOrPartyField.setText("");
        ConstituencyOrPartyField.setEditable(false);
        StatusField.setText("");
        StatusField.setEditable(false);
        applicationid="";
        votername="";
        father_spouse_name="";
        age="";
        address="";
        constituency="";
        originalstatus="";
        candidate_name="";
        party_name="";
     }
     
    public void sql_database_query_get_admin_details()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT ApplicationId,ApplicantName,Father_SpouseName,Age,Address,PartyName,Status FROM CandidateApplication WHERE Status = 'PENDING' LIMIT 1;";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results,resultcheck;
           results=prestat.executeQuery();
           resultcheck=results;
           while(results.next()){
               applicationid=results.getString("ApplicationId"); 
               candidate_name=results.getString("ApplicantName");
               father_spouse_name=results.getString("Father_SpouseName");
               age=results.getString("Age");
               originalstatus=results.getString("Status");
               address=results.getString("Address");
               party_name=results.getString("PartyName");
               
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
    
     
    public void sql_database_update_AdminApplication_status(String status)
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="UPDATE CandidateApplication SET Status = "+"'"+status+"'"+"WHERE ApplicationId = "+"'"+applicationid+"' ;";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
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
        ApplicationIdField = new javax.swing.JTextField();
        ApplicationIdLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        Father_SpouseNameLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        ConstituencyOrPartyLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        Father_SpouseNameField = new javax.swing.JTextField();
        AgeField = new javax.swing.JTextField();
        AddressField = new javax.swing.JTextField();
        ConstituencyOrPartyField = new javax.swing.JTextField();
        ApproveButton = new javax.swing.JButton();
        RejectButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        StatusLabel = new javax.swing.JLabel();
        StatusField = new javax.swing.JTextField();
        ImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        WelcomeLabel.setText("                           Welcome To  Approval Or Rejection Portal");

        ApplicationIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplicationIdFieldActionPerformed(evt);
            }
        });

        ApplicationIdLabel.setText("ApplicationId");

        NameLabel.setText("Name");

        Father_SpouseNameLabel.setText("Father/Spouse Name");

        AgeLabel.setText("Age");

        AddressLabel.setText("Address");

        ConstituencyOrPartyLabel.setText("Constituency/Party Name");

        ApproveButton.setBackground(new java.awt.Color(63, 126, 50));
        ApproveButton.setText("Approve");
        ApproveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveButtonActionPerformed(evt);
            }
        });

        RejectButton.setBackground(new java.awt.Color(240, 17, 49));
        RejectButton.setText("Reject");
        RejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectButtonActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(62, 17, 190));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        StatusLabel.setText("Status");

        ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroungImage/vote.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ConstituencyOrPartyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Father_SpouseNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ApplicationIdLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(StatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ApplicationIdField)
                                    .addComponent(NameField)
                                    .addComponent(Father_SpouseNameField)
                                    .addComponent(AgeField)
                                    .addComponent(AddressField)
                                    .addComponent(ConstituencyOrPartyField, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                                    .addComponent(StatusField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ApproveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(RejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ApplicationIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(ApplicationIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Father_SpouseNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Father_SpouseNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ConstituencyOrPartyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ConstituencyOrPartyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(ImageLabel)))
                        .addGap(27, 27, 27)
                        .addComponent(StatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApproveButton)
                    .addComponent(RejectButton)
                    .addComponent(BackButton))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApplicationIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplicationIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApplicationIdFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new AdminHomePage(userid,admin_name,password).setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ApproveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveButtonActionPerformed
        // TODO add your handling code here:
        switch(type)
        {
            case "Voter":
             sql_database_update_VoterApplication_status("APPROVED");
             resetFieldValues();
             sql_database_query_get_voter_details();
             setFieldValues();
             break;
            case "Candidate":
             sql_database_update_AdminApplication_status("APPROVED");
             resetFieldValues();
             sql_database_query_get_admin_details();
             setFieldValues();
        }
    }//GEN-LAST:event_ApproveButtonActionPerformed

    private void RejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectButtonActionPerformed
        // TODO add your handling code here:
        switch(type)
        {
            case "Voter":
             sql_database_update_VoterApplication_status("REJECTED");
             resetFieldValues();
             sql_database_query_get_voter_details();
             setFieldValues();
             break;
            case "Candidate":
             sql_database_update_AdminApplication_status("REJECTED");
             resetFieldValues();
             sql_database_query_get_admin_details();
             setFieldValues();
        }
    }//GEN-LAST:event_RejectButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ApproveOrReject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApproveOrReject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApproveOrReject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApproveOrReject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApproveOrReject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField AgeField;
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField ApplicationIdField;
    private javax.swing.JLabel ApplicationIdLabel;
    private javax.swing.JButton ApproveButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField ConstituencyOrPartyField;
    private javax.swing.JLabel ConstituencyOrPartyLabel;
    private javax.swing.JTextField Father_SpouseNameField;
    private javax.swing.JLabel Father_SpouseNameLabel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton RejectButton;
    private javax.swing.JTextField StatusField;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel WelcomeLabel;
    // End of variables declaration//GEN-END:variables
}
