
package gaming.cafe.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener{
    JButton newCustomer,pcs,custInfo,admInfo,checkOut,updStat,srchavail,pcstat,logout;
    
    Reception(){
        setLayout(null);
        
        newCustomer = new JButton("New Customer");
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.setBounds(10,30,200,30);  
        newCustomer.addActionListener(this);
        add(newCustomer);
        
        pcs = new JButton("PC/PS");
        pcs.setBackground(Color.BLACK);
        pcs.setForeground(Color.WHITE);
        pcs.setBounds(10,70,200,30);
        pcs.addActionListener(this);
        add(pcs);
        
        custInfo = new JButton("Customer Information");
        custInfo.setBackground(Color.BLACK);
        custInfo.setForeground(Color.WHITE);
        custInfo.setBounds(10,110,200,30);
        custInfo.addActionListener(this);        
        add(custInfo);
        
        admInfo = new JButton("Admin Information");
        admInfo.setBackground(Color.BLACK);
        admInfo.setForeground(Color.WHITE);
        admInfo.setBounds(10,150,200,30);  
        admInfo.addActionListener(this);
        add(admInfo);
        
        checkOut = new JButton("Check Out");
        checkOut.setBackground(Color.BLACK);
        checkOut.setForeground(Color.WHITE);
        checkOut.setBounds(10,190,200,30);  
        checkOut.addActionListener(this);
        add(checkOut);
        
        updStat = new JButton("Update Status");
        updStat.setBackground(Color.BLACK);
        updStat.setForeground(Color.WHITE);
        updStat.setBounds(10,230,200,30);
        updStat.addActionListener(this);
        add(updStat);
        
        srchavail = new JButton("Search Available Pc");
        srchavail.setBackground(Color.BLACK);
        srchavail.setForeground(Color.WHITE);
        srchavail.setBounds(10,270,200,30); 
        srchavail.addActionListener(this);
        add(srchavail);
        
        pcstat = new JButton("Update Pc Status");
        pcstat.setBackground(Color.BLACK);
        pcstat.setForeground(Color.WHITE);
        pcstat.setBounds(10,310,200,30);
        pcstat.addActionListener(this);
        add(pcstat);
        
        logout = new JButton("LogOut");
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setBounds(10,350,200,30); 
        logout.addActionListener(this);
        add(logout);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/reception.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(250,30,500,470);
        add(l1);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(350,200,800,470);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == newCustomer){
            setVisible(false);
            new AddCustomer();
        }else if (ae.getSource() == pcs){
            setVisible(false);
            new PCs();
        }else if (ae.getSource() == admInfo){
            setVisible(false);
            new AdminInfo();
        }else if (ae.getSource() == custInfo){
            setVisible(false);
            new CustomerInfo();
        }else if (ae.getSource() == srchavail){
            setVisible(false);
            new SearchPC();
        }else if (ae.getSource() == updStat){
            setVisible(false);
            new UpdateCheck();
        }else if (ae.getSource() == pcstat){
            setVisible(false);
            new UpdatePcStat();
        }else if (ae.getSource() == checkOut){
            setVisible(false);
            new Checkout();
        }else if(ae.getSource() == logout){
            setVisible(false);
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        new Reception();
    }
}
