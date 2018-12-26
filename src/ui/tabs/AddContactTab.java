package ui.tabs;

import model.Contact;
import model.Profile;
import sun.util.calendar.LocalGregorianCalendar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ui.tabs.ActionCommand.*;

public class AddContactTab extends JPanel implements ActionListener {
    Profile profile = Profile.getInstance();
    JLabel contactLabel = new JLabel("Add Contact");
    JLabel nameLabel = new JLabel("Name");
    JLabel phoneLabel = new JLabel("Phone Number");
    JLabel emailLabel = new JLabel("Email");
    JLabel notesLabel = new JLabel("Notes");
    JButton saveContactButton = new JButton("Save");
    JButton editButton = new JButton();
    JTextField nameField = new JTextField();
    JTextField phoneField = new JTextField();
    JTextField emailField = new JTextField();
    JTextArea notesField = new JTextArea();

    TabFormat format = new TabFormat();

    //Add Contact Tab
    public AddContactTab() {
        format.setInset(this);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        JPanel titlePanel = new JPanel();
        JPanel formPanel = new JPanel();
        titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        titlePanel.setAlignmentX(LEFT_ALIGNMENT);
        formPanel.setLayout(new BoxLayout(formPanel,BoxLayout.Y_AXIS));
        formPanel.setAlignmentX(LEFT_ALIGNMENT);

        //set font size
        format.setTitleFont(contactLabel);
        format.setSubtitleFont(nameLabel);
        format.setSubtitleFont(phoneLabel);
        format.setSubtitleFont(emailLabel);
        format.setSubtitleFont(notesLabel);
        format.setSubtitleFont(nameField);
        format.setSubtitleFont(phoneField);
        format.setSubtitleFont(emailField);
        format.setSubtitleFont(notesField);
        format.setButtonFont(saveContactButton);

        //set field size
        format.setFieldSize(nameField);
        format.setFieldSize(phoneField);
        format.setFieldSize(emailField);
        format.setEditButton(editButton);
        format.setLargeFieldSize(notesField);
        notesField.setLineWrap(true);

        //alignment
        nameLabel.setAlignmentX(LEFT_ALIGNMENT);
        nameField.setAlignmentX(LEFT_ALIGNMENT);
        phoneLabel.setAlignmentX(LEFT_ALIGNMENT);
        phoneField.setAlignmentX(LEFT_ALIGNMENT);
        emailLabel.setAlignmentX(LEFT_ALIGNMENT);
        emailField.setAlignmentX(LEFT_ALIGNMENT);
        notesLabel.setAlignmentX(LEFT_ALIGNMENT);
        notesField.setAlignmentX(LEFT_ALIGNMENT);

        //add JTextArea border
        notesField.setBorder(new JTextField().getBorder());

        //make fields uneditable
        nameField.setEditable(true);
        phoneField.setEditable(true);
        emailField.setEditable(true);
        notesField.setEditable(true);

        //add labels
        titlePanel.add(contactLabel);
        titlePanel.add(editButton);
        editButton.setVisible(false);
        titlePanel.add(saveContactButton);
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(phoneLabel);
        formPanel.add(phoneField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(notesLabel);
        formPanel.add(notesField);

        add(titlePanel);
        add(formPanel);

        //EFFECTS: sets button actions
        saveContactButton.setActionCommand(SAVE_CONTACT.toString());
        saveContactButton.addActionListener(this);
        editButton.setActionCommand(EDIT_CONTACT.toString());
        editButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(SAVE_CONTACT.toString())) {
            //TODO: New Contact using field inputs
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();
            String address = null;
            String occupation = null;
            LocalGregorianCalendar.Date birthday = null;
            String meeting = null;
            String notes = notesField.getText();

            Contact contact = new Contact(name, phone, email, address, occupation, birthday, meeting, notes);
            profile.addContact(contact);

            nameField.setEditable(false);
            phoneField.setEditable(false);
            emailField.setEditable(false);
            notesField.setEditable(false);
            notesField.setBackground(emailField.getBackground());
            editButton.setVisible(true);
            saveContactButton.setVisible(false);

        }
        if (e.getActionCommand().equals(EDIT_CONTACT.toString())) {
            nameField.setEditable(true);
            phoneField.setEditable(true);
            emailField.setEditable(true);
            notesField.setEditable(true);
            notesField.setBackground(emailField.getBackground());
            editButton.setVisible(false);
            saveContactButton.setVisible(true);
        }
    }
}


/*
Reference:
https://stackoverflow.com/questions/4801386/how-do-i-add-an-image-to-a-jbutton
 */
