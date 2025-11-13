import java.awt.*;
import java.awt.event.*;
import java.io.*; // *** CHANGED: Import Swing components
import javax.swing.*; // *** ADDED: For padding
import javax.swing.border.EmptyBorder;

// *** CHANGED: Extend JFrame instead of Frame
class Registration extends JFrame implements ActionListener { 
    
    // *** CHANGED: Using Swing components (JLabel, JTextField, etc.)
    JLabel name, mob, email, gender, pass, msg, cityLabel;
    JTextField t1, t2, t3;
    JPasswordField t4; // *** CHANGED: Use JPasswordField for passwords
    JRadioButton m, f; // *** CHANGED: Use JRadioButton for exclusive choice
    JCheckBox terms, showpass;
    ButtonGroup cbg; // *** CHANGED: ButtonGroup for JRadioButtons
    JButton registerButton, resetButton, exitButton; // *** CHANGED: JButton
    JComboBox<String> ch; // *** CHANGED: JComboBox (and made generic)
    Color bgColor = new Color(240, 248, 255);

    Registration() {
        // === Frame Settings ===
        setTitle("User Registration Form");
        setSize(600, 500);
        // *** ADDED: Proper close operation for the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new BorderLayout());
        
        // *** ADDED: Main panel with GridBagLayout for a professional form
        JPanel form = new JPanel(new GridBagLayout());
        form.setBackground(bgColor);
        form.setFont(new Font("Arial", Font.PLAIN, 16));
        // *** ADDED: Padding around the entire form
        form.setBorder(new EmptyBorder(20, 20, 20, 20)); 

        // *** ADDED: GridBagConstraints for precise layout control
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding between components
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // === Header Panel ===
        JLabel title = new JLabel("User Registration Form", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setOpaque(true); // *** ADDED: Needed for setting background in Swing
        title.setBackground(new Color(0, 102, 204));
        title.setForeground(Color.WHITE);
        add(title, BorderLayout.NORTH);

        // === Form Fields ===
        name = new JLabel("Name:");
        mob = new JLabel("Mobile No:");
        email = new JLabel("Email:");
        gender = new JLabel("Gender:");
        pass = new JLabel("Password:");
        cityLabel = new JLabel("City:");

        t1 = new JTextField(20);
        t2 = new JTextField(10);
        t3 = new JTextField(20);
        t4 = new JPasswordField(20); // *** CHANGED
        t4.setEchoChar('*'); // This is the same

        // --- Row 0: Name ---
        gbc.gridx = 0; gbc.gridy = 0; gbc.anchor = GridBagConstraints.WEST;
        form.add(name, gbc);
        gbc.gridx = 1; gbc.gridy = 0; gbc.weightx = 1.0; // Allow field to grow
        form.add(t1, gbc);

        // --- Row 1: Mobile ---
        gbc.gridx = 0; gbc.gridy = 1; gbc.anchor = GridBagConstraints.WEST;
        form.add(mob, gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        form.add(t2, gbc);
        
        // --- Row 2: Email ---
        gbc.gridx = 0; gbc.gridy = 2; gbc.anchor = GridBagConstraints.WEST;
        form.add(email, gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        form.add(t3, gbc);
        
        // --- Row 3: Password ---
        gbc.gridx = 0; gbc.gridy = 3; gbc.anchor = GridBagConstraints.WEST;
        form.add(pass, gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        form.add(t4, gbc);
        
        // --- Row 4: Gender ---
        cbg = new ButtonGroup(); // *** CHANGED
        m = new JRadioButton("Male"); // *** CHANGED
        f = new JRadioButton("Female"); // *** CHANGED
        m.setSelected(true);
        m.setBackground(bgColor); // Match panel background
        f.setBackground(bgColor); // Match panel background
        cbg.add(m);
        cbg.add(f);
        
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        genderPanel.setBackground(bgColor);
        genderPanel.add(m);
        genderPanel.add(f);

        gbc.gridx = 0; gbc.gridy = 4; gbc.anchor = GridBagConstraints.WEST;
        form.add(gender, gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        form.add(genderPanel, gbc);
        
        // --- Row 5: City ---
        String[] cities = {"Select City", "Delhi", "Mumbai", "Kolkata", "Haldwani"};
        ch = new JComboBox<>(cities); // *** CHANGED

        gbc.gridx = 0; gbc.gridy = 5; gbc.anchor = GridBagConstraints.WEST;
        form.add(cityLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 5;
        form.add(ch, gbc);

        // --- Row 6: Terms and Show Password ---
        terms = new JCheckBox("I accept Terms & Conditions");
        showpass = new JCheckBox("Show Password");
        terms.setBackground(bgColor);
        showpass.setBackground(bgColor);

        gbc.gridx = 1; gbc.gridy = 6;
        form.add(terms, gbc);
        
        gbc.gridx = 1; gbc.gridy = 7;
        form.add(showpass, gbc);

        // *** ADDED: Add the main form panel to the center
        add(form, BorderLayout.CENTER); 

        // === Buttons ===
        registerButton = new JButton("Register");
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");

        registerButton.setBackground(new Color(0, 153, 51));
        registerButton.setForeground(Color.white);
        resetButton.setBackground(Color.orange);
        exitButton.setBackground(Color.red);
        exitButton.setForeground(Color.white);

        // === Footer (Buttons + Message) ===
        JPanel footer = new JPanel(new FlowLayout());
        footer.setBackground(bgColor);
        footer.add(registerButton);
        footer.add(resetButton);
        footer.add(exitButton);
        msg = new JLabel("");
        msg.setFont(new Font("Arial", Font.BOLD, 14));
        
        // *** ADDED: A panel to hold the message, so it can be centered
        JPanel messagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        messagePanel.setBackground(bgColor);
        messagePanel.add(msg);
        
        // *** ADDED: Panel to hold both buttons and message
        JPanel southPanel = new JPanel(new BorderLayout());
        southPanel.add(footer, BorderLayout.NORTH);
        southPanel.add(messagePanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        // === Event Listeners ===
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
        exitButton.addActionListener(this);

        // === Show/Hide Password ===
        showpass.addItemListener(e -> {
            if (showpass.isSelected()) { // *** CHANGED: use isSelected()
                t4.setEchoChar((char) 0); // Show password
            } else {
                t4.setEchoChar('*'); // Hide password
            }
        });

        setVisible(true);
    }

    // === Handle Button Clicks ===
    public void actionPerformed(ActionEvent e) {
        // *** CHANGED: Check against the specific button variables
        if (e.getSource() == registerButton) { 
            if (t1.getText().trim().isEmpty()) {
                msg.setText("⚠ Please enter your name!");
                msg.setForeground(Color.RED); // *** ADDED: Make errors red
                return;
            }
            if (!t2.getText().matches("\\d{10}")) {
                msg.setText("⚠ Invalid mobile number!");
                msg.setForeground(Color.RED);
                return;
            }
            if (!t3.getText().contains("@")) {
                msg.setText("⚠ Invalid email!");
                msg.setForeground(Color.RED);
                return;
            }
            // *** CHANGED: Get password from JPasswordField
            String password = new String(t4.getPassword()); 
            if (password.length() < 6) {
                msg.setText("⚠ Password must be 6+ chars!");
                msg.setForeground(Color.RED);
                return;
            }
            if (!terms.isSelected()) { // *** CHANGED: use isSelected()
                msg.setText("⚠ Accept Terms & Conditions!");
                msg.setForeground(Color.RED);
                return;
            }

            // Save data to file
            try {
                FileWriter fw = new FileWriter("registration_data.txt", true);
                fw.write("Name: " + t1.getText() + "\n");
                fw.write("Mobile: " + t2.getText() + "\n");
                fw.write("Email: " + t3.getText() + "\n");
                // *** CHANGED: How to get gender from JRadioButtons
                String genderText = m.isSelected() ? "Male" : "Female"; 
                fw.write("Gender: " + genderText + "\n");
                fw.write("City: " + ch.getSelectedItem() + "\n");
                fw.write("-----------------------------\n");
                fw.close();
                msg.setText("✅ Registration Successful!");
                msg.setForeground(new Color(0, 128, 0)); // *** ADDED: Make success green
            } catch (Exception ex) {
                msg.setText("❌ Error saving data!");
                msg.setForeground(Color.RED);
            }

        } else if (e.getSource() == resetButton) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            terms.setSelected(false); // *** CHANGED: use setSelected()
            msg.setText("");
            m.setSelected(true); // *** CHANGED: Select the radio button
            ch.setSelectedIndex(0); // *** CHANGED: use setSelectedIndex()
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }
}

// === Main Class ===
class Reg {
    public static void main(String args[]) {
        // *** ADDED: Set system look and feel for a professional look
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // *** ADDED: Run the GUI on the Event Dispatch Thread (Thread-safe)
        SwingUtilities.invokeLater(() -> new Registration());
    }
}