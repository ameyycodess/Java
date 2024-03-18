import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {

    public static void main(String[] args) {
    
        JFrame frame = new JFrame("FlowLayout Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panel = new JPanel(new FlowLayout());

       
        for (int i = 1; i <= 5; i++) {
            panel.add(new JButton("Button " + i));
        }

       
        frame.add(panel);

      
        frame.setVisible(true);
    }
}
