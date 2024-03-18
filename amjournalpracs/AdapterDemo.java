import javax.swing.*;
import java.awt.event.*;

public class AdapterDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adapter Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Click or Drag Here");
        frame.add(label);

        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Mouse Clicked!");
            }

            public void mouseDragged(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Mouse Dragged!");
            }
        });

        frame.setVisible(true);
    }
}
