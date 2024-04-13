
package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField usern;
    JPasswordField passw;
    JButton login,cancel;
    
    
    Login(){
        getContentPane().setBackground(Color.RED);
        
        setLayout(null);
        
        JLabel user = new JLabel("Username:");
        user.setBounds(50,30,100,30);
        user.setFont(new Font("serif", Font.BOLD, 20));
        add(user);
        
        JLabel pass = new JLabel("Password : ");
        pass.setBounds(50,80,100,30);
        pass.setFont(new Font("serif", Font.BOLD, 20));
        add(pass);
        
        usern = new JTextField();
        usern.setBounds(150,30,150,30);
        add(usern);
        
        passw = new JPasswordField();
        passw.setBounds(150,80,150,30);
        add(passw);
        
        
        login = new JButton("Login");
        login.setBounds(50,150,120,30);
        login.setBackground(Color.ORANGE);
        login.setForeground(Color.BLACK);
        login.setFont(new Font("serif", Font.BOLD, 20));
        login.addActionListener(this);
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(180,150,120,30);
        cancel.setBackground(Color.ORANGE);
        cancel.setForeground(Color.BLACK);
        cancel.setFont(new Font("serif", Font.BOLD, 20));
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 30, 200, 220);
        add(image);
        
        setBounds(500,200,600,300);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == login){
            String user = usern.getText();
            String pass = passw.getText();
            
            try{
                Conn c = new Conn();
                
                String query = "select * from login where username = '" + user + "' and password = '" + pass + "'";
                
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()){
                    setVisible(false);
                    new Dashboard();
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid input");
                    setVisible(false);
                }
            } 
            catch (Exception e)
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
        new Login();
    }
}
    


    
    
