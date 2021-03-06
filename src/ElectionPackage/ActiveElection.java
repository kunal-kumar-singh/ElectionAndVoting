/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectionPackage;
import HomePagePackage.MainPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kunal
 */
public class ActiveElection extends javax.swing.JFrame {

    /**
     * Creates new form ActiveElection
     */
    private String constituency,electionid,electiontype;
    private boolean resultfound=false;
    public ActiveElection() {
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
        ConstituencyField = new javax.swing.JTextField();
        ConstituencyLabel = new javax.swing.JLabel();
        CheckButton = new javax.swing.JButton();
        QueryResultLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        ImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        WelcomeLabel.setText("                           Welcome To Active Election Checking Portal ");

        ConstituencyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConstituencyFieldActionPerformed(evt);
            }
        });

        ConstituencyLabel.setText("Constituency");

        CheckButton.setBackground(new java.awt.Color(240, 108, 10));
        CheckButton.setText("Check");
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(62, 17, 190));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroungImage/vote.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(QueryResultLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ConstituencyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(74, 74, 74)
                                    .addComponent(ConstituencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CheckButton, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConstituencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConstituencyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(ImageLabel)))
                .addGap(11, 11, 11)
                .addComponent(QueryResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckButton)
                .addGap(18, 18, 18)
                .addComponent(BackButton)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void sql_database_get_active_election_query()
    {
       
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/ElectionAndVoting";
           Connection connection=DriverManager.getConnection(url,"root","");
           String query="SELECT ElectionId,ElectionType FROM ElectionSchedule WHERE Constituency = "+"'"+constituency+"'; ";
           PreparedStatement prestat;
           prestat = connection.prepareStatement(query);
           ResultSet results;
           results=prestat.executeQuery();
           while(results.next()){
           electionid=results.getString("ElectionId");
           electiontype=results.getString("ElectionType");
           resultfound=true;                               
           }
           connection.close();
        }
        catch(Exception exception)
        { 
            System.out.println(exception);
        } 
        
    }
    
    
    
    
    
    private void ConstituencyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConstituencyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConstituencyFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
       dispose();
       new MainPage().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckButtonActionPerformed
        // TODO add your handling code here:
        constituency=ConstituencyField.getText();
        ConstituencyField.setEditable(false);
        sql_database_get_active_election_query();
        if(resultfound)
        {
         QueryResultLabel.setText("ElectionId: "+electionid+" ElectionType: "+electiontype);
        }
        else
        {
         QueryResultLabel.setText("No Current Election For Given Constituency "+constituency);
        }
    }//GEN-LAST:event_CheckButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ActiveElection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActiveElection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActiveElection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActiveElection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActiveElection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CheckButton;
    private javax.swing.JTextField ConstituencyField;
    private javax.swing.JLabel ConstituencyLabel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel QueryResultLabel;
    private javax.swing.JLabel WelcomeLabel;
    // End of variables declaration//GEN-END:variables
}
