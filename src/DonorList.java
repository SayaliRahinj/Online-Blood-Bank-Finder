
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
public class DonorList extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */

    DatabaseConnection db;
    Statement st;

    public DonorList() {
        db=new DatabaseConnection();
        st=db.getDbStatement();
        initComponents();
        this.setLocationRelativeTo(null);
        refresh();
        usericon();
    }
    String person="";
    public void usericon(){
        String s="";
        try{

                    ResultSet rs=st.executeQuery("select *from userselection");
           
                    
           
                    while(rs.next()){
                        String s1=rs.getString("user");
                        s=s1;
               
                       person=s;
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        searchtxt = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        box = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profilex24.png"))); // NOI18N
        jButton4.setText("           Profile");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 250, 270, 40);

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

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(null);

        jPanel5.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Donors", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        table1.setBackground(new java.awt.Color(255, 204, 204));
        table1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor  ID", "Name", "Age", "Gender", "Blood Group", "ID", "Address", "Contact", "Added by"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(3).setResizable(false);
            table1.getColumnModel().getColumn(4).setResizable(false);
            table1.getColumnModel().getColumn(5).setResizable(false);
            table1.getColumnModel().getColumn(6).setResizable(false);
            table1.getColumnModel().getColumn(7).setResizable(false);
            table1.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 910, 380);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magnifying-glass.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(820, 20, 70, 50);

        searchtxt.setBackground(new java.awt.Color(255, 204, 204));
        searchtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        searchtxt.setForeground(new java.awt.Color(0, 0, 204));
        searchtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchtxt.setBorder(null);
        jPanel1.add(searchtxt);
        searchtxt.setBounds(430, 30, 230, 30);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(430, 60, 230, 10);

        box.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Search by-", "Blood Group", "Name", "Donor ID" }));
        jPanel1.add(box);
        box.setBounds(680, 30, 130, 30);

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 51, 51));
        jButton11.setText("Request");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.setContentAreaFilled(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(320, 480, 300, 30);

        jPanel5.add(jPanel1);
        jPanel1.setBounds(0, 0, 940, 520);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 0, 920, 520);

        jTabbedPane1.addTab("View Donors", jPanel2);

        jPanel3.setLayout(null);
        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 40, 30);

        jTabbedPane1.addTab("Report", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(280, 160, 930, 550);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donorlistx24.png"))); // NOI18N
        jButton6.setText("      Donor List");
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

        icon.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        icon.setForeground(new java.awt.Color(153, 153, 0));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boy (1).png"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(1044, 134, 160, 30);

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
        jLabel3.setBounds(270, 0, 950, 180);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1060, 0, 150, 180);

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
               //JOptionPane.showMessageDialog(null,"Registration Successful!!","Congrats..",JOptionPane.INFORMATION_MESSAGE);
               
