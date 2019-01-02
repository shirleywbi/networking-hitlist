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
    JTextField searchField = new JTextField();
    TabFormat format = new TabFormat();

    public ContactsTab() {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(Integer.MAX_VALUE,Integer.MAX_VALUE));
        format.setInset(this);
        format.setTitleFont(contactLabel);
        format.setButtonFont(addContactButton);

        JPanel titlePanel = new JPanel();
        JPanel contactsPanel = new JPanel();

        titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        titlePanel.add(contactLabel);
        titlePanel.add(addContactButton);

        contactsPanel.setLayout(new BoxLayout(contactsPanel,BoxLayout.Y_AXIS));

        //TODO: FAKE CONTACTS FOR CHECKING UI
        ArrayList<String> contactsAsString = new ArrayList<>();
        contactsAsString.add("Peter Rabbit");
        contactsAsString.add("Bob the Builder");
        contactsAsString.add("Alice in Wonderland");
        contactsAsString.add("Steven Universe");
        contactsAsString.add("Dipper Pines");

//        Object[] arrayOfContacts = profile.getContactsAsString().toArray(); //TODO: ACTUAL CODE -- This will need to be updated every time new contact is created
        Object[] arrayOfContacts = contactsAsString.toArray(); //TODO: FAKE TESTING
        JList<Object> listOfContacts = new JList<>(arrayOfContacts);
        format.setSubtitleFont(listOfContacts);

        JScrollPane contactsPane = new JScrollPane(listOfContacts,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        contactsPanel.add(searchField);
        contactsPanel.add(contactsPane);


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
