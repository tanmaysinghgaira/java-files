import java.awt.*;import java.awt.event.*;  public class Awtnew{ public static void main(String args[])
      {  Frame f= new Frame("Checkbox Example");f.setSize(400,400);  f.setLayout(null);  f.setVisible(true);f.setTitle("Checkbox Example"); 
        Checkbox chb1 = new Checkbox("DS C++");  chb1.setBounds(100,100, 100,50);  Checkbox chb2 = new Checkbox("Java", true);  chb2.setBounds(100,150, 50,50);
          f.add(chb1);  f.add(chb2); //Close windowf.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});}  }
