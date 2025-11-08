
import java.awt.*;
import java.awt.event.*;


class Registration extends Frame implements ActionListener{

    Label name ,mob, gender, email,pass,city,msg;

    TextField t1,t2,t3,t4;
    Checkbox m,f;

    CheckboxGroup cbg;
    Choice c1;
    Checkbox term;
    Button b1,b2;

    Registration (){

        name = new Label("Name");
        mob = new Label("MOBILE NO");
        email = new Label("Email");
        gender = new Label("Gender");
        city =new Label ("City");
        pass =new Label("Password");
        msg = new Label("");


        //Create text fields
        t1 = new TextField();
        t2 = new TextField();

        t3 = new TextField();
        t4 = new TextField();
        t4.setEchoChar('*'); //mark password field


        setVisible(true);


    }
    public static void main(String args[]){

        Registration reg = new Registration();
    }

}