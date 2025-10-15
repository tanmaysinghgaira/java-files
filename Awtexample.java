import java.awt.*;

public class Awtexample {
    
    public static void main (String []args){
        Frame f = new  Frame("My FIRST AWT FRAME");

        Label l = new Label("Enter YOUR NAME");

        Label l1 = new Label ("Enter YOUR PASSWORD");

        TextField t = new TextField();
        TextField t1 = new TextField();

        Button b = new Button ("SUBMIY");

        f.add(l);
        f.add(t);
        f.add(l1);  
        f.add(t1);
        f.add(b);   
         

        f.setLayout(new FlowLayout());

        f.setSize(500,500);
        f.setVisible(true);
        f.setBackground(Color.cyan);
    }
}
