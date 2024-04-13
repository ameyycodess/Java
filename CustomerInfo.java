
package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class CustomerInfo extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    CustomerInfo(){
    
        
        JLabel l1 = new JLabel("Document");
        l1.setBounds(40,10,100,20);
        add(l1);
        
        JLabel l2 = new JLabel("Document no.");
        l2.setBounds(170,10,100,20);
        add(l2);
        
        JLabel l3 = new JLabel("Name");
        l3.setBounds(320,10,100,20);
        add(l3);
        
        JLabel l4 = new JLabel("Gender");
        l4.setBounds(460,10,100,20);
        add(l4);
        
        JLabel l5 = new JLabel("Allocated PC");
        l5.setBounds(600,10,100,20);
        add(l5);
        
        JLabel l6 = new JLabel("Check-In Time");
        l6.setBounds(740,10,100,20);
        add(l6);
        
        JLabel l7 = new JLabel("Payment");
        l7.setBounds(880,10,100,20);
        add(l7);
        
        table = new JTable();
        table.setBounds(0, 40, 1000, 400);
	add(table);
        
        
        try {
        Conn c = new Conn();
        ResultSet  rs = c.s.executeQuery("select * from customer");
        table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            e.printStackTrace();
        }
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(420, 500, 120, 30);
        back.addActionListener(this);
        add(back);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(300,200,1000,600);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Reception();
    }
    
    public static void main(String[] args){
        new CustomerInfo();
    }
}
