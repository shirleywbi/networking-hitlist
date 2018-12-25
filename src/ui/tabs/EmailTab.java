package ui.tabs;

import javax.swing.*;

public class EmailTab extends JPanel {
    JLabel emailLabel = new JLabel("Email Contacts");

    TabFormat format = new TabFormat();

    public EmailTab() {
        format.setInset(this);
    }
}
