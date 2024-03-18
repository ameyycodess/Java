import javax.swing.*;
import java.awt.event.*;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anonymous Class Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        button.setBounds(100, 50, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
