
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
public class CompleteProfile extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    DatabaseConnection db;

    public CompleteProfile() {
        initComponents();
        this.setLocationRelativeTo(null);
        db =new DatabaseConnection();
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
        genderbox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        bgbox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        contacttxt1 = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        jLabel5.getAccessibleContext().setAccessibleName("Pirens Institute of Business Management and Administration");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Complete Pofile", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(null);
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(700, 140, 230, 10);

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
        contacttxt.setBounds(700, 110, 230, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Contact No.  :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(580, 100, 130, 50);
        jPanel1.add(jSeparator16);
        jSeparator16.setBounds(130, 410, 240, 10);

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
        addresstxt.setBounds(130, 380, 230, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Address         :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 370, 120, 50);
        jPanel1.add(jSeparator15);
        jSeparator15.setBounds(140, 340, 230, 10);

        idtxt.setBackground(new java.awt.Color(255, 204, 204));
        idtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        idtxt.setForeground(new java.awt.Color(0, 0, 204));
        idtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idtxt.setBorder(null);
        jPanel1.add(idtxt);
        idtxt.setBounds(140, 310, 230, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("ID*              :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 310, 120, 40);

        genderbox.setBackground(new java.awt.Color(255, 204, 204));
        genderbox.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        genderbox.setForeground(new java.awt.Color(0, 0, 255));
        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Male", "Female" }));
        genderbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(genderbox);
        genderbox.setBounds(140, 250, 230, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Gender           :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 240, 120, 50);
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(140, 210, 230, 10);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Age               :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 180, 120, 40);

        agetxt.setBackground(new java.awt.Color(255, 204, 204));
        agetxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        agetxt.setForeground(new java.awt.Color(0, 0, 204));
        agetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agetxt.setBorder(null);
        jPanel1.add(agetxt);
        agetxt.setBounds(140, 180, 230, 30);

        nametxt.setBackground(new java.awt.Color(255, 204, 204));
        nametxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 0, 204));
        nametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nametxt.setBorder(null);
        jPanel1.add(nametxt);
        nametxt.setBounds(140, 110, 230, 30);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(140, 140, 230, 10);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Name            :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 110, 120, 40);

        bgbox.setBackground(new java.awt.Color(255, 204, 204));
        bgbox.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        bgbox.setForeground(new java.awt.Color(51, 0, 255));
        bgbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        bgbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bgbox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(bgbox);
        bgbox.setBounds(150, 40, 220, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Blood group  :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 30, 120, 50);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Occupation  :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(580, 180, 120, 50);

        contacttxt1.setBackground(new java.awt.Color(255, 204, 204));
        contacttxt1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        contacttxt1.setForeground(new java.awt.Color(0, 0, 204));
        contacttxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contacttxt1.setBorder(null);
        contacttxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttxt1ActionPerformed(evt);
            }
        });
        jPanel1.add(contacttxt1);
        contacttxt1.setBounds(700, 190, 230, 30);
        jPanel1.add(jSeparator17);
        jSeparator17.setBounds(700, 220, 230, 10);

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
        jButton1.setBounds(690, 360, 200, 70);

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1100, 20, 80, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 140, 1210, 550);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1220, 160);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 0, 970, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contacttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttxtActionPerformed

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void contacttxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttxt1ActionPerformed

    
    private String username="";
    private String password="";
    
    public void getItems(String a,String b){
        username=a;
        password=b;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String bg=bgbox.getSelectedItem().toString();
        String name=nametxt.getText();
        String age=agetxt.getText();
        String gender=genderbox.getSelectedItem().toString();
        String id=idtxt.getText();
        String address=addresstxt.getText();
        String contact=contacttxt.getText();
        String occu=contacttxt1.getText();
        
        if(bg.equals("-Select-") || name.equals("") || age.equals("") || gender.equals("-Select-") || address.equals("") || contact.equals("") || occu.equals("")){
            //AddDonor a=new AddDonor();
            JOptionPane.showMessageDialog(null,"Please fill up all Field.","Alert",JOptionPane.WARNING_MESSAGE);   
        }else{
            //try catch for donor id previous
            int did=0;
                try{

                        Statement st=db.getDbStatement();
                        ResultSet rs=st.executeQuery("select *from userprofile");
                        String s="";
                        while(rs.next()){
                             String s1=rs.getString("ID"); 
                             s=s1;
                        }
                        did=Integer.parseInt(s);
           
                    }catch(Exception e){
            
                    }
                did++;
                String donorid=String.valueOf(did);
            //try catch done and get last donor id
            
            
            
            
            //Who added this person?? now we are working for it.
            String person="";
            
            try{

                        Statement st=db.getDbStatement();
                        ResultSet rs=st.executeQuery("select *from userselection");
                        String s="";
                        while(rs.next()){
                             String s1=rs.getString("user"); 
                             person=s1;
                        }
                        
           
                    }catch(Exception e){
            
                    }
            
            
            //done.
            
            String insert2="INSERT INTO `user`(`Username`, `Password`) VALUES ('"+username+"','"+password+"')";
            executeSQLQuery2(insert2);
            String tp=username;
            String insert="INSERT INTO `userprofile`(`ID`, `Name`, `Age`, `Address`, `Contact`, `Bg`, `DonatingTime`, `Eligible`, `Gender`, `Occupation`, `Uid`, `Un`, `Notification`) VALUES ('"+donorid+"','"+nametxt.getText()+"','"+agetxt.getText()+"','"+address+"','"+contact+"','"+bg+"','"+String.valueOf(0)+"','"+String.valueOf("No")+"','"+gender+"','"+occu+"','"+id+"','"+username+"','"+String.valueOf("0")+"')";
            executeSQLQuery(insert,"Inserted");
            
                try{

                        String database="CREATE DATABASE "+username;
                        Statement st=db.getDbStatement();
                        st.executeUpdate(database);
                        
           
                 }catch(Exception e){
            
                 }
                
                try{

                        String database="CREATE TABLE notification(ReceiveID VARCHAR(254) ,  Request VARCHAR(100), Time VARCHAR(30), View VARCHAR(5))";
                        CustomDatabaseConnection cdb=new CustomDatabaseConnection(username);
                        Statement st= cdb.getDbStatement();
                        st.executeUpdate(database);
                        
           
                 }catch(Exception e){
            
                 }
                
                
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login l = new login();
        close();
        l.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    
    
    private void executeSQLQuery(String query,String message) {
       try{

           Statement st= db.getDbStatement();
          
           if(st.executeUpdate(query)==1){
               JOptionPane.showMessageDialog(null,"Your Profile Created Successfully!!");
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
           Statement st= db.getDbStatement();
          
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
                new CompleteProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField agetxt;
    private javax.swing.JComboBox<String> bgbox;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JTextField contacttxt1;
    private javax.swing.JComboBox<String> genderbox;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JTextField nametxt;
    // End of variables declaration//GEN-END:variables
}