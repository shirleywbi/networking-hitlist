package ui.tabs;

import model.Profile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static ui.tabs.ActionCommand.ADD_CONTACT;

public class ContactsTab extends JPanel implements ActionListener {
    Profile profile = Profile.getInstance();
    JLabel contactLabel = new JLabel("Contacts");
    JButton addContactButton = new JButton("+");

    TabFormat format = new TabFormat();

    public ContactsTab() {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        format.setInset(this);
        format.setTitleFont(contactLabel);
        format.setButtonFont(addContactButton);

        JPanel titlePanel = new JPanel();
        JPanel contactsPanel = new JPanel();
        titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        contactsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        titlePanel.add(contactLabel);
        titlePanel.add(addContactButton);

        //TODO: FAKE CONTACTS FOR CHECKING UI
        ArrayList<String> contactsAsString = new ArrayList<>();
        contactsAsString.add("George");
        contactsAsString.add("Peter");
        contactsAsString.add("Bob");
        contactsAsString.add("Alice");
        contactsAsString.add("George");
        contactsAsString.add("Peter");
        contactsAsString.add("Bob");

//        Object[] arrayOfContacts = profile.getContactsAsString().toArray(); //TODO: ACTUAL CODE -- This will need to be updated every time new contact is created
        Object[] arrayOfContacts = contactsAsString.toArray(); //TODO: FAKE TESTING
        JList<Object> listOfContacts = new JList<>(arrayOfContacts);

//        JTable table = new JTable(new DefaultTableModel(),1);
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("",);
        JScrollPane scrollPane = new JScrollPane(listOfContacts);

        contactsPanel.add(scrollPane);

        //TODO: Idea for contacts pane - https://www.javatpoint.com/BoxLayout
//        for (int i = 0;i<profile.getContacts().size();i++) {
//            buttons[i] = new Button (profile.getContacts().get(i).getName());
//            add (buttons[i]);
//        }

        add(titlePanel);
        add(contactsPanel);

        //EFFECTS: sets button actions
        addContactButton.setActionCommand(ADD_CONTACT.toString());
        addContactButton.addActionListener(this);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(ADD_CONTACT.toString())) {

        }
    }
}
