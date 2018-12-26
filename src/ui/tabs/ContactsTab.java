package ui.tabs;

import model.Profile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setText("Test");  //TODO: Size this correctly

        contactsPanel.add(scrollPane);

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
