package newproject;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix-ITs
 */
import java.util.regex.*;
public class Regester extends javax.swing.JFrame {

    /**
     * Creates new form Regester
     */
      String gender="";
    public Regester() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        rmale = new javax.swing.JRadioButton();
        rfemale = new javax.swing.JRadioButton();
        txtemail = new javax.swing.JTextField();
        txtmobilenum = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        txtname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Username                    :");

        jLabel5.setText("Password                    :");

        jLabel6.setText("Mobile number             :");

        jLabel7.setText("Email Address               :");

        jLabel3.setText("Gender                         :");

        jLabel8.setText("Address                        :");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane2.setViewportView(txtaddress);

        buttonGroup1.add(rmale);
        rmale.setText("Male");
        rmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rfemale);
        rfemale.setText("Female");
        rfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfemaleActionPerformed(evt);
            }
        });

        txtmobilenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobilenumActionPerformed(evt);
            }
        });

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(rmale)
                                .addGap(18, 18, 18)
                                .addComponent(rfemale))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtemail))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtpass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtmobilenum)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtmobilenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rmale)
                    .addComponent(rfemale))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String EMAIL_REGEX="(^[a-zA-Z0-9]{1,20}@[a-zA-Z0-9]{1,10}.[a-zA-Z]{0,5}$)";//jyotib3266@gmail.com
            
            //System.out.println(dtf.format(now));
        if(txtname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"please enter username!");
        }else if(txtpass.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"enter the password!");
        }else if(txtmobilenum.getText().equals("")  || txtmobilenum.getText().matches("^[0-9]$") || txtmobilenum.getText().length()!=10){
            JOptionPane.showMessageDialog(null,"please enter 10 digit mobile number!");
        }else if(txtemail.getText().toString().equalsIgnoreCase("") || txtemail.toString().matches(EMAIL_REGEX)){
            JOptionPane.showMessageDialog(null,"eneter the proper email address!");
        }else if(!rmale.isSelected() && !rfemale.isSelected()){
            JOptionPane.showMessageDialog(null,"select the gender");
        }else if(txtaddress.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"enter the address");
        }else{
            try {
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                 LocalDateTime now = LocalDateTime.now();  
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
                 String sql="insert into register(username,password,mobilenumber,email,gender,address,date)values(?,?,?,?,?,?,?)";
                 PreparedStatement ps=con.prepareStatement(sql);
                 ps.setString(1,txtname.getText());
                 ps.setString(2,txtpass.getText());
                 ps.setString(3,txtmobilenum.getText());
                 ps.setString(4,txtemail.getText());
                if(rmale.isSelected()){
                    gender="male";
                }if(rfemale.isSelected()){
                    gender="female";
                }
                ps.setString(5,gender);
                ps.setString(6,txtaddress.getText());
                 ps.setString(7,dtf.format(now));
                 int i=ps.executeUpdate();
                if(i!=0){
                     JOptionPane.showMessageDialog(null,"register successfully");
                     
                 }else{
                    JOptionPane.showMessageDialog(null,"not register");
                }
                 
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void rmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmaleActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_rmaleActionPerformed

    private void rfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfemaleActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_rfemaleActionPerformed

    private void txtmobilenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobilenumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobilenumActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtname.setText("");
        txtpass.setText("");
        txtmobilenum.setText("");
        txtaddress.setText("");
        txtemail.setText("");
        rmale.setSelected(false);
        rfemale.setSelected(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String EMAIL_REGEX="(^[a-zA-Z0-9]{1,20}@[a-zA-Z0-9]{1,10}.[a-zA-Z]{0,5}$)";//jyotib3266@gmail.com

        if(txtname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"please enter username!");
        }else if(txtpass.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"enter the password!");
        }else if(txtmobilenum.getText().equals("")  || txtmobilenum.getText().matches("^[0-9]$") || txtmobilenum.getText().length()!=10){
            JOptionPane.showMessageDialog(null,"please enter 10 digit mobile number!");
        }else if(txtemail.getText().toString().equalsIgnoreCase("") || txtemail.toString().matches(EMAIL_REGEX)){
            JOptionPane.showMessageDialog(null,"eneter the proper email address!");
        }else if(!rmale.isSelected() && !rfemale.isSelected()){
            JOptionPane.showMessageDialog(null,"select the gender");
        }else if(txtaddress.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"enter the address");
        }else{
        try {
             DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
             LocalDateTime now = LocalDateTime.now();  
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurentlogin", "root","");
            String sql="update register set username=?,password=?,mobilenumber=?,email=?,gender=?,address=?,date=?";
            PreparedStatement ps=con.prepareStatement(sql);
           // ps.executeUpdate();
            ps.setString(1,txtname.getText());
            ps.setString(2,txtpass.getText());
            ps.setString(3,txtmobilenum.getText());
            ps.setString(4,txtemail.getText());
            if(rmale.isSelected()){
                    gender="male";
                }if(rfemale.isSelected()){
                    gender="female";
                }
                ps.setString(5,gender);
                ps.setString(6,txtaddress.getText());
                 ps.setString(7,dtf.format(now));
                 int i=ps.executeUpdate();
            if(i!=0){
                JOptionPane.showMessageDialog(null,"update data successfully!");
            }else{
                JOptionPane.showMessageDialog(null,"not update");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login login=new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Regester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rfemale;
    private javax.swing.JRadioButton rmale;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmobilenum;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
