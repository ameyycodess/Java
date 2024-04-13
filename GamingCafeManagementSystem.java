
/*package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamingCafeManagementSystem extends JFrame implements ActionListener
{
    
    GamingCafeManagementSystem()
    {
        //setSize(1280,720);
        //setLocation(100,100);
        setBounds(100,100,1280,720);
        setVisible(true);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/GAmi.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1280,720); //loc from x,y and len and bredth
        
        add(image);
        
        JButton next = new JButton("Next");
        next.setBounds(750,500,150,50);
        next.setBackground(Color.ORANGE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        next.setFont(new Font("serif", Font.BOLD, 20));
        image.add(next);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        new GamingCafeManagementSystem();
    }
    
}*/
package gaming.cafe.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamingCafeManagementSystem extends JFrame implements ActionListener {
    
    GamingCafeManagementSystem() {
        setTitle("Gaming Cafe Management System");
        setBounds(100, 100, 1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(getClass().getClassLoader().getResource("icons/GAmi.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1280, 720);

        JButton next = new JButton("Next");
        next.setBounds(750, 500, 150, 50);
        next.setBackground(Color.ORANGE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        next.setFont(new Font("serif", Font.BOLD, 20));
        image.add(next);

        add(image);
        pack(); // Packs the frame to fit the preferred sizes of its subcomponents
        setLocationRelativeTo(null); // Centers the frame on the screen
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GamingCafeManagementSystem());
    }
}

