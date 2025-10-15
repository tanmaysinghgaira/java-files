import  java.awt.*;
import java.awt.event.WindowAdapter;
public class Awt {
    public static void main(String []arg)
    {
        Frame frame =new Frame ("Basic AWT");
        Label label = new Label (" Welcome to AWT ");
         
        label .setAlignment (Label.CENTER );

        frame.add (label);
        frame.setSize (400,400);

        frame.setVisible (true);

        frame.addWindowListener (new WindowAdapter(){
             
            public void windowCloding (WindowAdapter e)
            {
                System.exit(0);
            }
        });
    }
}
