
//import Details.addDays;
import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;  

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Garvit
 */
public class ModifyBooking extends javax.swing.JFrame {
    String loc;int idf;
         String hotelname;
          String roomtype;
           String checkin;
            String checkout;
            int noOfPeople;
            int noOfRooms;
            java.util.Date checkOut;
            java.util.Date checkIn;
            String bookref;
            int ocf;
            
            String name;
            String username;
            
    /**
     * Creates new form ModifyBooking
     */
    public ModifyBooking() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
     public ModifyBooking(String ref,String l,String h,String r,String cin, String cout, int n,int m,String naam,String usernaam) {
        bookref = ref;
          loc=l;
          name=naam;
          username=usernaam;
          hotelname=h;
           roomtype=r;
            checkin=cin;
             checkout=cout;
            // System.out.println(cin);
             //System.out.println(cout);
             noOfPeople=n;
             try{
            checkOut=new SimpleDateFormat("yyyy-MM-dd").parse(checkout);
              checkIn=new SimpleDateFormat("yyyy-MM-dd").parse(checkin);}
             catch(Exception e){}
            noOfRooms=m;
         //   System.out.println(checkIn);
           //  System.out.println(checkOut);
            // bookref=bokref;
            
        initComponents();
        this.setLocationRelativeTo(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hname = new javax.swing.JLabel();
        rtype = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        noofrooms = new javax.swing.JComboBox<>();
        noofguests = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setVisible(false);
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 530));
        setSize(new java.awt.Dimension(900, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modify Your Booking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(485, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 80));

        hname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hname.setForeground(new java.awt.Color(255, 255, 255));
        hname.setText("Hotel Name");
        getContentPane().add(hname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 134, -1, -1));

