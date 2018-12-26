package ui.tabs;

import javax.swing.*;

public class TabLayout extends JTabbedPane{
    ProfileTab profileTab = new ProfileTab();
    ContactsTab contactsTab = new ContactsTab();
    AddContactTab addContactTab = new AddContactTab();
    ReminderTab reminderTab = new ReminderTab();
    EmailTab emailTab = new EmailTab();
    TextTab textTab = new TextTab();
    TabFormat format = new TabFormat();

    public TabLayout() {
        format.setTitleFont(this);
        add("Profile", profileTab);
        add("Contacts",contactsTab);
        add("Add Contact", addContactTab);
        add("Contact Reminder", reminderTab);
        add("Email", emailTab);
        add("Text", textTab);
        setTabPlacement(LEFT);

    }
}
