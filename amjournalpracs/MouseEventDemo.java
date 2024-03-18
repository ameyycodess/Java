import javax.swing.*;
import java.awt.event.*;

public class MouseEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Move your mouse over this label");

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Mouse entered the label!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Mouse exited the label!");
            }
        });

        frame.getContentPane().add(label);

        frame.setVisible(true);
    }
}
