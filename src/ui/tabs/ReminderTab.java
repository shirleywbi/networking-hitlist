package ui.tabs;

import javax.swing.*;

public class ReminderTab extends JPanel{
    JLabel reminderLabel = new JLabel("Contact Reminders");

    TabFormat format = new TabFormat();

    public ReminderTab() {
        format.setInset(this);
    }

}
