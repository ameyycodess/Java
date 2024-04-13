
package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddAdmin extends JFrame implements ActionListener{
    JTextField tfname,tfage,tfphone,tfemail;
    JRadioButton rbmale,rbfemale;
    JButton submit;
    AddAdmin() {
        setLayout(null);
        
        JLabel lblname = new JLabel("NAME");
        lblname.setBounds(60,30,120,30);
        lblname.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200,30,150,30);
        add(tfname);
        setVisible(true);
        
        JLabel lblage = new JLabel("AGE");
        lblage.setBounds(60,80,120,30);
        lblage.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblage);
        
        tfage = new JTextField();
        tfage.setBounds(200,80,150,30);
        add(tfage);
        
        JLabel lblgender = new JLabel("GENDER");
        lblgender.setBounds(60,130,120,30);
        lblgender.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblgender);
        
        rbmale = new JRadioButton("MALE");
        rbmale.setBounds(200,130,70,30);
        rbmale.setFont(new Font("Tahoma", Font.PLAIN,12));
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
        
        rbfemale = new JRadioButton("FEMALE");
        rbfemale.setBounds(280,130,70,30);
        rbfemale.setFont(new Font("Tahoma", Font.PLAIN,12));
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        
        JLabel lblphone = new JLabel("PHONE");
        lblphone.setBounds(60,230,120,30);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(200,230,150,30);
        add(tfphone);
        
        JLabel lblemail = new JLabel("EMAIL");
        lblemail.setBounds(60,280,120,30);
        lblemail.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200,280,150,30);
        add(tfemail);
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(200,430,150,30);
        submit.addActionListener(this);
        add(submit);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/admin.jpg"));
            Image i3 = i1.getImage().getScaledInstance(500, 450,Image.SCALE_DEFAULT);
            ImageIcon i2 = new ImageIcon(i3);
            JLabel image = new JLabel(i2);
            image.setBounds(410,80,480,410);
            add(image);
            
        getContentPane().setBackground(Color.WHITE);
        setBounds (350,200,850,540);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String name = tfname.getText();
        String age = tfage.getText();
        String phone = tfphone.getText();
        String email = tfemail.getText();
        
        String gender = null;
        
        if(rbmale.isSelected()){
            gender = "Male";
        }else if (rbfemale.isSelected()){
            gender = "Female";
        }
        
        try{
            Conn conn = new Conn();
            
            String query = "insert into admin values('"+name+"', '"+age+"','"+gender+"', '"+phone+"', '"+email+"')";
            
            conn.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null,"Admin added Sucessfully");
            
            setVisible(false);
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
            
            
       
    }
    
    public static void main(String[] args){
        new AddAdmin();
    }
}
