
//import jaco.mp3.player.MP3Player;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruhan
 */
public class Notification extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    DatabaseConnection db;
    Statement st;

    public Notification() {
        db=new DatabaseConnection();
        st=db.getDbStatement();
        initComponents();
        this.setLocationRelativeTo(null);
        usericon();
        refresh2();
        String update="UPDATE `notification` SET `View`='"+String.valueOf("Yes")+"' WHERE 1";
        esp(update);
    }
    
   
    public String current;
    
    public void usericon(){
        String s="";
        try{
                    ResultSet rs=st.executeQuery("select *from userselection");
           
                    
           
                    while(rs.next()){
                        String s1=rs.getString("user");
                        s=s1;
                        current=s1;
                    }
           
                }catch(Exception e){
            
                 }
        icon.setText("  Hello, "+s+"!");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        New = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        d = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1214, 712));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 20, 60, 50);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homex24.png"))); // NOI18N
        jButton2.setText("           Home");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 110, 270, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 150, 270, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 220, 270, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 290, 270, 30);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 358, 270, 30);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 430, 270, 30);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 500, 270, 20);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 570, 270, 30);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(0, 640, 270, 30);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(0, 710, 270, 10);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardx24.png"))); // NOI18N
        jButton3.setText("     Dashboard");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 180, 270, 40);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profilex24.png"))); // NOI18N
        jButton4.setText("           Profile");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 250, 270, 40);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/requestsx24.png"))); // NOI18N
        jButton5.setText("        Requests");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 320, 270, 40);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donorlistx24.png"))); // NOI18N
        jButton6.setText("      Donor List");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 393, 270, 40);

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adddonorx24.png"))); // NOI18N
        jButton7.setText("     Add Donor");
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 460, 270, 40);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Requestforbloodgeneralx24.png"))); // NOI18N
        jButton8.setText(" Blood Request");
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 530, 270, 40);

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settingsx24.png"))); // NOI18N
        jButton9.setText("        Settings");
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(0, 600, 270, 40);

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exitx24.png"))); // NOI18N
        jButton10.setText("        Exit");
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(0, 670, 270, 40);

        icon.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        icon.setForeground(new java.awt.Color(153, 153, 0));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boy (1).png"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(1044, 134, 160, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Donate blood and save life!");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 140, 140, 13);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel6.setText("Blood Donor Management System");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 100, 400, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Pirens Institute of Business Management and Administration");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(530, 60, 480, 40);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 460, 270, 460);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 270, 480);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 0, 970, 180);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "My Notifications", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(null);

        New.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        New.setForeground(new java.awt.Color(153, 153, 255));
        New.setText("New");
        New.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewMouseClicked(evt);
            }
        });
        jPanel1.add(New);
        New.setBounds(390, 30, 53, 23);

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton11.setForeground(new java.awt.Color(153, 153, 255));
        jButton11.setText("All");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(470, 30, 50, 23);

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User", "Message", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoscrolls(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 70, 570, 180);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Description");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 260, 150, 40);

        d.setEditable(false);
        d.setColumns(20);
        d.setRows(5);
        jScrollPane2.setViewportView(d);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(180, 310, 570, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 180, 930, 520);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1024, 0, 190, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int check=JOptionPane.showConfirmDialog(null,"YES     for     Exit\nNO       for    ReLogin ","Choose one...",JOptionPane.YES_NO_OPTION);
        if(check==0){
            //code suru
            String update="UPDATE `settings` SET `sure`='1' WHERE 1";
            executeSQLQuery(update);
            
            String update2="UPDATE `userselection` SET `user`='Open' WHERE 1";
            executeSQLQuery(update2);
            
            //code sesh
            System.exit(0);
        }
        if(check==1){
            String update="UPDATE `settings` SET `sure`='1' WHERE 1";
            executeSQLQuery(update);
            
            String update2="UPDATE `userselection` SET `user`='Open' WHERE 1";
            executeSQLQuery(update2);
            
            login l=new login();
            close();
            l.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void executeSQLQuery(String query) {
       try{
          
           if(st.executeUpdate(query)==1){
               
           }else{
               //JOptionPane.showMessageDialog(null,"There is a problem.","Sorry!",JOptionPane.WARNING_MESSAGE); 
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Home h=new Home();
        close();
        h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Dashboard d=new Dashboard();
        close();
       d.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Profile p=new Profile();
        close();
        p.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DonorList dl=new DonorList();
        close();
        dl.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        AddDonor ad=new AddDonor();
        close();
        ad.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        BloodRequest br=new BloodRequest();
        close();
        br.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        boolean b=false;
        
        //code suru
        try{
                    ResultSet rs=st.executeQuery("select *from settings");
           
                    
           
                    while(rs.next()){
                        String s1=rs.getString("sure");
                        if(s1.equals("2")){
                            b=true;
                        }
               
                       
                    }
           
                }catch(Exception e){
            
                 }
        
        //code sesh
        
        if(b==true){
            Settings s=new Settings();
       
            s.setVisible(true);
            close(); 
        }
    }//GEN-LAST:event_jButton9ActionPerformed
      private String llp;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Requests r=new Requests();
        r.setVisible(true);
        close();
    }//GEN-LAST:event_jButton5ActionPerformed

     public void refresh2(){
        try{
            CustomDatabaseConnection cdb=new CustomDatabaseConnection(current);
            Statement st= cdb.getDbStatement();
           ResultSet rs=st.executeQuery("select *from notification");
           
           DefaultTableModel model=(DefaultTableModel) table.getModel();
           Object rowData[]=new Object[3];
           while(rs.next()){
               String s1=rs.getString("Request");
               String s2=rs.getString("Time");
               String s3=rs.getString("View");
               String s4=rs.getString("ReceiveID");
               
               
               if(s3.equals("No")){
               
                    rowData[0]=s4;
                    rowData[1]=s1;
                    rowData[2]=s2;
                    
                    model.addRow(rowData);
               }
           }
           
       }catch(Exception e){
            
       }
    }
    
    
    
    
    
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        d.setText("");
        int i=table.getSelectedRow();
        
        TableModel model=table.getModel();
        
        
        String recv=model.getValueAt(i, 0).toString();
        String msg=model.getValueAt(i, 1).toString();
        String time=model.getValueAt(i, 2).toString();
        String name="";
        try{
           ResultSet rs=st.executeQuery("select *from userprofile");
           
           while(rs.next()){
               String s=rs.getString("Un");
               if(s.equalsIgnoreCase(recv)){
                   name=rs.getString("Name");
                   break;
               }
           }
           
       }catch(Exception e){
            
       }
        
        String[] x=time.split(" ");
        
        d.setText(d.getText()+"From      : "+name+"\n");
        d.setText(d.getText()+"Time       : "+x[1]+" "+x[2]+"\n");
        d.setText(d.getText()+"Date        : "+x[0]+"\n");
        d.setText(d.getText()+"Message   : \n");
        d.setText(d.getText()+""+msg);
        
        
        
    }//GEN-LAST:event_tableMouseClicked

    private void NewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewMouseClicked
        DefaultTableModel m=(DefaultTableModel) table.getModel();
        m.setRowCount(0);
        refresh2();
        
    }//GEN-LAST:event_NewMouseClicked

    private void esp(String query) {
       try{
           CustomDatabaseConnection cdb=new CustomDatabaseConnection(current);
           Statement st= cdb.getDbStatement();
          
           if(st.executeUpdate(query)==1){
               
           }else{
               //JOptionPane.showMessageDialog(null,"Data not inserted\n\nPlease check and retry.","Alert",JOptionPane.WARNING_MESSAGE); 
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        DefaultTableModel m=(DefaultTableModel) table.getModel();
        m.setRowCount(0);
        refresh3();
    }//GEN-LAST:event_jButton11MouseClicked

    
    public void refresh3(){
        try{
            CustomDatabaseConnection cdb=new CustomDatabaseConnection(current);
            Statement st= cdb.getDbStatement();
           ResultSet rs=st.executeQuery("select *from notification");
           
           DefaultTableModel model=(DefaultTableModel) table.getModel();
           Object rowData[]=new Object[3];
           while(rs.next()){
               String s1=rs.getString("Request");
               String s2=rs.getString("Time");
               String s3=rs.getString("View");
               String s4=rs.getString("ReceiveID");
               
               
               //if(s3.equals("No")){
               
                    rowData[0]=s4;
                    rowData[1]=s1;
                    rowData[2]=s2;
                    
                    model.addRow(rowData);
               //}
           }
           
       }catch(Exception e){
            
       }
    }
    
    
    private void executeSQLQuery(String query,String message) {
       try{

          
           if(st.executeUpdate(query)==1){
               JOptionPane.showConfirmDialog(null,"Your Profile "+message+"Successfully",""+message,JOptionPane.INFORMATION_MESSAGE);
               
//ys/no code hbe
           }else{
               JOptionPane.showMessageDialog(null,"Data not inserted\n\nPlease check and retry.","Alert",JOptionPane.WARNING_MESSAGE); 
           }
           
           
       }catch(Exception e){
            
       }
    }
    
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
                new Notification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton New;
    private javax.swing.JTextArea d;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    
}