//ys/no code hbe
           }else{
               //JOptionPane.showMessageDialog(null,"Registration Unsuccessful!!","Sorry!",JOptionPane.WARNING_MESSAGE); 
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
        close();
        Profile bg=new Profile();
        bg.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Requests ad=new Requests();
        close();
        ad.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
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
            AddDonor ad=new AddDonor();
             ad.setVisible(true);
             close();
        }else{
            JOptionPane.showMessageDialog(this,"This Option is Admin Property!");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
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
            BloodRequest br=new BloodRequest();
        
            br.setVisible(true);
            close();
        }else{
            JOptionPane.showMessageDialog(this,"This Option is Admin Property!\nPlease go to : Profile -> Make Request");
        }

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String search=searchtxt.getText();
        
        String opt=box.getSelectedItem().toString();
        
        if(opt.equals("-Search by-")){
            
            DefaultTableModel model=(DefaultTableModel) table1.getModel();
            model.setRowCount(0);
            
            refresh();
        }
        else if(opt.equals("Blood Group")){
            DefaultTableModel model=(DefaultTableModel) table1.getModel();
            model.setRowCount(0);
            bg();
        }
        
        else if(opt.equals("Name")){
           
            DefaultTableModel model=(DefaultTableModel) table1.getModel();
            model.setRowCount(0);
            
            name();
        }
        
        else if(opt.equals("Donor ID")){
            DefaultTableModel model=(DefaultTableModel) table1.getModel();
            model.setRowCount(0);
            id();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        int i=-1;
        i=table1.getSelectedRow();

        if(i==-1){
            JOptionPane.showMessageDialog(null,"Please Choose any query!");
        }else{
            TableModel model=table1.getModel();

            String s=model.getValueAt(i, 8).toString();

            if(s.equals(person)){
                JOptionPane.showMessageDialog(null,"Invalid....!");
            }else{
                String msg=JOptionPane.showInputDialog(this,"Enter Short Note : (Max. 60 Character)");
                Date dt=new Date();

                DateFormat dformate=new SimpleDateFormat("dd/MM/YYYY");

                String date=dformate.format(dt);

                LocalTime t=LocalTime.now();

                DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh:mm a");
                String time=t.format(dtf);

                String datetime=date+" "+time;
                String no="No";
                String insert="INSERT INTO `notification`(`ReceiveID`, `Request`, `Time`, `View`) VALUES ('"+person+"','"+msg+"','"+datetime+"','"+no+"')";
                executeSQLQuery2(insert,s);
            }
        }

    }//GEN-LAST:event_jButton11MouseClicked

    
    private void executeSQLQuery2(String query,String d) {
       try{
           CustomDatabaseConnection cdb=new CustomDatabaseConnection(d);
           Statement st= cdb.getDbStatement();
          
           if(st.executeUpdate(query)==1){
               JOptionPane.showMessageDialog(null,"Success!!");
           }else{
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    
    
    
    public void id(){
        try{

           ResultSet rs=st.executeQuery("select *from donors");
           
           DefaultTableModel model=(DefaultTableModel) table1.getModel();
           Object rowData[]=new Object[9];
           String search=searchtxt.getText();
           while(rs.next()){
               
               String s1=rs.getString("DonorId");
               
               
               
               if(search.equalsIgnoreCase(s1)){
                   
               String s2=rs.getString("Name");
               String s3=rs.getString("Age");
               String s4=rs.getString("Gender");
               String s5=rs.getString("Bg");
               String s6=rs.getString("Id");
               String s7=rs.getString("Address");
               String s8=rs.getString("Contact");
               String s9=rs.getString("Added by");
                    rowData[0]=s1;
                    rowData[1]=s2;
                    rowData[2]=s3;
                    rowData[3]=s4;
                    rowData[4]=s5;
                    rowData[5]=s6;
                    rowData[6]=s7;
                    rowData[7]=s8;
                    rowData[8]=s9;
               
                    model.addRow(rowData);  
               }
               
               
               
           }
           
       }catch(Exception e){
            
       }
    }
    
    
    //name
    public void name(){
        try{

           ResultSet rs=st.executeQuery("select *from donors");
           
           DefaultTableModel model=(DefaultTableModel) table1.getModel();
           Object rowData[]=new Object[9];
           while(rs.next()){
               String s1=rs.getString("DonorId");
               String s2=rs.getString("Name");
               String s3=rs.getString("Age");
               String s4=rs.getString("Gender");
               String s5=rs.getString("Bg");
               String s6=rs.getString("Id");
               String s7=rs.getString("Address");
               String s8=rs.getString("Contact");
               String s9=rs.getString("Added by");
               
               
               String search=searchtxt.getText();
               
               if(search.equalsIgnoreCase(s2)){
                    rowData[0]=s1;
                    rowData[1]=s2;
                    rowData[2]=s3;
                    rowData[3]=s4;
                    rowData[4]=s5;
                    rowData[5]=s6;
                    rowData[6]=s7;
                    rowData[7]=s8;
                    rowData[8]=s9;
               
                    model.addRow(rowData);  
               }
               
               
               
           }
           
       }catch(Exception e){
            
       }
    }
    
    
    //bg
    public void bg(){
        try{

           ResultSet rs=st.executeQuery("select *from donors");
           
           DefaultTableModel model=(DefaultTableModel) table1.getModel();
           Object rowData[]=new Object[9];
           while(rs.next()){
               String s1=rs.getString("DonorId");
               String s2=rs.getString("Name");
               String s3=rs.getString("Age");
               String s4=rs.getString("Gender");
               String s5=rs.getString("Bg");
               String s6=rs.getString("Id");
               String s7=rs.getString("Address");
               String s8=rs.getString("Contact");
               String s9=rs.getString("Added by");
               
               
               String search=searchtxt.getText();
               
               if(search.equalsIgnoreCase(s5)){
                    rowData[0]=s1;
                    rowData[1]=s2;
                    rowData[2]=s3;
                    rowData[3]=s4;
                    rowData[4]=s5;
                    rowData[5]=s6;
                    rowData[6]=s7;
                    rowData[7]=s8;
                    rowData[8]=s9;
               
                    model.addRow(rowData);  
               }
               
               
               
           }
           
       }catch(Exception e){
            
       }
    }
    
    
    
    // refresh
    public void refresh(){
        try{

           ResultSet rs=st.executeQuery("select *from donors");
           
           DefaultTableModel model=(DefaultTableModel) table1.getModel();
           Object rowData[]=new Object[9];
           while(rs.next()){
               String s1=rs.getString("DonorId");
               String s2=rs.getString("Name");
               String s3=rs.getString("Age");
               String s4=rs.getString("Gender");
               String s5=rs.getString("Bg");
               String s6=rs.getString("Id");
               String s7=rs.getString("Address");
               String s8=rs.getString("Contact");
               String s9=rs.getString("Added by");
               
               rowData[0]=s1;
               rowData[1]=s2;
               rowData[2]=s3;
               rowData[3]=s4;
               rowData[4]=s5;
               rowData[5]=s6;
               rowData[6]=s7;
               rowData[7]=s8;
               rowData[8]=s9;
               
               model.addRow(rowData);
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
                new DonorList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
