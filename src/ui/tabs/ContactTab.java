package ui.tabs;

import model.Contact;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
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
    JButton editNameButton = new JButton();
    JButton editPhoneNumberButton = new JButton();
    JButton editEmailButton = new JButton();
    JButton editNotesButton = new JButton();

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
        contactLabel.setFont(format.getTitleFont());
        nameLabel.setFont(format.getSubtitleFont());
        phoneLabel.setFont(format.getSubtitleFont());
        emailLabel.setFont(format.getSubtitleFont());
        notesLabel.setFont(format.getSubtitleFont());
        nameField.setFont(format.getSubtitleFont());
        emailField.setFont(format.getSubtitleFont());
        notesField.setFont(format.getSubtitleFont());

        //set field size
        format.setFieldSize(nameField);
        format.setFieldSize(phoneField);
        format.setFieldSize(emailField);
        format.setLargeFieldSize(notesField);

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

        try {
            //TODO: This is not working, need to figure out why calling null
            Image img = ImageIO.read(getClass().getResource("resources/edit-img.png"));
            editNameButton.setIcon(new ImageIcon(img));
            editPhoneNumberButton.setIcon(new ImageIcon(img));
            editEmailButton.setIcon(new ImageIcon(img));
            editNotesButton.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(addContactButton);
        add(editNameButton);
        add(editPhoneNumberButton);
        add(editEmailButton);
        add(editNotesButton);
        add(saveContactButton);

        //EFFECTS: sets button actions
        addContactButton.setActionCommand(ADD_CONTACT.toString());
        addContactButton.addActionListener(this);
        saveContactButton.setActionCommand(SAVE_CONTACT.toString());
        saveContactButton.addActionListener(this);
        editNameButton.setActionCommand(EDIT_NAME.toString());
        editNameButton.addActionListener(this);
        editPhoneNumberButton.setActionCommand(EDIT_PHONE.toString());
        editPhoneNumberButton.addActionListener(this);
        editEmailButton.setActionCommand(EDIT_EMAIL.toString());
        editEmailButton.addActionListener(this);
        editNotesButton.setActionCommand(EDIT_NOTES.toString());
        editNotesButton.addActionListener(this);
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
        if (e.equals(EDIT_NAME.toString())) {

        }
        if (e.equals(EDIT_PHONE.toString())) {

        }
        if (e.equals(EDIT_EMAIL.toString())) {

        }
        if (e.equals(EDIT_NOTES.toString())) {

        }
    }
}


/*
Reference:
https://stackoverflow.com/questions/4801386/how-do-i-add-an-image-to-a-jbutton
 */
