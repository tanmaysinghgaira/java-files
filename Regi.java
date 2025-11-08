import java.awt.*;
import java.awt.event.*;

// Class for Registration Form Window
class Regi extends Frame implements ActionListener {

    // Declare GUI components
    Label name, mob, gender, email, pass, city, msg;
    TextField t1, t2, t3, t4;
    Checkbox m, f;
    CheckboxGroup cbg;
    Choice ch;
    Checkbox terms;
    Button b1, b2;

    // Constructor — sets up GUI
    Regi() {

        // ----- Create Labels -----
        name = new Label("Enter Name:");
        mob = new Label("Mobile Number:");
        email = new Label("Email:");
        pass = new Label("Password:");
        gender = new Label("Gender:");
        city = new Label("City:");
        msg = new Label("");

        // ----- Create Text Fields -----
        t1 = new TextField(20);
        t2 = new TextField(10);
        t3 = new TextField(20);
        t4 = new TextField(20);
        t4.setEchoChar('*'); // Mask password input

        // ----- Create Gender Checkboxes -----
        cbg = new CheckboxGroup();
        m = new Checkbox("Male", cbg, true);
        f = new Checkbox("Female", cbg, false);

        // ----- Create City Dropdown -----
        ch = new Choice();
        ch.add("Select City");
        ch.add("Haldwani");
        ch.add("Nainital");
        ch.add("Delhi");
        ch.add("Mumbai");
        ch.add("Lucknow");

        // ----- Create Terms Checkbox -----
        terms = new Checkbox("I accept all Terms & Conditions");

        // ----- Create Buttons -----
        b1 = new Button("Register");
        b2 = new Button("Clear");

        // Set button background and text color
        b1.setBackground(new Color(0, 102, 204)); // Blue
        b1.setForeground(Color.white);

        b2.setBackground(new Color(255, 77, 77)); // Red
        b2.setForeground(Color.white);

        // ----- Set Layout -----
        setLayout(new GridLayout(9, 2, 10, 10)); // 9 rows, 2 columns, with spacing

        // ----- Add Components -----
        add(name); add(t1);
        add(mob); add(t2);
        add(email); add(t3);
        add(pass); add(t4);

        // Gender Section
        add(gender);
        Panel genderPanel = new Panel();
        genderPanel.setBackground(new Color(230, 240, 255)); // Light background for gender panel
        genderPanel.add(m);
        genderPanel.add(f);
        add(genderPanel);

        // City Section
        add(city); add(ch);

        // Terms & Conditions
        add(terms);

        // Button Panel
        Panel buttonPanel = new Panel();
        buttonPanel.setBackground(new Color(230, 240, 255)); // match background
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        add(buttonPanel);

        // Message Label
        add(msg);

        // ----- Frame Settings -----
        setTitle("User Registration Form");
        setSize(450, 400);
        setResizable(false);

        // Set background color for the entire Frame
        setBackground(new Color(230, 240, 255)); // Light blueish background

        // Center the window on the screen
        setLocationRelativeTo(null);

        // Make it visible
        setVisible(true);

        // ----- Register Action Listeners -----
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    // ----- Event Handling -----
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) { // Register button clicked
            if (terms.getState()) {
                msg.setText("✅ Registration Successful!");
                msg.setForeground(new Color(0, 153, 0)); // Green message
            } else {
                msg.setText("⚠️ Please accept Terms & Conditions!");
                msg.setForeground(Color.red);
            }
        } else if (e.getSource() == b2) { // Clear button clicked
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            cbg.setSelectedCheckbox(m);
            ch.select(0);
            terms.setState(false);
            msg.setText("");
        }
    }

    // ----- Main Method -----
    public static void main(String args[]) {
        new Regi(); // Create and show form
    }
}
