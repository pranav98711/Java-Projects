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
public class customer_details extends JFrame implements ActionListener {
    
    JTable t1;
    JButton b1;
    String x[] = { "Emp Name" , "Meter no" , "Adress" , "Street" , "City" , "Email" , "Phone"  };
    String y[][] = new String[20][8];
    int i=0 , j=0;
    
    customer_details(){
        super("Customer Details");
        
        setSize(1200,650);
        setLocation(200 , 200);
        
        try{
            conn cl=new conn();
            String sl="select * from emp";
            ResultSet rs = cl.s.executeQuery(sl);
            while(rs.next()){
                y[i][j++] = rs.getString("name");
                y[i][j++] = rs.getString("meter_number");
                y[i][j++] = rs.getString("address");
                y[i][j++] = rs.getString("state");
                y[i][j++] = rs.getString("city");
                y[i][j++] = rs.getString("email");
                y[i][j++] = rs.getString("phone");
                i++;
                j=0;
                
                
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){ e.printStackTrace();}
        
        b1=new JButton("Print");
        add(b1 ,"South");
        JScrollPane sp = new JScrollPane(t1);
        add(sp);
        b1.addActionListener(this);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            t1.print();
        }catch(Exception e){}
        
    }
    public static void main(String[] args){
        new customer_details().setVisible(true);
        
    }
    
    
}
