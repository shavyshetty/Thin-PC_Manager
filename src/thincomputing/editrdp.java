/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thincomputing;


import java.awt.Color;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sharvil
 */
public class editrdp extends javax.swing.JFrame {
public static String nname;
final String ntype="rdesktop";
    String ssntype;
    String ssnname;
    public static int rdpni;
    /**
     * Creates new form editrdp
     */
    public editrdp() {
        initComponents();
        System.out.println("rdpni:"+rdpni);
        jTextField13.setText(nname);
        initform();
    }
    
    
    public void initform()
    {
    try {
                                   //driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
			
 
			Statement stat = con.createStatement(); 
                                  StringBuilder rdp = new StringBuilder() ; 
                                    rdp.append("SELECT * FROM SSN WHERE NO=").append(rdpni).append(";");
                                    ResultSet rdp1=stat.executeQuery(rdp.toString());
                            
                                    while (rdp1.next())
                                    {           


                                             jTextField14.setText(rdp1.getString(4));
                                            
                                            String das=rdp1.getString(5);
                                            if (das.equals("0"))
                                            {jComboBox12.setSelectedIndex(0);}
                                            else jComboBox12.setSelectedIndex(1);
                                            
                                            String dicn=rdp1.getString(6);
                                            if (dicn.equals("0"))
                                            {jComboBox1.setSelectedIndex(0);}
                                            else jComboBox1.setSelectedIndex(0);

                                            String dcldp=rdp1.getString(7);
                                            if (dcldp.equals("0"))
                                            {jComboBox12.setSelectedIndex(0);}
                                            else if (dcldp.equals("1"))
                                            { jComboBox12.setSelectedIndex(1);} 
                                            else if (dcldp.equals("2"))
                                            { jComboBox12.setSelectedIndex(2);}
                                            else if (dcldp.equals("3"))
                                            { jComboBox12.setSelectedIndex(3);}
                                        
                                   //fullscreen?
                                             String dflsc=rdp1.getString(8);
                                              if(dflsc.equals("0"))
                                              {
                                                  jComboBox3.setSelectedIndex(0);
                                              }
                                              else {jComboBox3.setSelectedIndex(1);}
                                  //Persistent ?            
                                              String dprs=rdp1.getString(9);
                                              if(dprs.equals("0"))
                                              {
                                                  jComboBox4.setSelectedIndex(0);
                                              }
                                              else {jComboBox4.setSelectedIndex(1);}
                                  //Bitmap?            
                                             String dbtmp=rdp1.getString(10);
                                              if(dbtmp.equals("0"))
                                              {
                                                  jComboBox5.setSelectedIndex(0);
                                              }
                                              else {jComboBox5.setSelectedIndex(1);}
                                  //Motion?            
                                              String dmotn=rdp1.getString(11);
                                              if(dmotn.equals("0"))
                                              {
                                                  jComboBox6.setSelectedIndex(0);
                                              }
                                              else {jComboBox6.setSelectedIndex(1);}
                                   //SOund?           
                                             String dsnd=rdp1.getString(12);
                                              if(dsnd.equals("0"))
                                              {
                                                  jComboBox7.setSelectedIndex(0);
                                              }
                                              else {jComboBox7.setSelectedIndex(1);}
                                             
                                             //sound commands
                                   //COM1?           
                                             String dcm1=rdp1.getString(13);
                                              if(dcm1.equals("0"))
                                              {
                                                  jComboBox8.setSelectedIndex(0);
                                              }
                                              else {jComboBox8.setSelectedIndex(1);} 
                                              //com1 commands
                                   //COM2?            
                                              String dcm2=rdp1.getString(14);
                                               if(dcm2.equals("0"))
                                              {
                                                  jComboBox9.setSelectedIndex(0);
                                              }
                                              else {jComboBox9.setSelectedIndex(1);}
                                              
                                              //com1 commands
                                   //LPT ?           
                                             String dlpt=rdp1.getString(15);
                                              if(dlpt.equals("0"))
                                              {
                                                  jComboBox10.setSelectedIndex(0);
                                              }
                                              else {jComboBox10.setSelectedIndex(1);} 
                                             
                                             //lpt commands
                                   //USB?
                                              String dusb=rdp1.getString(16);
                                              if(dusb.equals("0"))
                                              {
                                                  jComboBox11.setSelectedIndex(0);
                                              }
                                              else {jComboBox11.setSelectedIndex(1);} 
                                              //usb commands
                                   //RDP USER NAME?
                                              jTextField4.setText(rdp1.getString(17));
                                             
                                   //RDP USER PASS           
                                            jPasswordField1.setText(rdp1.getString(18));
                                              
                                    //EXTRA COMMANDS FOR FUTURE REFERENCE          
                                              jTextField5.setText(rdp1.getString(19));
                                    }
                               }
                           catch (SQLException e) 
                                {
				e.printStackTrace();
                                } 
                        catch (ClassNotFoundException ex) {
                                Logger.getLogger(editrdp.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel8.setBackground(java.awt.Color.white);

        jLabel43.setText("Protocol:");

        jTextField12.setEditable(false);
        jTextField12.setText("rdesktop");

        jLabel44.setText("Session Name:");

        jLabel45.setText("Screen:");

        jLabel46.setText("1");

        jLabel47.setText("Server:");

        jLabel48.setText("Icon:");

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel49.setText("Heading");

        jLabel50.setText("Details");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(155, 155, 155)
                .addComponent(jLabel50)
                .addGap(112, 112, 112))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)))
        );

        jSeparator1.setBackground(java.awt.Color.white);
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OFF", "ON" }));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setText("Options:  -----------------------------------------------------------------");

        jLabel10.setText("--> Colour Depth:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "15", "16", "24" }));
        jComboBox2.setSelectedIndex(3);

        jLabel11.setText("--> Full Screen:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OFF", "ON" }));

        jLabel12.setText("--> Persistent Caching:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OFF", "ON" }));

        jLabel13.setText("--> Force Bitmap Updates:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OFF", "ON" }));

        jLabel14.setText("--> No Motion Events:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OFF", "ON" }));

        jLabel15.setText("--> Sound:");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OFF", "ON" }));

        jLabel16.setText("--> Com1:");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OFF", "ON" }));

        jLabel17.setText("--> Com2:");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OFF", "ON" }));

        jLabel18.setText("--> LPT Port:");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OFF", "ON" }));

        jLabel19.setText("--> Keyboard Map:");

        jLabel20.setText("en-us");

        jLabel21.setText("--> USB");

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OFF", "ON" }));

        jLabel22.setText("--> Username:");

        jLabel23.setText("--> Password:");

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel24.setText("Auto Start:");

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OFF", "ON" }));

        jButton2.setBackground(new java.awt.Color(255, 92, 0));
        jButton2.setForeground(java.awt.Color.black);
        jButton2.setText("X");
        jButton2.setToolTipText("Close Window");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel25.setText("--> Additional Options:");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel47)
                                                    .addComponent(jLabel45)
                                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel18)
                                                            .addComponent(jLabel12)
                                                            .addComponent(jLabel19)
                                                            .addComponent(jLabel21))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jComboBox10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jComboBox11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(jLabel17)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(97, 97, 97)))
                                        .addGap(24, 24, 24))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel23)
                                                    .addComponent(jLabel22))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField4)
                                                    .addComponent(jPasswordField1)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel46))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField14)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox12)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox6)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox10)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordField1)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(73, 73, 73))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jSeparator2)))))
        );

        jScrollPane1.setViewportView(jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ip = jTextField14.getText();
        System.out.println("ip:"+ip);
        if(ip.equals(""))
        {
            jLabel26.setForeground(Color.red);
            jLabel26.setText("Server IP cannot be empty");
        }
        else{int icon = jComboBox1.getSelectedIndex();
            System.out.println("icon:"+icon);
            int autostrt = jComboBox12.getSelectedIndex();
            System.out.println("autostart"+autostrt);
            Object colrdptho = jComboBox2.getSelectedItem();
            String colrdpth=colrdptho.toString();
            System.out.println("color depth:"+colrdpth);
            int fulscr = jComboBox3.getSelectedIndex();
            System.out.println("fulscr:"+fulscr);
            int persistnt = jComboBox4.getSelectedIndex();
            System.out.println("persistent"+persistnt);
            int btmp = jComboBox5.getSelectedIndex();
            System.out.println("bitmap"+btmp);
            int motion = jComboBox6.getSelectedIndex();
            System.out.println("motion:"+motion);
            int sound = jComboBox7.getSelectedIndex();
            System.out.println("sound:"+sound);
            int com1 = jComboBox8.getSelectedIndex();
            System.out.println("com1:"+com1);
            int com2 = jComboBox9.getSelectedIndex();
            System.out.println("com2"+com2);
            int lpt = jComboBox10.getSelectedIndex();
            System.out.println("lpt:"+lpt);
            int usb = jComboBox11.getSelectedIndex();
            System.out.println("usb:"+usb);
            String rdpusr = jTextField4.getText();
            String rdppass = jPasswordField1.getText();
            String extra=jTextField5.getText();
            try {

                //driver for H2 db get from http://www.h2database.com
                Class.forName("org.h2.Driver");

                //create database on memory
                Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");

                Statement stat = con.createStatement();
                try {
                    StringBuilder del=new StringBuilder();
                    del.append("DELETE FROM SSN WHERE NO=").append(rdpni).append(";");
                    stat.execute(del.toString());
                    StringBuilder query = new StringBuilder() ;
                    query.append("INSERT INTO SSN (NAME,TYPE,SRVRIP,AUTOSTRT,ICON,CLRDPTH,FULSCR,PERSISTNT,BITMP,MOTN,SOUND,COM1,COM2,LPT,USB,SSNUSR,SSNPASS,EXTRA) VALUES ('").append(nname).append("'").append(",'").append(ntype).append("','").append(ip).append("','").append(autostrt).append("','").append(icon).append("','").append(colrdpth).append("','").append(fulscr).append("','").append(persistnt).append("','").append(btmp).append("','").append(motion).append("','").append(sound).append("','").append(com1).append("','").append(com2).append("','").append(lpt).append("','").append(usb).append("','").append(rdpusr).append("','").append(rdppass).append("','").append(extra).append("')");
                    stat.execute(query.toString());
                    System.out.println("after insert");

                }
                catch (SQLException e) {
                    e.printStackTrace();
                }

                con.setAutoCommit(false);
                con.setAutoCommit(true);
                con.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            super.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(editrdp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editrdp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editrdp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editrdp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        String name=args[0];
        String type=args[1];
        nname=name;
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editrdp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
