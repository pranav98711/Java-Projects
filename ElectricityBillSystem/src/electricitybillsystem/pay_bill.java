package electricitybillsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;





public class pay_bill extends JFrame{
   
    pay_bill(){
        super("Pay Bill Using QR code");
        ImageIcon ic= new ImageIcon(ClassLoader.getSystemResource("icon/qr.png"));
        Image i3 = ic.getImage().getScaledInstance(620 , 620 , Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
        
        
        
       /* JEditorPane j = new JEditorPane();
        j.setEditable(false);   
        
        try {
            j.setPage("https://paytm.com/electricity-bill-payment");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        } 
        JScrollPane scrollPane = new JScrollPane(j); */

            
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,600));
        setSize(800,800);
        setLocation(250,120);
        setVisible(true); 
    }

    public static void main(String[] args){
        new pay_bill().setVisible(true);
    }
}
