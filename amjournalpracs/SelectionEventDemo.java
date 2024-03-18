import javax.swing.*;
import java.awt.event.*;

public class SelectionEventDemo {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Selection Event Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JComboBox
        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Add item listener to the combo box
        comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    JOptionPane.showMessageDialog(null, "Selected Option: " + comboBox.getSelectedItem());
                }
            }
        });

        // Add the combo box to the frame
        frame.getContentPane().add(comboBox);

        // Set frame visibility
        frame.setVisible(true);
    }
}
