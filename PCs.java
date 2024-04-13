
/*package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class PCs extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    PCs(){
    
        
        JLabel l1 = new JLabel("PC no.");
        l1.setBounds(40,20,100,20);
        add(l1);
        
        JLabel l2 = new JLabel("Availabilty");
        l2.setBounds(160,20,100,20);
        add(l2);
        
        JLabel l3 = new JLabel("Status");
        l3.setBounds(280,20,100,20);
        add(l3);
        
        JLabel l4 = new JLabel("Type");
        l4.setBounds(420,20,100,20);
        add(l4);
        
        table = new JTable();
        table.setBounds(0, 40, 500, 400);
	add(table);
        
        
        try {
        Conn c = new Conn();
        ResultSet  rs = c.s.executeQuery("select * from pcps");
        table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            e.printStackTrace();
        }
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200, 500, 120, 30);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("/icons/addpc.jpeg"));
                Image i3 = i1.getImage().getScaledInstance(600, 600,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                
                l1.setBounds(500,0,600,600);
                add(l1);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(300,200,1050,600);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Reception();
    }
    
    public static void main(String[] args){
        new PCs();
    }
}*/

package gaming.cafe.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class PCs extends JFrame implements ActionListener {
    JTable table;
    JButton back;

    PCs() {
        JLabel l1 = new JLabel("PC no.");
        l1.setBounds(40, 20, 100, 20);
        add(l1);

        JLabel l2 = new JLabel("Availabilty");
        l2.setBounds(160, 20, 100, 20);
        add(l2);

        JLabel l3 = new JLabel("Status");
        l3.setBounds(280, 20, 100, 20);
        add(l3);

        JLabel l4 = new JLabel("Type");
        l4.setBounds(420, 20, 100, 20);
        add(l4);

        table = new JTable();
        table.setBounds(0, 40, 500, 400);
        add(table);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from pcps");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200, 500, 120, 30);
        back.addActionListener(this);
        add(back);

        // Creating a new label for displaying the image
        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(500, 0, 600, 600);
        add(imageLabel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/addpc.jpeg"));
        Image i3 = i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        imageLabel.setIcon(i2);

        getContentPane().setBackground(Color.WHITE);
        setBounds(300, 200, 1050, 600);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Reception();
    }

    public static void main(String[] args) {
        new PCs();
    }
}

