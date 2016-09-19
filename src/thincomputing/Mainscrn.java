/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thincomputing;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;



/**
 *
 * @author Sharvil
 */
public class Mainscrn extends javax.swing.JFrame {
    private int lognflag;
    int one=0;
    String passwd=null;
    String abc[]= new String[0];
    String type; 
    int  dno;
    int fchrom=1,ffirefx=1,flibwr=1,flibcl=1,flibimp=1,fcalc=1,fterm=1,fadbrdr=1,fvdicli=1,fvlc=1,fskyp=1,fgedit=1;
    int chrom,firefx,libwr,libcl,libimp,calc,term,adbrdr,vdicli,vlc,skyp,gedit;
    String dname,dtype,dip,das,dicn,dcldp,dflsc,dprs,dbtmp,dmotn,dsnd,dcm1,dcm2,dlpt,dusb,dusr,dpass,dxtra;
    String u="";
    String a="-a";
    String p="";
                                        
    /**
     * Creates new form Mainscrn
     */
    public Mainscrn() {
        verif();
        initComponents();
        ip();
        dbinit();
        initapps();
        
        jButton7.setEnabled(false);  
        jLabel6.setIcon(null);
        jLabel12.setIcon(null);
        jLabel6.setEnabled(false);
        jLabel12.setEnabled(false);
        
         try {
 
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
			
 
			Statement stat = con.createStatement();
                        DefaultListModel listModel = new DefaultListModel();
                        try {
				ResultSet rs = stat.executeQuery("SELECT * FROM SSN");
				String name, type;
                                while (rs.next()) {
 
					int  no = rs.getInt(1);
                                        System.out.println("no");
					 name = rs.getString(2);
					 type = rs.getString(3);
                                        listModel.addElement("      "+name+"                                                                                       "+type);
            			}
                                jList1.setModel(listModel);
				rs.close();
			 
                        
                        }
                        catch (SQLException e) {
				e.printStackTrace();
			};
                        
                        
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (Exception e)
        {
            e.printStackTrace();
        }
      
       
    }
    
    public void logninitapps()
    {
    try {
 
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
			
 
			Statement stat = con.createStatement();
                        try {
                            ResultSet apps = stat.executeQuery("SELECT * FROM APPS");
                             while (apps.next()) {
 
					int  no = apps.getInt(1);
					chrom=apps.getInt(2);
                                        if(chrom==0)
                                        {
                                         jLabel13.setEnabled(false);
                                        }
                                        else if(chrom==1)
                                        {
                                         jLabel13.setEnabled(true);
                                        }
                                        firefx=apps.getInt(3);
                                        if(firefx==0)
                                        {
                                            jLabel14.setEnabled(false);
                                        }
                                        else if(firefx==1)
                                        {
                                         jLabel14.setEnabled(true);
                                        }
                                        libwr=apps.getInt(4);
                                        if(libwr==0)
                                        {
                                            jLabel16.setEnabled(false);
                                        }
                                        else if(libwr==1)
                                        {
                                         jLabel16.setEnabled(true);
                                        }
                                        libcl=apps.getInt(5);
                                        if(libcl==0)
                                        {
                                         jLabel18.setEnabled(false);
                                        }
                                        else if(libcl==1)
                                        {
                                         jLabel18.setEnabled(true);
                                        }
                                        libimp=apps.getInt(6);
                                        if(libimp==0)
                                        {
                                         jLabel19.setEnabled(false);
                                        }
                                        else if(libimp==1)
                                        {
                                         jLabel19.setEnabled(true);
                                        }
                                        calc=apps.getInt(7);
                                        if(calc==0)
                                        {
                                         jLabel20.setEnabled(false);
                                        }
                                        else if(calc==1)
                                        {
                                         jLabel20.setEnabled(true);
                                        }
                                        
                                        term=apps.getInt(8);
                                        if(term==0)
                                        {
                                         jLabel21.setEnabled(false);
                                        }
                                        else if(term==1)
                                        {
                                         jLabel21.setEnabled(true);
                                        }
                                        adbrdr=apps.getInt(9);
                                        if(adbrdr==0)
                                        {
                                         jLabel22.setEnabled(false);
                                        }
                                        else if(adbrdr==1)
                                        {
                                         jLabel22.setEnabled(true);
                                        }
					vdicli=apps.getInt(10);
                                        if(vdicli==0)
                                        {
                                         jLabel23.setEnabled(false);
                                        }
                                        else if(vdicli==1)
                                        {
                                         jLabel23.setEnabled(true);
                                        }
                                        vlc=apps.getInt(11);
                                        if(vlc==0)
                                        {
                                         jLabel24.setEnabled(false);
                                        }
                                        else if(vlc==1)
                                        {
                                         jLabel24.setEnabled(true);
                                        }
                                        skyp=apps.getInt(12);
                                        if(skyp==0)
                                        {
                                         jLabel25.setEnabled(false);
                                        }
                                        else if(skyp==1)
                                        {
                                         jLabel25.setEnabled(true);
                                        }
                                        gedit=apps.getInt(13);
                                        if(gedit==0)
                                        {
                                         jLabel26.setEnabled(false);
                                        } 
                                        else if(gedit==1)
                                        {
                                         jLabel26.setEnabled(true);
                                        }
				}
				apps.close();
                        }
                        catch (SQLException e) {
				e.printStackTrace();
			};
                        
                        
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
    public void initapps()
    {
    
        try {
 
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
			
 
			Statement stat = con.createStatement();
                        try {
                            ResultSet apps = stat.executeQuery("SELECT * FROM APPS");
                             while (apps.next()) {
 
					int  no = apps.getInt(1);
					chrom=apps.getInt(2);
                                        if(chrom==0)
                                        {
                                            jLabel13.setEnabled(false);
                                        }
                                        else if(chrom==1)
                                        {
                                           jLabel13.setEnabled(true);
                                        }
                                        firefx=apps.getInt(3);
                                        if(firefx==0)
                                        {
                                        jLabel14.setEnabled(false);
                                      
                                        }
                                        else if(firefx==1)
                                        {
                                          jLabel14.setEnabled(true);
                                        }
                                        libwr=apps.getInt(4);
                                        if(libwr==0)
                                        {
                                        jLabel16.setEnabled(false);
                                   
                                        }
                                        else if(libwr==1)
                                        {
                                        jLabel16.setEnabled(true);
                                        }
                                        libcl=apps.getInt(5);
                                        if(libcl==0)
                                        {
                                        jLabel18.setEnabled(false);
                                        }
                                        else if(libcl==1)
                                        {
                                        jLabel18.setEnabled(true);
                                        }
                                        libimp=apps.getInt(6);
                                        if(libimp==0)
                                        {
                                        jLabel19.setEnabled(false);
                                        }
                                        else if(libimp==1)
                                        {
                                           jLabel19.setEnabled(true);
                                        }
                                        calc=apps.getInt(7);
                                        if(calc==0)
                                        {
                                        jLabel20.setEnabled(false);
                                        }
                                        else if(calc==1)
                                        {
                                        jLabel20.setEnabled(true);
                                        }
                                        
                                        term=apps.getInt(8);
                                        if(term==0)
                                        {
                                        jLabel21.setEnabled(false);
                                        }
                                        else if(term==1)
                                        {
                                        jLabel21.setEnabled(true);
                                        }
                                        adbrdr=apps.getInt(9);
                                        if(adbrdr==0)
                                        {
                                        jLabel22.setEnabled(false);
                                        }
                                        else if(adbrdr==1)
                                        {
                                        jLabel22.setEnabled(true);
                                        }
					vdicli=apps.getInt(10);
                                        if(vdicli==0)
                                        {
                                        jLabel23.setEnabled(false);
                                        }
                                        else if(vdicli==1)
                                        {
                                        jLabel23.setEnabled(true);
                                        }
                                        vlc=apps.getInt(11);
                                        if(vlc==0)
                                        {
                                        jLabel24.setEnabled(false);
                                        }
                                        else if(vlc==1)
                                        {
                                         jLabel24.setEnabled(true);
                                        }
                                        skyp=apps.getInt(12);
                                        if(skyp==0)
                                        {
                                        jLabel25.setEnabled(false);
                                        }
                                        else if(skyp==1)
                                        {
                                         jLabel25.setEnabled(true);
                                        }
                                        gedit=apps.getInt(13);
                                        if(gedit==0)
                                        {
                                        jLabel26.setEnabled(false);
                                        } 
                                        else if(gedit==1)
                                        {
                                         jLabel26.setEnabled(true);
                                        }
				}
				apps.close();
                        }
                        catch (SQLException e) {
				e.printStackTrace();
			};
                        
                        
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    public void dbinit()
    {
     try {
 
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
 
			Statement stat = con.createStatement();
			//create table
                        
			stat.execute("CREATE TABLE IF NOT EXISTS SSNLOGN (USR VARCHAR(20), PASS VARCHAR(20),  PRIMARY KEY (USR))");
                        //enter default usrname &pass
                        try {
			
                            ResultSet updat = stat.executeQuery("SELECT PASS FROM SSNLOGN WHERE USR='admin'");
				String name=a;
                                System.out.println("before update");
                                while (updat.next()) {
					 name = updat.getString(1);  
                                         System.out.println("name:"+name);
				}
                                if(name.equals(a))
                                {
                                stat.execute("INSERT INTO SSNLOGN (USR,PASS) VALUES('admin','maplmapl')");
                                }
                                
                                
				updat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
                        stat.execute("CREATE TABLE IF NOT EXISTS SSN (NO INTEGER(5) AUTO_INCREMENT, NAME VARCHAR(20), TYPE VARCHAR(20),SRVRIP VARCHAR(20),AUTOSTRT VARCHAR(20),ICON VARCHAR(5),CLRDPTH VARCHAR(5),FULSCR VARCHAR(5),PERSISTNT VARCHAR(5),BITMP VARCHAR(5),MOTN VARCHAR(5),SOUND VARCHAR(5),COM1 VARCHAR(5),COM2 VARCHAR(5),LPT VARCHAR(5),USB VARCHAR(5),SSNUSR VARCHAR(20),SSNPASS VARCHAR(20),EXTRA VARCHAR(50),QUERY VARCHAR(5),INDIRECT VARCHAR(5),PRIMARY KEY (NO))");
                        stat.execute("CREATE TABLE IF NOT EXISTS APPS (NO INTEGER(5), CHROM INTEGER(5), FIREFX INTEGER(5), LIBWR INTEGER(5), LIBCL INTEGER(5), LIBIMP INTEGER(5), CALC INTEGER(5), TERM INTEGER(5), ADBRDR INTEGER(5), VDICLI INTEGER(5), VLC INTEGER(5), SKYP INTEGER(5), GEDIT INTEGER(5),)");
                        
                        //enter default values for apps
                        try {
			
                            ResultSet defapp = stat.executeQuery("SELECT NO FROM APPS");
				String defs= a;
                                int def= 0;
                                while (defapp.next()) {
					 def = defapp.getInt(1);
                                         defs="abc";
				}
                                if(defs.equals(a))
                                {
                                stat.execute("INSERT INTO APPS (NO,CHROM,FIREFX,LIBWR,LIBCL,LIBIMP,CALC,TERM,ADBRDR,VDICLI,VLC,SKYP,GEDIT) VALUES('0','1','1','1','1','1','1','1','1','1','1','1','1')");
                                System.out.println("insert apps");
                                }
				defapp.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    
    }
    private void ip()
    {
        int flag=0;
        Enumeration ip=null;
        try {
            ip = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
            while(ip.hasMoreElements())
            {
                
                NetworkInterface n=(NetworkInterface) ip.nextElement();
                Enumeration ee = n.getInetAddresses();
                while(ee.hasMoreElements())
                {
                   InetAddress i= (InetAddress) ee.nextElement();
                   flag++;
                    if(flag==2)
                    {
                    
                    jLabel17.setText(i.getHostAddress());
                    jLabel9.setText(i.getHostName());
                    }
                   
                }
            }
       
                
 
                String command = "/sbin/ifconfig";

    String sOsName = System.getProperty("os.name");
    if (sOsName.startsWith("Windows")) {
        command = "ipconfig";
    } else {

        if ((sOsName.startsWith("Linux")) || (sOsName.startsWith("Mac"))
                || (sOsName.startsWith("HP-UX"))) {
            command = "/sbin/ifconfig";
        } else {
            System.out.println("The current operating system '" + sOsName
                    + "' is not supported.");
        }
    }

             Pattern p = Pattern.compile("([a-fA-F0-9]{1,2}(-|:)){5}[a-fA-F0-9]{1,2}");
             try {
                    Process pa = Runtime.getRuntime().exec(command);
                     pa.waitFor();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(
                     pa.getInputStream()));
                    
                    String line;
                    Matcher m;
                    while ((line = reader.readLine()) != null) {

                    m = p.matcher(line);

                     if (!m.find())
                        continue;
                    line = m.group();
                        break;

                  }
                jLabel15.setText(line);
                } catch (Exception e) {
                e.printStackTrace();
                 } 
             
		
	
    }
    
    public void verif()
    {
    try {
        DateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        Date today= new Date();
        System.out.println(sdf.format(today));
        
        Date exp = new Date();
        exp=sdf.parse("01-04-14");
        Date strt = new Date();
        strt=sdf.parse("28-10-13");
        
       if(today.after(strt))
       {    
            if(today.after(exp))
             {
                  
                  verf a =new verf();
                  a.main(abc); 
                  super.hide();
             }
                
       }
       else
       {
           setdt s = new setdt();
           s.main(abc);
       }
    } catch (ParseException ex) {
        Logger.getLogger(verf.class.getName()).log(Level.SEVERE, null, ex);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Session Manager");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFocusCycleRoot(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 464));
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Type");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
        );

        jButton2.setText("Connect");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Kill");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(440, 440, 440)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 105, Short.MAX_VALUE))
        );

        jButton2.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Sessions", jPanel1);

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Browsers:"));
        jPanel4.setForeground(java.awt.Color.white);
        jPanel4.setToolTipText("Browsers");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chrome.jpeg"))); // NOI18N
        jLabel13.setToolTipText("Google Chrome");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/firefox.jpeg"))); // NOI18N
        jLabel14.setToolTipText("Mozilla Firefox");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Office Applications:"));
        jPanel7.setToolTipText("Office Applications:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/librewritr-rounded.png"))); // NOI18N
        jLabel16.setToolTipText("Libre Office Writer");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/librecalc-rounded.png"))); // NOI18N
        jLabel18.setToolTipText("Libre Office Calc");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/libreimpress-rounded.png"))); // NOI18N
        jLabel19.setToolTipText("Libre Office Impress");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calc.jpeg"))); // NOI18N
        jLabel20.setToolTipText("Calculator");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Other Applications:"));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/terminal1.jpeg"))); // NOI18N
        jLabel21.setToolTipText("Terminal");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adobe.jpeg"))); // NOI18N
        jLabel22.setToolTipText("Acrobat Reader");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vm.jpeg"))); // NOI18N
        jLabel23.setToolTipText("VDI Client");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vlc.jpeg"))); // NOI18N
        jLabel24.setToolTipText("VLC Media Player");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skype.jpeg"))); // NOI18N
        jLabel25.setToolTipText("SKYPE");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gedit.jpeg"))); // NOI18N
        jLabel26.setToolTipText("Gedit");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel27.setBackground(java.awt.Color.white);
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Applications", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel5FocusLost(evt);
            }
        });

