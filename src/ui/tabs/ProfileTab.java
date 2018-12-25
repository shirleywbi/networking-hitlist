package ui.tabs;

import javax.swing.*;

public class ProfileTab extends JPanel {
    JLabel profileLabel = new JLabel("My Profile");

    JLabel firstNameLabel = new JLabel("");
    JLabel middleNameLabel = new JLabel("");
    JLabel lastNameLabel = new JLabel("");
    JLabel phoneLabel = new JLabel("");
    JLabel emailLabel = new JLabel("");

    JButton editFirstNameButton = new JButton();
    JButton editMiddleNameButton = new JButton();
    JButton editLastNameButton = new JButton();
    JButton editPhoneNumberButton = new JButton();
    JButton editEmailButton = new JButton();

    public ProfileTab() {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        add(profileLabel);
        add(firstNameLabel);
        add(middleNameLabel);
        add(lastNameLabel);
        add(phoneLabel);
        add(emailLabel);
    }



}
