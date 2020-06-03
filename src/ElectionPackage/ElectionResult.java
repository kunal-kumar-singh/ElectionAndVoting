/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectionPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kunal
 */
public class ElectionResult extends javax.swing.JFrame {

    /**
     * Creates new form ConstituencyWiseElectionResult
     */
    private String electionid,constituency,applicantname,partyname,result_type;
    private int count;
    private boolean alreadyinserted=false;
    public ElectionResult() {
        initComponents();
    }
    
    public ElectionResult(String result_type) {
        initComponents();
        this.result_type=result_type;
        WelcomeLabel.setText("Welcome To "+this.result_type+" Election Result Portal");
        if(this.result_type.equals("PartyWise"))
        {
            ConstituencyLabel.setVisible(false);
            ConstituencyField.setVisible(false);
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
        ElectionIdLabel = new javax.swing.JLabel();
        ConstituencyLabel = new javax.swing.JLabel();
        ConstituencyField = new javax.swing.JTextField();
        ElectionIdField = new javax.swing.JTextField();
        GetResultButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        ResultTextArea = new javax.swing.JTextArea();
        ImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        WelcomeLabel.setText("                           Welcome To Constituency Wise Election Result Portal");

        ElectionIdLabel.setText("ElectionId");

        ConstituencyLabel.setText("Constituency");

        GetResultButton.setBackground(new java.awt.Color(240, 108, 10));
        GetResultButton.setText("Get Result");
        GetResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetResultButtonActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(63, 126, 50));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ResultTextArea.setColumns(20);
        ResultTextArea.setRows(5);
        ScrollPane.setViewportView(ResultTextArea);

        ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroungImage/vote.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ConstituencyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ConstituencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ElectionIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(59, 59, 59)
                                    .addComponent(ElectionIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addComponent(ImageLabel)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(GetResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268))))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ImageLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ElectionIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ElectionIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConstituencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConstituencyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetResultButton)
                    .addComponent(BackButton))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void sql_database_get_votecount_query()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT ApplicantName,PartyName,Count FROM CandidateApplication INNER JOIN VotingResult ON CandidateApplication.UserId=VotingResult.UserId WHERE VotingResult.Constituency = "+"'"+constituency+"'"+" AND VotingResult.ElectionId = "+"'"+electionid+"'"+" GROUP BY VotingResult.UserId ORDER BY Count DESC ;";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results;
           results=prestat.executeQuery();
           while(results.next()){
           applicantname=results.getString("ApplicantName");
           partyname=results.getString("PartyName");
           count=results.getInt("Count");
           String countstring=String.valueOf(count);  
           ResultTextArea.append(applicantname+"            "+partyname+"            "+countstring+"\n"); 
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
    
    
    public void sql_database_table_updatecheck()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT UserId FROM VotingResult WHERE ElectionId = "+"'"+electionid+"'"+" AND Constituency = "+"'"+constituency+"'"+" ; ";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results;
           results=prestat.executeQuery();
           while(results.next()){                          
           alreadyinserted=true; 
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
    
    public void sql_database_table_preprocess_party_updatecheck()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT PartyName FROM VotingPartyResult WHERE ElectionId = "+"'"+electionid+"' ;";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results;
           results=prestat.executeQuery();
           while(results.next()){                          
           alreadyinserted=true;                               
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
    
    
    public void sql_database_seat_count_partywise_query()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT PartyName,COUNT(PartyName) AS SeatCount FROM VotingPartyResult WHERE ElectionId = "+"'"+electionid+"'"+" GROUP BY PartyName ORDER BY SeatCount DESC;";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results;
           results=prestat.executeQuery();
           while(results.next()){
           partyname=results.getString("PartyName");
           count=results.getInt("SeatCount");
           String countstring=String.valueOf(count);  
           ResultTextArea.append(partyname+"            "+countstring+"\n");                               
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
       dispose();
       new ResultPage().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void GetResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetResultButtonActionPerformed
        // TODO add your handling code here:
        constituency=ConstituencyField.getText();
        ConstituencyField.setEditable(false);
        switch(result_type)
        {
            
            case "ConstituencyWise":     
               electionid=ElectionIdField.getText();
               ElectionIdField.setEditable(false);
               ResultTextArea.append("ApplicantName            Partyname                 VoteCount"+"\n");  
               sql_database_table_updatecheck();
               if(!alreadyinserted)
                {
                    ResultTextArea.setText("Result Has Not Been Declared for Election Id:"+electionid +" Constituency "+constituency);  
                }
               else
                {
                   sql_database_get_votecount_query();
                }
                break;
            case "PartyWise":
                electionid=ElectionIdField.getText();
                ElectionIdField.setEditable(false);
                ResultTextArea.append("Partyname                 SeatCount"+"\n"); 
                sql_database_table_preprocess_party_updatecheck();
                if(!alreadyinserted)
                {
                    ResultTextArea.setText("Result Has Not Been Declared for Election Id:"+electionid);
                }
                else
                {
                    sql_database_seat_count_partywise_query();
                }
                break;
        }
      
    }//GEN-LAST:event_GetResultButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ElectionResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElectionResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElectionResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectionResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElectionResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField ConstituencyField;
    private javax.swing.JLabel ConstituencyLabel;
    private javax.swing.JTextField ElectionIdField;
    private javax.swing.JLabel ElectionIdLabel;
    private javax.swing.JButton GetResultButton;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JTextArea ResultTextArea;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel WelcomeLabel;
    // End of variables declaration//GEN-END:variables
}