
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruhan
 */
public class Updateprofile extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Updateprofile() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    private String user;
    
    public void getUser(String a){
        this.user=a;
    }
   
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator12 = new javax.swing.JSeparator();
        contacttxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        addresstxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        idtxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        occutxt = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1214, 712));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Donate blood and save life!");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(670, 120, 140, 13);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel6.setText("Blood Donor Management System");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 80, 400, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Pirens Institute of Business Management and Administration");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 40, 480, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdr.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 970, 160);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Update Pofile", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(null);
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(770, 180, 230, 10);

        contacttxt.setBackground(new java.awt.Color(255, 204, 204));
        contacttxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        contacttxt.setForeground(new java.awt.Color(0, 0, 204));
        contacttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contacttxt.setBorder(null);
        contacttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttxtActionPerformed(evt);
            }
        });
        jPanel1.add(contacttxt);
        contacttxt.setBounds(770, 150, 230, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Contact No.  :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(650, 140, 130, 50);
        jPanel1.add(jSeparator16);
        jSeparator16.setBounds(250, 270, 240, 10);

        addresstxt.setBackground(new java.awt.Color(255, 204, 204));
        addresstxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        addresstxt.setForeground(new java.awt.Color(0, 0, 204));
        addresstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addresstxt.setBorder(null);
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });
        jPanel1.add(addresstxt);
        addresstxt.setBounds(250, 240, 230, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Address         :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(130, 230, 120, 50);
        jPanel1.add(jSeparator15);
        jSeparator15.setBounds(260, 200, 230, 10);

        idtxt.setBackground(new java.awt.Color(255, 204, 204));
        idtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        idtxt.setForeground(new java.awt.Color(0, 0, 204));
        idtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idtxt.setBorder(null);
        jPanel1.add(idtxt);
        idtxt.setBounds(260, 170, 230, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("ID*              :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(140, 170, 120, 40);
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(260, 140, 230, 10);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Age               :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 110, 120, 40);

        agetxt.setBackground(new java.awt.Color(255, 204, 204));
        agetxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        agetxt.setForeground(new java.awt.Color(0, 0, 204));
        agetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agetxt.setBorder(null);
        jPanel1.add(agetxt);
        agetxt.setBounds(260, 110, 230, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Occupation  :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(650, 220, 120, 50);

        occutxt.setBackground(new java.awt.Color(255, 204, 204));
        occutxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        occutxt.setForeground(new java.awt.Color(0, 0, 204));
        occutxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        occutxt.setBorder(null);
        occutxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occutxtActionPerformed(evt);
            }
        });
        jPanel1.add(occutxt);
        occutxt.setBounds(770, 230, 230, 30);
        jPanel1.add(jSeparator17);
        jSeparator17.setBounds(770, 260, 230, 10);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checked.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 370, 200, 70);

        jButton7.setBackground(new java.awt.Color(51, 0, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(20, 30, 80, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 160, 1210, 550);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdr.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 0, 1130, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contacttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttxtActionPerformed

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void occutxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occutxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occutxtActionPerformed

    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String update="UPDATE `userprofile` SET `Age`='"+agetxt.getText()+"',`Uid`='"+idtxt.getText()+"',`Address`='"+addresstxt.getText()+"',`Contact`='"+contacttxt.getText()+"',`Occupation`='"+occutxt.getText()+"' WHERE `Un`='"+user+"'";
        JOptionPane.showMessageDialog(null,"Successfully Updated!!","Congrats..",JOptionPane.INFORMATION_MESSAGE);
        
        executeSQLQuery2(update);
        
        Profile p=new Profile();
        close();
        p.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked

        Profile p=new Profile();
        close();
        p.setVisible(true);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            
    }//GEN-LAST:event_jButton7ActionPerformed

    
    
    private void executeSQLQuery(String query,String message) {
       try{
           String url="jdbc:mysql://localhost/diu_blood_management_db";
           String user="root";
           String pass="1234";
           Connection con=DriverManager.getConnection(url,user,pass);
           Statement st=con.createStatement();
          
           if(st.executeUpdate(query)==1){
               JOptionPane.showConfirmDialog(null,"Your Profile Created Successfully!!\nWant to view your profile ?","Congrats",JOptionPane.OK_OPTION);
               login lg=new login();
               close();
               lg.setVisible(true);
//ys/no code hbe
           }else{
               JOptionPane.showMessageDialog(null,"Data not inserted\n\nPlease check and retry.","Alert",JOptionPane.WARNING_MESSAGE); 
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    private void executeSQLQuery2(String query) {
       try{
           String url="jdbc:mysql://localhost/diu_blood_management_db";
           String user="root";
           String pass="1234";
           Connection con=DriverManager.getConnection(url,user,pass);
           Statement st=con.createStatement();
          
           if(st.executeUpdate(query)==1){
               
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    //start
    
//    public void refresh(){
//        try{
//            int count1=0;
//           String url="jdbc:mysql://localhost/diu_blood_management_db";
//           String user="root";
//           String pass="1234";
//           Connection con=DriverManager.getConnection(url,user,pass);
//           Statement st=con.createStatement();
//           ResultSet rs=st.executeQuery("select *from user");
//           
//           while(rs.next()){
//               count1++;
//           }
//           u.setText(String.valueOf(count1));
//           
//       }catch(Exception e){
//            
//       }
//        
//        
//        try{
//            int count2=0;
//           String url="jdbc:mysql://localhost/diu_blood_management_db";
//           String user="root";
//           String pass="1234";
//           Connection con=DriverManager.getConnection(url,user,pass);
//           Statement st=con.createStatement();
//           ResultSet rs=st.executeQuery("select *from requests");
//           
//           while(rs.next()){
//               count2++;
//           }
//           tr.setText(String.valueOf(count2));
//           
//       }catch(Exception e){
//            
//       }
//        
//        
//        try{
//            int count3=0;
//           String url="jdbc:mysql://localhost/diu_blood_management_db";
//           String user="root";
//           String pass="1234";
//           Connection con=DriverManager.getConnection(url,user,pass);
//           Statement st=con.createStatement();
//           ResultSet rs=st.executeQuery("select *from donors");
//           
//           while(rs.next()){
//               count3++;
//           }
//           tbd.setText(String.valueOf(count3));
//           
//       }catch(Exception e){
//            
//       }
//        
//        tbg.setText("8");
//        tdt.setText("0");
//        
//    }
    
    //end
    public void close(){
        WindowEvent winclose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updateprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField agetxt;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JTextField occutxt;
    // End of variables declaration//GEN-END:variables
}
