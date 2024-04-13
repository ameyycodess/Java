
package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Date;
import java.awt.event.*;


public class Checkout extends JFrame implements ActionListener{
    
    Choice ccustomer;
     JLabel lblpcno,lblcheckintime,lblcheckouttime;
     JButton checkout,back;
     
    Checkout(){
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Check-Out");
        text.setBounds(100,20,100,30);
        text.setFont(new Font("Tahoma", Font.PLAIN,20));
        add(text);
        
        JLabel lblid = new JLabel("Customer ID");
        lblid.setBounds(30,80,100,30);
        add(lblid);
        
        ccustomer = new Choice();
        ccustomer.setBounds(150,80,150,25);
        add(ccustomer);
        
        
        
        JLabel lblpc = new JLabel("PC No");
        lblpc.setBounds(30,130,100,30);
        add(lblpc);
        
        lblpcno = new JLabel();
        lblpcno.setBounds(150,130,100,30);
        add(lblpcno);
        
        JLabel lblcheckin = new JLabel("Check-In Time");
        lblcheckin.setBounds(30,180,100,30);
        add(lblcheckin);
        
        lblcheckintime = new JLabel();
        lblcheckintime.setBounds(150,180,100,30);
        add(lblcheckintime);
        
        JLabel lblcheckout = new JLabel("Check-Out Time");
        lblcheckout.setBounds(30,230,100,30);
        add(lblcheckout);
        
        
        Date date = new Date();
        lblcheckouttime = new JLabel("" + date);
        lblcheckouttime.setBounds(150,230,150,30);
        add(lblcheckouttime);
        
        checkout = new JButton("Check-Out");
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.setBounds(30,280,120,30);
        checkout.addActionListener(this);
        add(checkout);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(170,280,120,30);
        back.addActionListener(this);
        add(back);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next()){
                ccustomer.add(rs.getString("number"));
                lblpcno.setText(rs.getString("pcall"));
                lblcheckintime.setText(rs.getString("checkintime"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/checkout.jpg"));
                Image i3 = i1.getImage().getScaledInstance(400, 250,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(350,50,400,250);
                add(l1);
        
        setBounds(300,200,800,400);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == checkout){
            String query1 = "delete from customer where number = '"+ccustomer.getSelectedItem()+"'";
            String query2 = "update pcps set availability = 'Available' where pcnum = '"+lblpcno.getText()+"'";
            
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null,"Checkout Done");
                setVisible(false);
                new Reception();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Reception();
        }
    }
    
    public static void main(String[] args){
        new Checkout();
    }  
}
