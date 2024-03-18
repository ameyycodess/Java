import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAreaColorChanger extends JFrame {

    private JTextArea textArea;
    private JButton colorButton;

    public TextAreaColorChanger() {
        setTitle("Text Area Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        colorButton = new JButton("Change Color");

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(null, "Choose Text Color", Color.BLACK);
                if (selectedColor != null) {
                    textArea.setForeground(selectedColor);
                }
            }
        });

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(colorButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextAreaColorChanger::new);
    }
}
