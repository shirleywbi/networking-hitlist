package ui.tabs;

import model.Contact;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ui.tabs.ActionCommand.*;

public class ContactTab extends JPanel implements ActionListener {
    JLabel contactLabel = new JLabel("Add Contact");
    JLabel nameLabel = new JLabel("Name");
    JLabel phoneLabel = new JLabel("Phone Number");
    JLabel emailLabel = new JLabel("Email");
    JLabel notesLabel = new JLabel("Notes");
    //TODO: Switch to JTextField and when edit is clicked, set Editable to true?

    JButton addContactButton = new JButton("+");
    JButton saveContactButton = new JButton("Save");
    JButton editButton = new JButton();

    JTextField nameField = new JTextField();
    JTextField phoneField = new JTextField();
    JTextField emailField = new JTextField();
    JTextField notesField = new JTextField();

    TabFormat format = new TabFormat();

    //Add Contact Tab
    public ContactTab() {
        format.setInset(this);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        //set font size
        format.setTitleFont(contactLabel);
        format.setSubtitleFont(nameLabel);
        format.setSubtitleFont(phoneLabel);
        format.setSubtitleFont(emailLabel);
        format.setSubtitleFont(notesLabel);
        format.setSubtitleFont(nameField);
        format.setSubtitleFont(emailField);
        format.setSubtitleFont(notesField);
        format.setSubtitleFont(addContactButton);
        format.setSubtitleFont(saveContactButton);

        //set field size
        format.setFieldSize(nameField);
        format.setFieldSize(phoneField);
        format.setFieldSize(emailField);
        format.setLargeFieldSize(notesField);

        format.setEditButton(editButton);

        //add labels
        add(contactLabel);
        add(nameLabel);
        add(nameField);
        add(phoneLabel);
        add(phoneField);
        add(emailLabel);
        add(emailField);
        add(notesLabel);
        add(notesField);

        add(addContactButton);
        add(editButton);
        add(saveContactButton);

        //EFFECTS: sets button actions
        addContactButton.setActionCommand(ADD_CONTACT.toString());
        addContactButton.addActionListener(this);
        saveContactButton.setActionCommand(SAVE_CONTACT.toString());
        saveContactButton.addActionListener(this);
        editButton.setActionCommand(EDIT_CONTACT.toString());
        editButton.addActionListener(this);
    }

    //View Contacts Tab
    public ContactTab(String string) {
        JScrollPane scrollPane = new JScrollPane();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.equals(ADD_CONTACT.toString())) {
            //TODO: Show new panel
        }
        if (e.equals(SAVE_CONTACT.toString())) {
            //TODO: New Contact using field inputs
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();
            Contact contact = new Contact(name,phone,email);

        }
        if (e.equals(EDIT_CONTACT.toString())) {

        }
    }
}


/*
Reference:
https://stackoverflow.com/questions/4801386/how-do-i-add-an-image-to-a-jbutton
 */
