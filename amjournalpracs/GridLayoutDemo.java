import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("GridLayout Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        JPanel panel = new JPanel(new GridLayout(3, 3));

        
        for (int i = 1; i <= 6; i++) {
            panel.add(new JButton("Button " + i));
        }

        
        frame.add(panel);

       
        frame.setVisible(true);
    }
}
