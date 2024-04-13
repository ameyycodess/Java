
package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;



public class UpdateCheck extends JFrame implements ActionListener{
    
    Choice ccustomer;
    JTextField tfpc,tfname,tfcheckin,tfamt;
    JButton check,update,back;
    
    UpdateCheck(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Update Status");
        text.setFont(new Font("Tahoma", Font.PLAIN,20));
        text.setBounds(90,20,200,30);
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
        lblpc.setBounds(30,120,100,20);
        add(lblpc);
        
        tfpc = new JTextField();
        tfpc.setBounds(200,120,150,25);
        add(tfpc);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,160,100,20);
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200,160,150,25);
        add(tfname);
        
        JLabel lblcheckin = new JLabel("Checkin");
        lblcheckin.setBounds(30,200,100,20);
        add(lblcheckin);
        
        tfcheckin = new JTextField();
        tfcheckin.setBounds(200,200,150,25);
        add(tfcheckin);
        
        JLabel lblamt = new JLabel("Amount Paid");
        lblamt.setBounds(30,240,100,20);
        add(lblamt);
        
        tfamt = new JTextField();
        tfamt.setBounds(200,240,150,25);
        add(tfamt);
        
        check = new JButton("Check");
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.setBounds(30, 340, 100, 30);
        check.addActionListener(this);
        add(check);
        
        update = new JButton("Update");
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setBounds(150, 340, 100, 30);
        update.addActionListener(this);
        add(update);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(270, 340, 100, 30);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/dbimg.jpg"));
                JLabel l1 = new JLabel(i1);
                l1.setBounds(450,70,476,270);
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
                    tfname.setText(rs.getString("name"));
                    tfcheckin.setText(rs.getString("checkintime"));
                    tfamt.setText(rs.getString("payment")); 
                }
            }catch(Exception e){
                e.printStackTrace();
            } 
        }else if (ae.getSource() == update){
            String number = ccustomer.getSelectedItem();
            String pc = tfpc.getText();
            String name = tfname.getText();
            String checkin = tfcheckin.getText();
            String amt = tfamt.getText();
            
            try {
                Conn c = new Conn();
                c.s.executeUpdate("update customer set pcall = '"+pc+"', name = '"+name+"', checkintime = '"+checkin+"', payment = '"+amt+"' where number = '"+number+"'");
                
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
        new UpdateCheck();
    }
}
