// Java AWT Program for 
// Adding Multiple Properties
import java.awt.*;

// Driver Class
public class Awtfun{
      // main function
    public static void main(String[] args){

        // Create a frame
        Frame frame = new Frame("AWT Button Example");
      
        // Button 1
        Button button1 = new Button("Click Me!");
      
        // Set the background color
        button1.setBackground(Color.BLUE);
      
        // Set the foreground color
        button1.setForeground(Color.WHITE);
      
        // Set the button font size
        button1.setFont(new Font("Arial", Font.BOLD, 14));
      
        // Set the button position
        button1.setBounds(150, 50, 100, 50);

        // Button 2 with different properties
        Button button2 = new Button("Press Me!");
        button2.setBackground(Color.GREEN);
        button2.setForeground(Color.BLACK);
      
        button2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        button2.setBounds(150, 140, 80, 30);

        // Button 3 with different properties
        Button button3 = new Button("Tap Me!");
        button3.setBackground(Color.RED);
        button3.setForeground(Color.WHITE);
      
        button3.setFont(new Font("Verdana", Font.ITALIC, 16));
        button3.setBounds(130, 220, 150, 80);

        // Add the buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Set the frame background color
        frame.setBackground(Color.LIGHT_GRAY);
      
        // Set the frame size and make it visible
        frame.setSize(400, 400);
        frame.setLayout(null);
      
        // Set the frame visibility to true
        frame.setVisible(true);
    }
}