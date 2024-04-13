
package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;



public class UpdatePcStat extends JFrame implements ActionListener{
    
    Choice ccustomer;
    JTextField tfpc,tfavail,tfstat,tfamt;
    JButton check,update,back;
    
    UpdatePcStat(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Update PC Status");
        text.setFont(new Font("Tahoma", Font.PLAIN,20));
        text.setBounds(30,20,250,30);
        add(text);
        
        JLabel lblid = new JLabel("Customer ID");
        lblid.setBounds(30,80,100,20);
        add(lblid);
        
        ccustomer = new Choice();
        ccustomer.setBounds(200,80,150,25);
        add(ccustomer);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next()){
                ccustomer.add(rs.getString("number"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lblpc = new JLabel("PC No.");
        lblpc.setBounds(30,130,100,20);
        add(lblpc);
        
        tfpc = new JTextField();
        tfpc.setBounds(200,130,150,25);
        add(tfpc);
        
        JLabel lblavail = new JLabel("Availability");
        lblavail.setBounds(30,180,100,20);
        add(lblavail);
        
        tfavail = new JTextField();
        tfavail.setBounds(200,180,150,25);
        add(tfavail);
        
        JLabel lblstat = new JLabel("Working Status");
        lblstat.setBounds(30,230,100,20);
        add(lblstat);
        
        tfstat = new JTextField();
        tfstat.setBounds(200,230,150,25);
        add(tfstat);
        
        
        check = new JButton("Check");
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.setBounds(30, 300, 100, 30);
        check.addActionListener(this);
        add(check);
        
        update = new JButton("Update");
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setBounds(150, 300, 100, 30);
        update.addActionListener(this);
        add(update);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(270, 300, 100, 30);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/addpc.jpeg"));
                Image i3 = i1.getImage().getScaledInstance(550, 250,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(400,80,600,250);
                add(l1);
        
        setBounds(300,200,980,500);
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == check){
            String id = ccustomer.getSelectedItem();
            String query = "select * from customer where number = '"+id+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                    tfpc.setText(rs.getString("pcall")); 
                }
                ResultSet rs2 = c.s.executeQuery("select * from pcps where pcnum = '"+tfpc.getText()+"'");
                while (rs2.next()){
                    tfavail.setText(rs2.getString("availability"));
                    tfstat.setText(rs2.getString("status"));
                }
            }catch(Exception e){
                e.printStackTrace();
            } 
        }else if (ae.getSource() == update){
            String number = ccustomer.getSelectedItem();
            String pc = tfpc.getText();
            String available = tfavail.getText();
            String status = tfstat.getText();
            
            
            try {
                Conn c = new Conn();
                c.s.executeUpdate("update pcps set availability = '"+available+"', status = '"+status+"' where pcnum = '"+pc+"'");
                
                JOptionPane.showMessageDialog(null, "Updated Succesfully ");
                
                setVisible(false);
                new Reception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Reception();
        }
    }
    
    public static void main(String[] args){
        new UpdatePcStat();
    }
}
