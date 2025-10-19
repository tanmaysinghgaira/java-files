import java.awt.*;
import java.awt.event.*;

// AwtButtons: demonstrates Button and ActionListener
public class AwtButtons {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Buttons Example");
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        Button btnHello = new Button("Say Hello");
        Button btnExit = new Button("Exit");

        Label lbl = new Label("Click a button", Label.CENTER);

        btnHello.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Hello from AWT Button!");
            }
        });

        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.add(btnHello);
        frame.add(btnExit);
        frame.add(lbl);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
