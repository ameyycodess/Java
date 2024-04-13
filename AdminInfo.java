
package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class AdminInfo extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    AdminInfo(){
    
        
        JLabel l1 = new JLabel("Name");
        l1.setBounds(80,10,100,20);
        add(l1);
        
        JLabel l2 = new JLabel("Age");
        l2.setBounds(260,10,100,20);
        add(l2);
        
        JLabel l3 = new JLabel("Gender");
        l3.setBounds(480,10,100,20);
        add(l3);
        
        JLabel l4 = new JLabel("Phone");
        l4.setBounds(680,10,100,20);
        add(l4);
        
        JLabel l5 = new JLabel("Email");
        l5.setBounds(850,10,100,20);
        add(l5);
        
        table = new JTable();
        table.setBounds(0, 40, 1000, 400);
	add(table);
        
        
        try {
        Conn c = new Conn();
        ResultSet  rs = c.s.executeQuery("select * from admin");
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
        new AdminInfo();
    }
}
