import javax.swing.*;
import java.awt.event.*;

public class FocusEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Focus Event Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();

        textField1.setBounds(50, 30, 200, 30);
        textField2.setBounds(50, 80, 200, 30);

        textField1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                textField1.setText("Focused!");
            }

            public void focusLost(FocusEvent e) {
                textField1.setText("");
            }
        });

        textField2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                textField2.setText("Focused!");
            }

            public void focusLost(FocusEvent e) {
                textField2.setText("");
            }
        });

        frame.add(textField1);
        frame.add(textField2);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
