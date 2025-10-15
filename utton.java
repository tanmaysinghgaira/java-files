import java.awt.*;
import java.awt.event.*;

public class utton {
    // main function
    public static void main(String[] args)
    {
        // Ensure UI is created on the AWT event thread
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Creating instance of frame with the label
                final Frame frame = new Frame("Example 2");

                // Creating instance of button with label
                Button button = new Button("Click Here");

                // Setting the position for the button in frame (wider so it's visible)
                button.setBounds(80, 100, 120, 40);

                // Add a simple ActionListener so the button does something when clicked
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Button clicked");
                    }
                });

                // Adding button to the frame
                frame.add(button);

                // setting size, layout and visibility of frame
                frame.setSize(300, 300);
                frame.setLayout(null);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                // Using WindowListener for closing the window
                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
            }
        });
    }
}