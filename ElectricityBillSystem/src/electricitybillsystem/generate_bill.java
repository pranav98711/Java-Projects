/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitybillsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


/**
 *
 * @author Pranav
 */
public class generate_bill extends JFrame implements ActionListener{
    
    JLabel l1;
    JTextArea t1;
    JButton b1;
    Choice c1,c2;
    JPanel p1;
    
    generate_bill(){
        setSize(500 , 900);
        setLayout(new BorderLayout());
        
        p1=new JPanel();
        
        l1=new JLabel("Generate Bill");
        
        c1=new Choice();
        c2=new Choice();
        
        c1.add("1001");
        c1.add("1002");
        c1.add("1003");
        c1.add("1004");
        c1.add("1005");
        c1.add("1006");
        c1.add("1007");
        c1.add("1008");
        c1.add("1009");
        c1.add("1010");
        
        
        c2.add("January");
        c2.add("February");
        c2.add("March");
        c2.add("April");
        c2.add("May");
        c2.add("June");
        c2.add("July");
        c2.add("August");
        c2.add("September");
        c2.add("October");
        c2.add("November");
        c2.add("December");
        
        t1=new JTextArea(50 , 15);
        JScrollPane jsp=new JScrollPane(t1);
        t1.setFont(new Font("Senserif" , Font.ITALIC,18));
        
        b1=new JButton("Generate Bill");
        
        p1.add(l1);
        p1.add(c1);
        p1.add(c2);
        add(p1,"North");
        
        add(jsp,"Center");
        add(b1,"South");
        
        b1.addActionListener(this);
        
        setLocation(350,40);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn c=new conn();
            
            String month = c2.getSelectedItem();
            t1.setText("\t AMBANi Power Limited \n Electricity Bill of Month " +month+ ", 2020\n\n\n");
            
            ResultSet rs=c.s.executeQuery("select * from emp where meter_number = " +c1.getSelectedItem() );
            
            if(rs.next()){
                t1.append("\n    Customer Name : \t" +rs.getString("name"));
                t1.append("\n    Meter Number :\t" +rs.getString("meter_number"));
                t1.append("\n    Adress :\t" +rs.getString("address"));
                t1.append("\n    State : \t" +rs.getString("state"));
                t1.append("\n    City : \t" +rs.getString("city"));
                t1.append("\n    Email : \t" +rs.getString("email"));
                t1.append("\n    Phone Number :\t" +rs.getString("phone"));
                
                t1.append("\n");
                t1.append("---------------------------------------------------------------");
                
            }
            
            rs = c.s.executeQuery("select * from tax");
            
            if(rs.next()){
                t1.append("\n    Meter Location : \t" + rs.getString("meter_location"));
                t1.append("\n    Meter Type : \t" + rs.getString("meter_type"));
                t1.append("\n    Phase code : \t" + rs.getString("phase_code"));
                t1.append("\n    Bill Type : \t\t" + rs.getString("bill_type"));
                t1.append("\n    Days : \t\t" + rs.getString("days"));
                t1.append("\n");
                t1.append("---------------------------------------------------------------");
                t1.append("\n\n");
                t1.append("\n    Meter rent : \t\t " + rs.getString("meter_rent"));
                t1.append("\n    MCB rent : \t\t" + rs.getString("mcb_rent"));
                t1.append("\n    Service Tax : \t" + rs.getString("service_rent"));
                t1.append("\n    GST : \t\t " + rs.getString("gst"));
                
                
            }
            
            rs = c.s.executeQuery(" select * from bill where meter_number = " +c1.getSelectedItem());
            
            if(rs.next()){
                t1.append("\n    Current Month :\t"+rs.getString("month"));
                t1.append("\n    Units Consumed:\t"+rs.getString("units"));
                t1.append("\n    Total Charges :\t"+rs.getString("amount"));
                t1.append("\n---------------------------------------------------------------");
                t1.append("\n    TOTAL PAYABLE :\t"+rs.getString("amount"));
            }
            
            
        }catch(Exception aee){aee.printStackTrace();}
    }
    
    public static void main(String[] args){
        new generate_bill().setVisible(true);
    }
}