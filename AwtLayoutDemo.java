import java.awt.*;
import java.awt.event.*;

// AwtLayoutDemo: demonstrates FlowLayout and BorderLayout using Panels
public class AwtLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Layouts Demo");
        frame.setSize(500, 200);

        // Top panel with FlowLayout
        Panel top = new Panel(new FlowLayout());
        top.add(new Label("Top - FlowLayout:"));
        top.add(new Button("One"));
        top.add(new Button("Two"));
        top.add(new Button("Three"));

        // Center with BorderLayout
        Panel center = new Panel(new BorderLayout());
        center.add(new Label("North area"), BorderLayout.NORTH);
        center.add(new Label("Center area"), BorderLayout.CENTER);
        center.add(new Label("South area"), BorderLayout.SOUTH);

        frame.setLayout(new BorderLayout(5,5));
        frame.add(top, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
