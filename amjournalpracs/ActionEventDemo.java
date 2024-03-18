import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("ActionEvent Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JButton button = new JButton("Click Me");

        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        frame.getContentPane().add(button, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
