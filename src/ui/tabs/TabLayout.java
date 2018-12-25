package ui.tabs;

import javax.swing.*;

public class TabLayout extends JTabbedPane{
    ProfileTab profilePanel = new ProfileTab();
    ContactTab contactPanel = new ContactTab();
    ReminderTab reminderPanel = new ReminderTab();
    EmailTab emailPanel = new EmailTab();
    TextTab textPanel = new TextTab();

    public TabLayout() {
        add("Profile",profilePanel);
        add("Contact", contactPanel);
        add("Contact Reminder", reminderPanel);
        add("Email",emailPanel);
        add("Text",textPanel);
        setTabPlacement(LEFT);

    }
}
