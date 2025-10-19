import java.awt.*;
import java.awt.event.*;

// AwtTextFieldAndLabel: demonstrates TextField input and updating a Label
public class AwtTextFieldAndLabel {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT TextField Example");
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        Label prompt = new Label("Enter your name:");
        TextField input = new TextField(20);
        Button submit = new Button("Submit");
        Label response = new Label("", Label.CENTER);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = input.getText();
                if (name.isEmpty()) {
                    response.setText("Please enter a name.");
                } else {
                    response.setText("Hello, " + name + "!");
                }
            }
        });

        frame.add(prompt);
        frame.add(input);
        frame.add(submit);
        frame.add(response);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
