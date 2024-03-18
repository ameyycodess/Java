import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ColorChangerApp extends JFrame {

    private JPanel colorPanel;
    private JButton changeColorButton;

    public ColorChangerApp() {
        setTitle("Color Changer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colorPanel = new JPanel();
        changeColorButton = new JButton("Change Color");

        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeColor();
            }
        });

        add(colorPanel, BorderLayout.CENTER);
        add(changeColorButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void changeColor() {
        Random rand = new Random();
        Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        colorPanel.setBackground(randomColor);
    }

    public static void main(String[] args) {
        new ColorChangerApp();
    }
}
