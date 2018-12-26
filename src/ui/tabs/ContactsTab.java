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
        format.setInset(this);
        format.setTitleFont(contactLabel);
        format.setButtonFont(addContactButton);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(contactLabel);
        add(addContactButton);

        //EFFECTS: sets button actions
        addContactButton.setActionCommand(ADD_CONTACT.toString());
        addContactButton.addActionListener(this);
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
