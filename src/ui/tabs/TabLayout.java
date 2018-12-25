package ui.tabs;

import javax.swing.*;

import static javax.swing.SwingConstants.LEFT;

public class TabLayout {

    public JTabbedPane createContactsTab() {
        JTabbedPane panelLayout = new JTabbedPane();
        ContactTab contactPanel = new ContactTab();
        ReminderTab reminderPanel = new ReminderTab();
        EmailTab emailPanel = new EmailTab();
        TextTab textPanel = new TextTab();
        panelLayout.add("Contact", contactPanel);
        panelLayout.add("Contact Reminder", reminderPanel);
        panelLayout.add("Email",emailPanel);
        panelLayout.add("Text",textPanel);
        panelLayout.setTabPlacement(LEFT);
        return panelLayout;
    }
}