        rtype.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rtype.setForeground(new java.awt.Color(255, 255, 255));
        rtype.setText("Room Type");
        getContentPane().add(rtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Check-in Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Check-out Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Select Number of Rooms");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 261, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Select Number of Guests");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 311, -1, 30));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Confirm");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Sign Out");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 130, -1));

        noofrooms.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noofrooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        noofrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noofroomsActionPerformed(evt);
            }
        });
        getContentPane().add(noofrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 60, -1));

        noofguests.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noofguests.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18" }));
        noofguests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noofguestsActionPerformed(evt);
            }
        });
        getContentPane().add(noofguests, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 60, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 140, 30));

        hname.setText(hotelname);
        rtype.setText(roomtype);
        noofrooms.setSelectedIndex(noOfRooms-1);
        noofguests.setSelectedIndex(noOfPeople-1);
        jDateChooser2.setDate(checkOut);
        jDateChooser1.setDate(checkIn);
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price after modification: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Check Price");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 170, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 910, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void noofroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noofroomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noofroomsActionPerformed

    private void noofguestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noofguestsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noofguestsActionPerformed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1PropertyChange

    
    int getPrice()
    {
        int newNumOR=Integer.parseInt(noofrooms.getSelectedItem().toString());
        int newNumOP=Integer.parseInt(noofguests.getSelectedItem().toString());
        java.util.Date newcheckIn =jDateChooser1.getDate();
        java.util.Date newcheckOut =jDateChooser2.getDate();
        long diff = newcheckOut.getTime() - newcheckIn.getTime(); 
        int days=(int)(diff/ 1000 / 60 / 60 / 24);
         String url="jdbc:mysql://localhost:3306/sys";
        String mysqluname="root";
        String mysqlpass="mysql";
        String query ="select * from bookinglist";
        int price = 1;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c2 = DriverManager.getConnection(url,mysqluname,mysqlpass);
            Statement s2=c2.createStatement();
            ResultSet rs2 = s2.executeQuery(query);
            while(rs2.next())
            {
                String ref = rs2.getString(2);
                if(bookref.equals(ref))
                {
                    price = rs2.getInt(12);
                }
            }
        }

        catch(Exception e){}
        
        return price/noOfRooms*days*newNumOR;
    }
    
    public static java.util.Date addDays(java.util.Date date, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
				
		return cal.getTime();
	}
    
    boolean availability(int id,java.util.Date newCI,java.util.Date newCO,int newNOR)
    {
     
         int flag=0;
        try{
      
        }
        catch(Exception e){}
        
        String url="jdbc:mysql://localhost:3306/sys";
        String mysqluname="root";
        String mysqlpass="mysql";
        java.sql.Date sqlTemp;
            //boolean f =false;
            String query="select * from r"+id;
            try{
      
            java.util.Date bdate;
            java.util.Date temp=newCI;
            int flg=3;String n;
            
    
            
            while(temp.before(newCO))
            {
                
              
            //boolean f =false;
            String query1="select * from r"+id;
            Class.forName("com.mysql.jdbc.Driver");
            Connection c1 = DriverManager.getConnection(url,mysqluname,mysqlpass);
            Statement s1=c1.createStatement();
            ResultSet rs1 = s1.executeQuery(query1);
            
           
             sqlTemp= new java.sql.Date(temp.getTime());
            //ArrayList<String> hotels= new ArrayList<String>();
            while (rs1.next())
            {
                bdate=rs1.getDate(1);
               // bCheckOut=rs.getDate(2);
                n=rs1.getString(2);
             //   System.out.println(n + "  ");
                if(!n.equals(""))
                {    
                    int n1=Integer.parseInt(n);
                    
                if((sqlTemp.toString().equals(bdate.toString())&&(newNOR>n1)))
                { 
                    flg=1;
                    break;
                   
                }
                else if ((sqlTemp.toString().equals(bdate.toString())&&(newNOR<=n1)))
                {
                    flg =2;
                    break;
                }
                else flg=3;
                
                }
          
            }
            if(flg==1)
                {
                    flag=1;
                    break;
                    
                }
              else
            {
                    temp=addDays(temp,1);
            } 
                    s1.close();
                    c1.close();
                
 }

    }
            catch(Exception e){}//System.out.println(e);
            
            
        
        if(flag==1)
            return false;
        return true;
        }
    
    
     boolean checkIfInDatabase(int roomid, java.util.Date d)
    {
         String url="jdbc:mysql://localhost:3306/sys";
        String mysqluname="root";
        String mysqlpass="mysql";
            boolean f =false;
            String query="select * from r"+roomid;
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,mysqluname,mysqlpass);
            Statement s=c.createStatement();
            ResultSet rs = s.executeQuery(query);
            //System.out.println("Details submitted successfully");
            java.util.Date d1=new java.sql.Date (d.getTime());
            while (rs.next())
            {
                
                if(!d1.toString().equals(((rs.getString(1)))))
                {//System.out.println("Successful login");
                   //.out.println(d1+"          "+rs.getDate(1));
                continue;}
                else
                {
                    f=true;
                    break;
                }
            }
            s.close();
            c.close();
            //this.dispose();
            
            
            
    }
            catch(Exception e){}
            return f;
    }
    
    
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
        if((Integer.parseInt(noofrooms.getSelectedItem().toString())==noOfRooms&&Integer.parseInt(noofguests.getSelectedItem().toString())==noOfPeople)&&(jDateChooser1.getDate().equals(checkIn)&&jDateChooser2.getDate().equals(checkOut)))
        {
            JOptionPane.showMessageDialog(null, "No change detected!","Error" ,JOptionPane.ERROR_MESSAGE);
        }
        else
        {        
            int newNOR=Integer.parseInt(noofrooms.getSelectedItem().toString());
           int newNOP=Integer.parseInt(noofguests.getSelectedItem().toString());
           java.util.Date newCI =jDateChooser1.getDate();
           java.util.Date newCO =jDateChooser2.getDate();
           
           int NORchange = newNOR-noOfRooms;
           int NOPchange = newNOP-noOfPeople;
            String url="jdbc:mysql://localhost:3306/sys";
            String mysqluname="root";
            String mysqlpass="mysql";
            boolean f =false;
            String query="select * from "+loc;
            
            long millis=System.currentTimeMillis();  
            java.util.Date currentDate=new java.util.Date(millis);  
            String checkin1 = "";
            String checkout1 = "";
            for(int i=4;i<=9;i++)
                checkin1=checkin1+newCI.toString().charAt(i);
                checkin1=checkin1+", ";
            for(int i=30;i<=33;i++)
                checkin1=checkin1+newCI.toString().charAt(i);
            for(int i=4;i<=9;i++)
                checkout1=checkout1+newCO.toString().charAt(i);
                checkout1=checkout1+", ";
            for(int i=30;i<=33;i++)
                checkout1=checkout1+newCO.toString().charAt(i);
        
        if(newCI.before(currentDate))
        {
            JOptionPane.showMessageDialog(null, "Enter a Check in date after today's date","Error" ,JOptionPane.ERROR_MESSAGE);
        }
        else if(newCI.after(newCO))
        {
            JOptionPane.showMessageDialog(null, "Check in date cannot be after Check out","Error" ,JOptionPane.ERROR_MESSAGE);
        }
        else if(checkin1.equals(checkout1))
        {
            JOptionPane.showMessageDialog(null, "Check in date cannot be same as Check out date!","Error" ,JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,mysqluname,mysqlpass);
            Statement s=c.createStatement();
            ResultSet rs = s.executeQuery(query);
       //     System.out.println(hotelname+"      "+roomtype);
           // int i=0;
            while (rs.next())
            {
               // System.out.println("while"+(i++));
                if(hotelname.equals(rs.getString(1))&&roomtype.equals(rs.getString(2)))
                {
                    idf=Integer.parseInt(rs.getString(9));
                    ocf=rs.getInt(10);
                    break;
                
            }
              //  System.out.println(idf+"PPPPPPPPPPPPPlooloollPP");
           
          }
            s.close();
            c.close();}
    
            catch(Exception e){}
            
            
            
            
            
            
             if(availability(idf,newCI,newCO,NORchange))
             {
            try{
        
        java.util.Date temp=checkIn;
        java.sql.Date sqlTemp=new java.sql.Date (temp.getTime());
        java.sql.Date sqlCO = new java.sql.Date (checkOut.getTime());
        String queryX="select * from r"+idf+" ;";
       Connection cx = DriverManager.getConnection(url,mysqluname,mysqlpass);
           Statement sx=cx.createStatement();
           
           System.out.println("checkin  "+checkIn+"    checkout  "+checkOut+"   sqlCO  "+sqlCO);
           Connection c1x = DriverManager.getConnection(url,mysqluname,mysqlpass);
           Statement s1x=c1x.createStatement();
        //ADD OLD NO. OF ROOMS
            while(temp.before(checkOut) ||  sqlTemp.toString().equals(sqlCO.toString()))
            {
                sqlTemp=new java.sql.Date (temp.getTime());
                String query2;
              
              ResultSet rsx = sx.executeQuery(queryX);
              //rsx.next();
              while(rsx.next())
              {
                  if(rsx.getDate(1).equals(temp))
                      break;
              }
                    int a=rsx.getInt(2);
                    query2="UPDATE r"+idf+" SET noOfRoomsAvail = "+(a+noOfRooms)+" WHERE dates = '"+sqlTemp+"';" ;    
           int cnt = s1x.executeUpdate(query2);
           temp=addDays(temp,1);
            sqlTemp=new java.sql.Date (temp.getTime());
          //  rsx.beforeFirst();
          System.out.println("temp " + sqlTemp + " sqlco "+sqlCO+"  sqlTemp.equals(sqlCO)  " + sqlTemp.equals(sqlCO) +" temp.before(checkOut)  "+temp.before(checkOut));
          System.out.println(query2);
            }
            
            
            //sx.close();
            
            
            temp=newCI;
            System.out.println(" newco"+newCO+" tmp "+temp+"temp.equals(newCO)  "+temp.equals(newCO));
             while(temp.before(newCO) || temp.equals(newCO))
            {
                sqlTemp=new java.sql.Date (temp.getTime());
                String query2;
                if(!checkIfInDatabase(idf,temp))
                {
                 query2="insert into r"+idf+" values ('"+sqlTemp+"',"+(ocf-newNOR)+");";}
                else
                {
                     ResultSet rsx1 = sx.executeQuery(queryX);
              while(rsx1.next())
              {
                 if(rsx1.getDate(1).equals(temp))
                      break;
              }
                   // rsx1.next();
                    int a=rsx1.getInt(2);
                    query2="UPDATE r"+idf+" SET noOfRoomsAvail = "+(a-newNOR)+" WHERE dates = '"+sqlTemp+"';" ;
                      //  rsx1.beforeFirst();
                }
                
              //  System.out.println(query2);
                
              
              
           int cnt = s1x.executeUpdate(query2);
           temp=addDays(temp,1);
           
            
            }
            
            
            
            s1x.close();
           c1x.close();
           
           sx.close();
           cx.close();
           
           
           
           
           
        }
        catch(Exception e){System.out.println(e);}

            
            
            
            try
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,mysqluname,mysqlpass);
            Statement s=c.createStatement();
            int newPrice = getPrice();
              System.out.println(""+bookref + "bookref");
              java.sql.Date sqlNewCI= new java.sql.Date(newCI.getTime());
              String queryP="UPDATE bookinglist SET checkin = '"+sqlNewCI+"' WHERE refID = '"+bookref+"';" ;
              java.sql.Date sqlNewCO= new java.sql.Date(newCO.getTime());
              String queryQ="UPDATE bookinglist SET checkout = '"+sqlNewCO+"' WHERE refID = '"+bookref+"';" ;
              String queryR="UPDATE bookinglist SET noofppl = "+newNOP+" WHERE refID = '"+bookref+"';" ;
              String queryS="UPDATE bookinglist SET noofrroms = "+newNOR+" WHERE refID = '"+bookref+"';" ;
              String queryT="UPDATE bookinglist SET price = "+newPrice+" WHERE refID = '"+bookref+"';" ;
              
              int c11=s.executeUpdate(queryP);
               c11=s.executeUpdate(queryQ);
               c11=s.executeUpdate(queryR);
               c11=s.executeUpdate(queryS);
               c11=s.executeUpdate(queryT);
            s.close();
            c.close();}
    
            catch(Exception e){}
            
            JOptionPane.showMessageDialog(null, "Booking modification Successful!");
             query="select * from wlist;";
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,mysqluname,mysqlpass);
            Statement s=c.createStatement();
            ResultSet rs = s.executeQuery(query);
            //System.out.println("Details submitted successfully");
            String deleteref="-1";
            while (rs.next())
            {
                if(availability(rs.getInt(3),(java.util.Date)rs.getDate(6),(java.util.Date)rs.getDate(7),rs.getInt(4)))
                {
                  String    query3="insert into bookinglist values (\""+rs.getString(1)+"\" , \""+rs.getString(11)+"\" , \""+rs.getString(2)+"\" , \""+hotelname+"\" , \""+roomtype+"\" , '"+rs.getDate(6)+"' , '"+rs.getDate(7)+"' , "+rs.getString(5)+" , "+rs.getString(4)+" , \""+rs.getString(9)+"\" , \""+rs.getString(10)+"\" , "+rs.getInt(12)+" , "+rs.getString(3)+" );";
          // System.out.println(query3);
          deleteref=rs.getString(11);
          System.out.println(query3);
            try{
            Class.forName("com.mysql.jdbc.Driver");
             Connection c3 = DriverManager.getConnection(url,mysqluname,mysqlpass);
            Statement s3=c3.createStatement();
            int cnt1= s3.executeUpdate(query3);
            s3.close();c3.close();
            }
            catch(Exception e){}
            break;
                }
            }
            
            String delete="delete from wlist where bookref = \""+deleteref+"\";";
            if(!deleteref.equals("-1"))
                s.execute(delete);
            
            s.close();
            c.close();
            //this.dispose();
            
            
    }
            catch(Exception e){}
        
        
        
        
          YourBookings l = new YourBookings(username,name);
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
            
            
        }
                 else  JOptionPane.showMessageDialog(null, "Not available!","Error" ,JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton3MouseClicked
    
        
        
        }
    }
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        YourBookings l = new YourBookings(username,name);
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
         Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        
        
        int modprice = getPrice();
        
        jLabel4.setText("Price after modification = "+ modprice);
        jLabel4.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(ModifyBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> noofguests;
    private javax.swing.JComboBox<String> noofrooms;
    private javax.swing.JLabel rtype;
    // End of variables declaration//GEN-END:variables
}