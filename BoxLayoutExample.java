import java.awt.*;
import javax.swing.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Box Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a JPanel with BoxLayout (Vertical alignment)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add buttons to the panel
        panel.add(new JButton("Button 1"));
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Add vertical spacing
        panel.add(new JButton("Button 2"));
        panel.add(Box.createVerticalGlue()); // Add flexible space
        panel.add(new JButton("Button 3"));

        // Add the panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
