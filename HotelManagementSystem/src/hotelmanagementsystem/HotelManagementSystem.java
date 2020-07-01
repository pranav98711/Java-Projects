
package hotelmanagementsystem;

/**
 *
 * @author Pranav
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // specifically importing event because in above import we import just classes and we have to specifically import package i.e event package


public class HotelManagementSystem  extends JFrame implements ActionListener{

    HotelManagementSystem(){
        setBounds(300 , 200 , 1366 , 564);  //Integration of setLocation(first two) and setSize(last two)
        //setSize(400,400);
        
        //setLocation(300,300);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));  //cannot put icon directly into frame so next step is to put in label
        JLabel l1=new JLabel(i1);
        l1.setBounds(0,0,1366,565);
        add(l1);
        
        JLabel l2=new JLabel("Hotel Management System");
        l2.setBounds(20 , 430 , 1000 , 90);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif" , Font.PLAIN , 70));
        l1.add(l2); //l1.add because we want Hotel Management System above the image
        
        JButton b1=new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1150,450 , 150,50);
        b1.addActionListener(this);
        l1.add(b1); //because want to add aboce image
        
        setLayout(null); //We'll make our own Layout. The default layout is Borderlayout
        setVisible(true);
        
        
        //Multithreading
        //Blinking of HOTEL MANAGEMENT SYSTEM TEXT
        while(true){
            l2.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){
            
        }
            l2.setVisible(true);
            try{
            Thread.sleep(500);
            }catch(Exception ae){
                
            }
            }
            
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false); // closes the current frame and shows just Login Frame
        
    }
    
    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}
