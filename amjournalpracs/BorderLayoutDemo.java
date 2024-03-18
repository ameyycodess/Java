import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("BorderLayout Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

       
        JPanel panel = new JPanel(new BorderLayout());

        
        panel.add(northButton, BorderLayout.NORTH);
        panel.add(southButton, BorderLayout.SOUTH);
        panel.add(eastButton, BorderLayout.EAST);
        panel.add(westButton, BorderLayout.WEST);
        panel.add(centerButton, BorderLayout.CENTER);

        
        frame.add(panel);


        frame.setVisible(true);
    }
}
