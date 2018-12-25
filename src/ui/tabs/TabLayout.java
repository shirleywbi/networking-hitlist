package ui.tabs;

import javax.swing.*;

public class TabLayout extends JTabbedPane{
    ContactTab contactPanel = new ContactTab();
    ReminderTab reminderPanel = new ReminderTab();
    EmailTab emailPanel = new EmailTab();
    TextTab textPanel = new TextTab();

    public TabLayout() {
        setBounds(50,50,200,200);
        add("Contact", contactPanel);
        add("Contact Reminder", reminderPanel);
        add("Email",emailPanel);
        add("Text",textPanel);
        setTabPlacement(LEFT);

    }
}
