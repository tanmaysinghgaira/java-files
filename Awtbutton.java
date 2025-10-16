import java.awt.event.*;

import javax.swing.*;
public class Awtbutton {
    public static void main(String  [] args){
         // Createing a Jfrmae 
         JFrame frame = new JFrame("Button Example");
          //Creating JTExtfield 

          JTextField textField = new JTextField();
          textField.setBounds(50,50,150,20);


          //Creating a Jbutton 
          JButton  button = new JButton("Click Here");
          button.setBounds(50,100,95,30);

          // Adding action listener to the button

            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    textField.setText("Welcome to JavaTpoint.");
                }
            });
            // use absolute positioning (null layout) and then add components
            frame.setLayout(null);
            frame.add(button);
            frame.add(textField);
            frame.setSize(400,400);
            frame.setLocationRelativeTo(null); // center on screen
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
