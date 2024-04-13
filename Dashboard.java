
package gaming.cafe.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    Dashboard(){
        setBounds(0,0,1550,1000);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);
        
        JLabel text = new JLabel("WELCOME TO XYZ GAMING CAFE");
        text.setBounds(400,80,1000,50);
        image.add(text);
        text.setFont(new Font("Tahoma", Font.ITALIC, 46));
        text.setForeground(Color.WHITE);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);
        
        JMenu cafe = new JMenu("GC Management");
        cafe.setForeground(Color.BLUE);
        mb.add(cafe);
        
        JMenuItem recep = new JMenuItem("Reception");
        recep.addActionListener(this);
        cafe.add(recep);
        
        JMenu admin = new JMenu("Admin");
        admin.setForeground(Color.BLUE);
        mb.add(admin);
        
        JMenuItem addpc = new JMenuItem("Add PC");
        addpc.addActionListener(this);
        admin.add(addpc);

        JMenuItem addadmin = new JMenuItem("Add Admin");
        addadmin.addActionListener(this);
        admin.add(addadmin);

        
                
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("Add PC")){
            new AddPc();
        }else if (ae.getActionCommand().equals("Add Admin")){
                new AddAdmin();
        }else if (ae.getActionCommand().equals("Reception")){
            new Reception();
        }
    }
    
    public static void main(String[] args){
        new Dashboard();
    }
}
