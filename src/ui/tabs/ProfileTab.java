package ui.tabs;

import javax.swing.*;

public class ProfileTab extends JPanel {
    JLabel profileLabel = new JLabel("My Profile");
    JLabel nameLabel = new JLabel("Name");
    JLabel phoneLabel = new JLabel("Phone Number");
    JLabel emailLabel = new JLabel("Email Address");

    JTextField nameField = new JTextField("");
    JTextField phoneField = new JTextField("");
    JTextField emailField = new JTextField("");

    JButton editFirstNameButton = new JButton();
    JButton editMiddleNameButton = new JButton();
    JButton editLastNameButton = new JButton();
    JButton editPhoneNumberButton = new JButton();
    JButton editEmailButton = new JButton();

    TabFormat format = new TabFormat();

    public ProfileTab() {
        format.setInset(this);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        format.setFieldSize(nameField);
        format.setFieldSize(phoneField);
        format.setFieldSize(emailField);

        //add labels, buttons, fields
        add(profileLabel);
        add(nameLabel);
        add(nameField);
        add(phoneLabel);
        add(phoneField);
        add(emailLabel);
        add(emailField);
    }



}
