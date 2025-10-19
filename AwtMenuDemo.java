import java.awt.*;
import java.awt.event.*;

// AwtMenuDemo: demonstrates MenuBar, Menu, and MenuItem
public class AwtMenuDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Menu Demo");
        frame.setSize(400, 200);

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem miNew = new MenuItem("New");
        MenuItem miExit = new MenuItem("Exit");

        fileMenu.add(miNew);
        fileMenu.addSeparator();
        fileMenu.add(miExit);
        menuBar.add(fileMenu);

        frame.setMenuBar(menuBar);

        miNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("New selected");
            }
        });

        miExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
