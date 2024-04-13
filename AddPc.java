
package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddPc extends JFrame implements ActionListener{
    JButton add,cancel;
    JTextField tfpc;
    JComboBox availablecombo,statuscombo,typecombo;
            
    AddPc(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel heading = new JLabel("Add PC/PS");
        heading.setFont(new Font("Tahoma", Font.BOLD,18));
        heading.setBounds(150,20,200,20);
        add(heading);
        
        JLabel lblpcno = new JLabel("PC/PS Number");
        lblpcno.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblpcno.setBounds(60,80,120,30);
        add(lblpcno);
        
        tfpc = new JTextField();
        tfpc.setBounds(200,80,150,30);
        add(tfpc);
                
        JLabel lblpcavail = new JLabel("Availabilty");
        lblpcavail.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblpcavail.setBounds(60,130,120,30);
        add(lblpcavail);
        
        String availoptions[] = {"Available","Occupied"};
        availablecombo = new JComboBox(availoptions);
        availablecombo.setBounds(200,130,150,30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);
        
        JLabel lblpcstat = new JLabel("Working Status");
        lblpcstat.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblpcstat.setBounds(60,180,120,30);
        add(lblpcstat);
        
        String statusoptions[] = {"Working","Not working"};
        statuscombo = new JComboBox(statusoptions);
        statuscombo.setBounds(200,180,150,30);
        statuscombo.setBackground(Color.WHITE);
        add(statuscombo);
        
        JLabel lbltype = new JLabel("Type");
        lbltype.setFont(new Font("Tahoma", Font.PLAIN,16));
        lbltype.setBounds(60,230,120,30);
        add(lbltype);
        
        String typeoptions[] = {"PC","PS"};
        typecombo = new JComboBox(typeoptions);
        typecombo.setBounds(200,230,150,30);
        typecombo.setBackground(Color.WHITE);
        add(typecombo);
        
        add = new JButton("Add PC/PS");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(60,350,130,30);
        add.addActionListener(this);
        add(add);
        
        cancel = new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(220,350,130,30);
        cancel.addActionListener(this);
        add(cancel);
                
                
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/addpc.jpeg"));
                Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l15 = new JLabel(i2);
                l15.setBounds(400,30,500,370);
                add(l15);

                
        setBounds(330,200,940,470);
        setVisible(true);
          
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add ){
            String pcnum = tfpc.getText();
            String availability = (String) availablecombo.getSelectedItem();
            String status = (String) statuscombo.getSelectedItem();
            String type = (String) typecombo.getSelectedItem();
            
            try {
                Conn c = new Conn();
                String query = "insert into pcps values('" + pcnum + "','" + availability + "','" + status + "','" + type + "')";

                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Added Successfully");
                setVisible(false);
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
        else if (ae.getSource() == cancel) 
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AddPc();
    }
}
