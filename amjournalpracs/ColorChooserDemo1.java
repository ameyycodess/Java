import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserDemo1 extends JFrame {
    private JPanel contentPane;
    private JScrollPane scrollPane;
    private JPanel colorPanel;
    private JButton btnChangeColor;

    public ColorChooserDemo1() {
        setTitle("Color Chooser Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        scrollPane = new JScrollPane(colorPanel);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        btnChangeColor = new JButton("Change Color");
        btnChangeColor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color newColor = JColorChooser.showDialog(ColorChooserDemo1.this, "Choose Background Color", colorPanel.getBackground());
                if (newColor != null) {
                    colorPanel.setBackground(newColor);
                }
            }
        });

        contentPane.add(btnChangeColor, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ColorChooserDemo1 frame = new ColorChooserDemo1();
                frame.setVisible(true);
            }
        });
    }
}
