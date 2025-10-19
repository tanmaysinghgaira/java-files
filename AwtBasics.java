import java.awt.*;
import java.awt.event.*;

// AwtBasics: shows a Frame with a Label and proper window closing
public class AwtBasics {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Basics - Frame and Label");
        frame.setSize(400, 150);
        frame.setLayout(new BorderLayout());

        Label lbl = new Label("Hello AWT! This is a Label in a Frame.", Label.CENTER);
        frame.add(lbl, BorderLayout.CENTER);

        // Window closing handler
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
