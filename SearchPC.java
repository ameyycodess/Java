
package gaming.cafe.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class SearchPC extends JFrame implements ActionListener{
    JTable table;
    JButton back,submit;
    JComboBox type;
    JCheckBox available;
    SearchPC(){
    
        JLabel text = new JLabel("Search for PC");
        text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        text.setBounds(400,30,200,30);
        add(text);
        
        JLabel lbltype = new JLabel("Type");
        lbltype.setBounds(50,100,100,20);
        add(lbltype);
        
        type = new JComboBox(new String[] {"PC","PS"});
        type.setBounds(150,100,150,25);
        type.setBackground(Color.WHITE);
        add(type);
        
        available = new JCheckBox("Only Available");
        available.setBounds(650,100,150,25);
        available.setBackground(Color.WHITE);
        add(available);
        
        JLabel l1 = new JLabel("PC no.");
        l1.setBounds(100,160,100,20);
        add(l1);
        
        JLabel l2 = new JLabel("Availabilty");
        l2.setBounds(350,160,100,20);
        add(l2);
        
        JLabel l3 = new JLabel("Status");
        l3.setBounds(600,160,100,20);
        add(l3);
        
        JLabel l4 = new JLabel("Type");
        l4.setBounds(850,160,100,20);
        add(l4);
        
        table = new JTable();
        table.setBounds(0,200,1000,300);
	add(table);
        
        
        try {
        Conn c = new Conn();
        ResultSet  rs = c.s.executeQuery("select * from pcps");
        table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            e.printStackTrace();
        }
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(300, 500, 120, 30);
        submit.addActionListener(this);
        add(submit);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(500, 500, 120, 30);
        back.addActionListener(this);
        add(back);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(300,200,1050,600);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            try{
                String query1 = "select * from pcps where type = '"+type.getSelectedItem()+"'";
                /*String query2 = "select * from pcps where availability = ''Available' AND type = '"+type.getSelectedItem()+"'";*/
                String query2 = "select * from pcps where availability = 'Available' AND type = '"+type.getSelectedItem()+"'";

                
                Conn conn = new Conn();
                ResultSet rs;
                if (available.isSelected()){
                    rs = conn.s.executeQuery(query2);
                }else{
                    rs = conn.s.executeQuery(query1);
                }
                table.setModel(DbUtils.resultSetToTableModel(rs));
                
            } catch(Exception e) {
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Reception();
        }
        
      
    }
    
    public static void main(String[] args){
        new SearchPC();
    }
}
