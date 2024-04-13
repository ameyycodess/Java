
package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Date;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class AddCustomer extends JFrame implements ActionListener{
    
    JComboBox comboid;
    JTextField tfnum,tfname,tfpaym;
    JRadioButton rbmale,rbfemale;
    JLabel lblcheckin,lblpaym;
    JButton add,back;
    Choice cpc;
    
    AddCustomer(){
        
        setLayout(null);
        
        
        JLabel text = new JLabel("New Customer Form");
        text.setBounds(100,20,300,30);
        text.setFont(new Font("Raleway", Font.BOLD,20));       
        add(text);
        
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(35,80,100,20);
        lblid.setFont(new Font("Raleway", Font.PLAIN,18));       
        add(lblid);
        
        String idoptions[] = {"Aadhar Card", "PAN Card", "College ID Card", "School ID Card"};
        comboid = new JComboBox(idoptions);
        comboid.setBounds(200,80,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        JLabel lblnum = new JLabel("Number");
        lblnum.setBounds(35,120,100,20);
        lblnum.setFont(new Font("Raleway", Font.PLAIN,18));       
        add(lblnum);
        tfnum = new JTextField();
        tfnum.setBounds(200,120,150,25);
        add(tfnum);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(35,160,100,20);
        lblname.setFont(new Font("Raleway", Font.PLAIN,18));       
        add(lblname);
        tfname = new JTextField();
        tfname.setBounds(200,160,150,25);
        add(tfname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(35,200,100,20);
        lblgender.setFont(new Font("Raleway", Font.PLAIN,18));       
        add(lblgender);
        rbmale = new JRadioButton("MALE");
        rbmale.setBounds(200,200,60,25);
        rbmale.setFont(new Font("Tahoma", Font.PLAIN,12));
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
        rbfemale = new JRadioButton("FEMALE");
        rbfemale.setBounds(270,200,100,25);
        rbfemale.setFont(new Font("Tahoma", Font.PLAIN,12));
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        
        
        JLabel lblpc = new JLabel("Allocated PC");
        lblpc.setBounds(35,240,150,20);
        lblpc.setFont(new Font("Raleway", Font.PLAIN,18));       
        add(lblpc);
        cpc = new Choice();
        
        try {
            Conn conn = new Conn();
            String query = "select * from pcps where availability = 'Available'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()){
                cpc.add(rs.getString("pcnum"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }   
        cpc.setBounds(200,240,150,30);
        add(cpc);
        
  
        JLabel lbltime = new JLabel("Check-In");
        lbltime.setBounds(35, 280, 150, 20);
        lbltime.setFont(new Font("Raleway", Font.PLAIN, 18));
        add(lbltime);

        // Format the current date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String formattedDate = dateFormat.format(date);

        lblcheckin = new JLabel(formattedDate); // Use the formatted date string
        lblcheckin.setBounds(200, 280, 160, 25);
        lblcheckin.setFont(new Font("Raleway", Font.BOLD, 12));
        add(lblcheckin);
        
        lblpaym = new JLabel("Payment");
        lblpaym.setBounds(35,320,150,20);
        lblpaym.setFont(new Font("Raleway", Font.PLAIN,18));       
        add(lblpaym);
        tfpaym = new JTextField();
        tfpaym.setBounds(200,320,150,25);
        add(tfpaym);
        
        add = new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(50, 410, 120, 30);
        add.addActionListener(this);
        add(add);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200, 410, 120, 30);
        back.addActionListener(this);
        add(back);
        
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/addcustomer.jpg"));
                Image i3 = i1.getImage().getScaledInstance(400, 400,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(450,10,300,500);
                add(l1);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(350,200,800,550);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String id = (String) comboid.getSelectedItem();
            String number = tfnum.getText();
            String name = tfname.getText();
            String gender = null;
            if(rbmale.isSelected()){
                gender = "Male";
            }else{
                gender = "Female";
            }
            
            String pcall = cpc.getSelectedItem();
            String time = lblcheckin.getText();
            String payment = tfpaym.getText();
            
            try{
                String query = "insert into customer values ('"+id+"','"+number+"','"+name+"','"+gender+"','"+pcall+"','"+time+"','"+payment+"')";
                String query2 = "update pcps set availability = 'Occupied' where pcnum = '"+pcall+"'";
                
                Conn conn = new Conn();
                conn.s.executeUpdate(query);
                conn.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null,"New Customer Added Succesfully");
                
                setVisible(false);
                new Reception();
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else if(ae.getSource() == back){
            setVisible(false);
            new Reception();
        }
    }
    public static void main(String[] args){
        new AddCustomer();
    }
}