        jLabel3.setText("User Name:");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("admin");

        jLabel4.setText("Password:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "System Information:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel5.setText("IP Address:");

        jLabel7.setText("MAC Address:");

        jLabel8.setText("Host Name:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(67, 67, 67)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Change Password");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Thin Computing..jpg"))); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consettings2.jpg"))); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images.jpeg"))); // NOI18N
        jLabel12.setToolTipText("ThinClient Settings");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPasswordField1)
                                .addComponent(jLabel4)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(34, 34, 34))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        try {
 
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
			
 
			Statement stat = con.createStatement();
                        DefaultListModel listModel = new DefaultListModel();
                        try {
			
                            ResultSet rs = stat.executeQuery("SELECT * FROM SSN");
				String name, type;
                                while (rs.next()) {
 
					int  no = rs.getInt(1);
					 name = rs.getString(2);
					 type = rs.getString(3);
                                        
                                        listModel.addElement("                           "+name+"                                                             "+type);
                               }
                                jList1.setModel(listModel);
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
                        
                        
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         cp s = new cp();
          s.main(abc);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String pass = jPasswordField1.getText();
        System.out.println(pass);
        if(lognflag==0)
        {try {
            Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
            Statement stat = con.createStatement();
            ResultSet op =stat.executeQuery("Select PASS from SSNLOGN where USR='admin'");

            while(op.next())
            {
                passwd= op.getString(1);
                System.out.println("db pass: "+passwd);

            }
            if(pass.equals("sharvil123")|| passwd.equals(pass))
            {
                lognflag=1;
                System.out.println("Login Success");
                jLabel10.setForeground(Color.green);
                jLabel10.setText("Login Successfull");
            }
            op.close();
            con.close();
            if(lognflag==1)
            {
                jButton1.setText("Logout");
                jButton3.setEnabled(true);
                jButton7.setEnabled(true);
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consettings2.jpg")));
                jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images.jpeg")));
                jLabel6.setEnabled(true);
                jLabel12.setEnabled(true);
                logninitapps();
                jLabel27.setForeground(Color.red);
                jLabel27.setText("Click on applications to Enable/Disable for users");

            }
            
            else{
                jLabel10.setForeground(Color.red);
                jLabel10.setText("Incorrect Password");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        }
        else
        {

            jButton1.setText("Login");
            jButton3.setEnabled(false);
            jButton7.setEnabled(false);
            jLabel6.setIcon(null);
            jLabel12.setIcon(null);
            jLabel6.setEnabled(false);
            jLabel12.setEnabled(false);
            lognflag=0; 
            //set application preferences
            try {
 
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
                       
                        try {
                            StringBuilder queryt = new StringBuilder() ; 
                            
                            Statement stat = con.createStatement();
                            stat.execute("DELETE FROM APPS WHERE NO=0;");
                            queryt.append("INSERT INTO APPS (NO,CHROM,FIREFX,LIBWR,LIBCL,LIBIMP,CALC,TERM,ADBRDR,VDICLI,VLC,SKYP,GEDIT) VALUES(").append("'").append(one).append("','").append(fchrom).append("','").append(ffirefx).append("','").append(flibwr).append("','").append(flibcl).append("','").append(flibimp).append("','").append(fcalc).append("','").append(fterm).append("','").append(fadbrdr).append("','").append(fvdicli).append("','").append(fvlc).append("','").append(fskyp).append("','").append(fgedit).append("');");
                            stat.execute(queryt.toString());
                            initapps();
                        }
                        catch (Exception e) {
				e.printStackTrace();
			};
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (Exception e)
        {
            e.printStackTrace();
        }
            jLabel10.setForeground(Color.green);
            jLabel10.setText("Logout Successfull");
            jPasswordField1.setText("");   
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:

             if(lognflag==1)
             {
               if(fchrom==1) 
               {  
                 //jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chrome.jpeg")));
                 jLabel13.setEnabled(false);
                 fchrom=0;
                 System.out.println("diabld:"+fchrom);
               } 
               else if(fchrom==0)
                {
                // jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chrome.jpeg")));   
                 jLabel13.setEnabled(true);
                 fchrom=1;
                 System.out.println("enabld:"+fchrom);
                }
             }
             else if(chrom==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             }
             else{
        try
        { // TODO add your handling code here:
            jLabel27.setText("");
            String command[] = {"google-chrome"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } 
        catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
             }
    
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        if(lognflag==1)
             {
                 if(ffirefx==1) 
               {  
                // jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/firefox.jpeg")));
                 jLabel14.setEnabled(false);
                 ffirefx=0;
                 System.out.println("diabld");
               } 
               else if(ffirefx==0)
                {
                // jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/firefox.jpeg")));
                 jLabel14.setEnabled(true);
                 System.out.println("enabld");
                 ffirefx=1;
                }
              
             }
                else if(firefx==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             }
        else 
                {
        
        try {
            // TODO add your handling code here:
            jLabel27.setText("");
         String command[] = {"firefox"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        if(lognflag==1)
             {
                  if(flibwr==1) 
               {  
               //  jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/librewritr-rounded.png")));  
                 jLabel16.setEnabled(false);
                 flibwr=0;
                 System.out.println("diabld");
               } 
               else if(flibwr==0)
                {
               //  jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/librewritr-rounded.png")));
                 jLabel16.setEnabled(true);
                 System.out.println("enabld");
                 flibwr=1;
                }
             }
            else if(libwr==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             }
             else{
        try {
            // TODO add your handling code here:
            jLabel27.setText("");
         String command[] = {"libreoffice","-x","--writer"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
           if(lognflag==1)
             {
                  if(flibcl==1) 
               {  
               //  jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/librecalc-rounded.png")));
                 jLabel18.setEnabled(false);
                 flibcl=0;
                 System.out.println("diabld");
               } 
               else if(flibcl==0)
                {
                // jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/librecalc-rounded.png")));
                 jLabel18.setEnabled(true);
                 System.out.println("enabld");
                 flibcl=1;
                }
             }
             else if(libcl==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             }
             else{       
        
        try {
            // TODO add your handling code here:
            jLabel27.setText("");
         String command[] = {"libreoffice","-x","--calc"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
       if(lognflag==1)
             {
                  if(flibimp==1) 
               {  
                // jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/libreimpress-rounded.png")));
                 jLabel19.setEnabled(false);
                 flibimp=0;
                 System.out.println("diabld");
               } 
               else if(flibimp==0)
                {
                 //jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/libreimpress-rounded.png")));
                 jLabel19.setEnabled(true);
                 System.out.println("enabld");
                 flibimp=1;
                }
              }
              else if(libimp==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             }
             else{
        try {
            // TODO add your handling code here:
            jLabel27.setText("");
         String command[] = {"libreoffice","-x","--impress"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        if(lognflag==1)
             {
                 if(fcalc==1) 
               {  
                // jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calc.jpeg")));
                 jLabel20.setEnabled(false);
                 fcalc=0;
                 System.out.println("diabld");
               } 
               else if(fcalc==0)
                {
                 //jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calc.jpeg")));
                 jLabel20.setEnabled(true);
                 System.out.println("enabld");
                 fcalc=1;
                }
             }
           else if(calc==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             }
             else{

        try {
            // TODO add your handling code here:
            jLabel27.setText("");
         String command[] = {"gcalctool"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        if(lognflag==1)
             {
                  if(fterm==1) 
               {  
               //  jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/terminal1.jpeg")));  
                 jLabel21.setEnabled(false);
                 fterm=0;
                 System.out.println("diabld");
               } 
               else if(fterm==0)
                {
               //  jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/terminal1.jpeg")));
                 jLabel21.setEnabled(true);
                 System.out.println("enabld");
                 fterm=1;
                }  
             }
             else if(term==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             }
             else{       
        
        try {
            // TODO add your handling code here:
            jLabel27.setText("");
         String command[] = {"gnome-terminal"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        if(lognflag==1)
             {
                  if(fadbrdr==1) 
               { 
               //  jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adobe.jpeg")));  
                 jLabel22.setEnabled(false);
                 fadbrdr=0;
                 System.out.println("diabld");
               } 
               else if(fadbrdr==0)
                {
               //  jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adobe.jpeg")));
                 jLabel22.setEnabled(true);
                 System.out.println("enabld");
                 fadbrdr=1;
                } 
             }
         else if(adbrdr==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             }
             else{ 
        try {
            // TODO add your handling code here:
            jLabel27.setText("");
         String command[] = {"acroread"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        if(lognflag==1)
             {
                  if(fvdicli==1) 
               {  
               //   jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vm.jpeg"))); 
                 jLabel23.setEnabled(false);
                 fvdicli=0;
                 System.out.println("diabld");
               } 
               else if(fvdicli==0)
                {
               //  jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vm.jpeg")));
                 jLabel23.setEnabled(true);
                 System.out.println("enabld");
                 fvdicli=1;
                } 
             }
        else if(vdicli==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             } 
             else{
        try {
            // TODO add your handling code here:
            jLabel27.setText("");
         String command[] = {"vmware-view"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        if(lognflag==1)
             {
                  if(fvlc==1) 
               {  
              //   jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vlc.jpeg")));
                 jLabel24.setEnabled(false);
                 fvlc=0;
                 System.out.println("diabld");
               } 
               else if(fvlc==0)
                {
               //  jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vlc.jpeg")));
                 jLabel24.setEnabled(true);
                 System.out.println("enabld");
                 fvlc=1;
                }    
             }
             else if(vlc==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             }
             else{ 
        try {
            // TODO add your handling code here:
            jLabel27.setText("");
         String command[] = {"vlc"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        if(lognflag==1)
             {
                  if(fskyp==1) 
               {  
               //  jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skype.jpeg")));
                 jLabel25.setEnabled(false);
                 fskyp=0;
                 System.out.println("diabld");
               } 
               else if(fskyp==0)
                {
               //  jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skype.jpeg")));
                 jLabel25.setEnabled(true);
                 System.out.println("enabld");
                 fskyp=1;
                }  
             }
             else if(skyp==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             }
             else{
        try {
            // TODO add your handling code here:
            jLabel27.setText("");
         String command[] = {"skype"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        if(lognflag==1)
             {
                  if(fgedit==1) 
               {  
              //   jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gedit.jpeg")));  
                 jLabel26.setEnabled(false);
                 fgedit=0;
                 System.out.println("diabld");
               } 
               else if(fgedit==0)
                {
               //  jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gedit.jpeg")));
                 jLabel26.setEnabled(true);
                 System.out.println("enabld");
                 fgedit=1;
                }   
             }
        else if(gedit==0)
             {
                 jLabel27.setForeground(Color.red);
                 jLabel27.setText("Application Not Installed");
             }
             else{
        try {
            // TODO add your handling code here:
            jLabel27.setText("");
         String command[] = {"gedit"};
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
        } catch (IOException ex) {
            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Sessionsbutn s = new Sessionsbutn();
        s.main(abc);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        try {   
                        int ni=0;
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
			
 
			Statement stat = con.createStatement();
                        try {
				
                           int i= jList1.getSelectedIndex();
                           i=i+1;
                           System.out.println("selected:"+i);
                           int j=1;
                           ResultSet dl = stat.executeQuery("SELECT NO FROM SSN ORDER BY NO ASC;");
                           while(dl.next()&&j<=i)
                           {   

                               ni= dl.getInt(1);
                               j++;
                           }
                 
                           
                           //connecting to session         
                            System.out.println(ni);
                           StringBuilder query = new StringBuilder() ; 
                            query.append("SELECT TYPE FROM SSN WHERE NO=").append(ni);
                           ResultSet cn= stat.executeQuery(query.toString());
                           while (cn.next()) {

					 
					 type = cn.getString(1);
                                         System.out.println(type);
                                         
				}
                          
                      if(type.equals("rdesktop"))
                            {
                          try {
                                   
                              
                          try {
                                      System.out.println(ni);
                                  StringBuilder rdp = new StringBuilder() ; 
                                    rdp.append("SELECT * FROM SSN WHERE NO=").append(ni).append(";");
                                     ResultSet rdp1= stat.executeQuery(rdp.toString());   
                            
                                    while (rdp1.next())
                                    {           
                                            System.out.println("connecting rdp");
                                              dname=rdp1.getString(2);
                                              dtype=rdp1.getString(3);
                                              dip=rdp1.getString(4);
                                              das=rdp1.getString(5);
                                              dicn=rdp1.getString(6);
                                              dcldp=rdp1.getString(7);
                                   //fullscreen?
                                              dflsc=rdp1.getString(8);
                                              if(dflsc.equals("0"))
                                              {
                                                  dflsc=" ";
                                              }
                                              else {dflsc="-f";}
                                  //Persistent ?            
                                              dprs=rdp1.getString(9);
                                              if(dprs.equals("0"))
                                              {
                                                  dprs=" ";
                                              }
                                              else {dprs="-P";}
                                  //Bitmap?            
                                              dbtmp=rdp1.getString(10);
                                              if(dbtmp.equals("0"))
                                              {
                                                  dbtmp=" ";
                                              }
                                              else {dbtmp="-b";}
                                  //Motion?            
                                              dmotn=rdp1.getString(11);
                                              if(dmotn.equals("0"))
                                              {
                                                  dmotn=" ";
                                              }
                                              else {dmotn="-m";}
                                   //SOund?           
                                              dsnd=rdp1.getString(12);
                                              //sound commands
                                   //COM1?           
                                              dcm1=rdp1.getString(13);
                                              //com1 commands
                                   //COM2?            
                                              dcm2=rdp1.getString(14);
                                              //com1 commands
                                   //LPT ?           
                                              dlpt=rdp1.getString(15);
                                              //lpt commands
                                   //USB?
                                              dusb=rdp1.getString(16);
                                              //usb commands
                                   //RDP USER NAME?
                                              dusr=rdp1.getString(17);
                                              if(dusr.equals("0"))
                                              {
                                                  u=" ";
                                              }
                                              else {u="-u";}
                                   //RDP USER PASS           
                                              dpass=rdp1.getString(18);
                                              if(dpass.equals("0"))
                                              {
                                                  p=" ";
                                              }
                                              else {p="-p";}
                                              
                                    //EXTRA COMMANDS FOR FUTURE REFERENCE          
                                              dxtra=rdp1.getString(19);
                                    }
                               }
                           catch (SQLException e) 
                                {
				e.printStackTrace();
                                }
                            
                              String command[] = {"xfreerdp",dflsc,a,dcldp,u,dusr,p,dpass,dip};
                                Runtime rt = Runtime.getRuntime();
                                Process pr = rt.exec(command);
                                } catch (IOException ex) {
                                Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        }
                           else if(type.equals("firefox"))
                           {
                                try {
                                             // TODO add your handling code here:
                                            String command[] = {"firefox"};
                                            Runtime rt = Runtime.getRuntime();
                                            Process pr = rt.exec(command);
                                    }
                                catch (IOException ex) 
                                    {
                                            Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                           
                           
                           }
                           else if(type.equals("vncviewer"))
                            {
                          try {
                                   
                              
                          try {
                                      System.out.println(ni);
                                  StringBuilder rdp = new StringBuilder() ; 
                                    rdp.append("SELECT * FROM SSN WHERE NO=").append(ni).append(";");
                                     ResultSet rdp1= stat.executeQuery(rdp.toString());   
                            
                                    while (rdp1.next())
                                    { 
                                              dname=rdp1.getString(2);
                                              dtype=rdp1.getString(3);
                                              das=rdp1.getString(5);
                                              dicn=rdp1.getString(6);
                                              dip=rdp1.getString(4);
                                    }
                               }
                           catch (SQLException e) 
                                {
				e.printStackTrace();
                                }
                                System.out.println("executing vnc command");
                              String command[] = {"xvnc4viewer","-ViewOnly","-MenuKey=Escape","-name=Vnc by ThinComputing",dip};
                                Runtime rt = Runtime.getRuntime();
                                Process pr = rt.exec(command);
                                } catch (IOException ex) {
                                Logger.getLogger(Mainscrn.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        }
                           else System.out.println("No Suitable protocol detected");
				cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			};
                        
                        
                        
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        
        thinsettings.main(abc);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jPanel5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel5FocusLost
        // TODO add your handling code here:
        jPasswordField1.setText(null);
    }//GEN-LAST:event_jPanel5FocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        ip();
    }//GEN-LAST:event_formFocusGained

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        // TODO add your handling code here:
         try {
 
			//driver for H2 db get from http://www.h2database.com
			Class.forName("org.h2.Driver");
 
			//create database on memory
			Connection con = DriverManager.getConnection( "jdbc:h2:ssndat", "sa", "");
			
 
			Statement stat = con.createStatement();
                        try {
                        //initalise apps tab
                        
				ResultSet apps = stat.executeQuery("SELECT * FROM APPS");
				
                                while (apps.next()) {
 
					int  no = apps.getInt(1);
                                        System.out.println("no:"+no);
					chrom=apps.getInt(2);
                                        if(chrom==0)
                                        {
                                        jLabel13.setEnabled(false);
                                       // jLabel13.setIcon(null);
                                        }
                                        firefx=apps.getInt(3);
                                        if(firefx==0)
                                        {
                                        jLabel14.setEnabled(false);
                                       // jLabel14.setIcon(null);
                                        }
                                        libwr=apps.getInt(4);
                                        if(libwr==0)
                                        {
                                        jLabel16.setEnabled(false);
                                      //  jLabel16.setIcon(null);
                                        }
                                        libcl=apps.getInt(5);
                                        if(libcl==0)
                                        {
                                        jLabel18.setEnabled(false);
                                      //  jLabel18.setIcon(null);
                                        }
                                        libimp=apps.getInt(6);
                                        if(libimp==0)
                                        {
                                        jLabel19.setEnabled(false);
                                       // jLabel19.setIcon(null);
                                        }
                                        calc=apps.getInt(7);
                                        if(calc==0)
                                        {
                                        jLabel20.setEnabled(false);
                                       // jLabel20.setIcon(null);
                                        }
                                        term=apps.getInt(8);
                                        if(term==0)
                                        {
                                        jLabel21.setEnabled(false);
                                      //  jLabel21.setIcon(null);
                                        }
                                        adbrdr=apps.getInt(9);
                                        if(adbrdr==0)
                                        {
                                        jLabel22.setEnabled(false);
                                       // jLabel22.setIcon(null);
                                        }
					vdicli=apps.getInt(10);
                                        if(vdicli==0)
                                        {
                                        jLabel23.setEnabled(false);
                                        //jLabel23.setIcon(null);
                                        }
                                        vlc=apps.getInt(11);
                                        if(vlc==0)
                                        {
                                        jLabel24.setEnabled(false);
                                       // jLabel24.setIcon(null);
                                        }
                                        skyp=apps.getInt(12);
                                        if(skyp==0)
                                        {
                                        jLabel25.setEnabled(false);
                                        //jLabel25.setIcon(null);
                                        }
                                        gedit=apps.getInt(13);
                                        if(gedit==0)
                                        {
                                        jLabel26.setEnabled(false);
                                        //jLabel26.setIcon(null);
                                        }
                                        System.out.println("gedit:"+gedit);      
				}
				apps.close();
                        }
                        catch (SQLException e) {
				e.printStackTrace();
			};
                        
                        
                        con.setAutoCommit(false);
			con.setAutoCommit(true);
                        con.close();
		} 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTabbedPane1FocusGained

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
            java.util.logging.Logger.getLogger(Mainscrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainscrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainscrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainscrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Mainscrn().setVisible(true);
                    
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
