package ui.tabs;

import javax.swing.*;

public class ContactTab extends JPanel {
    JLabel contactLabel = new JLabel("Add Contact");
    JLabel firstNameLabel = new JLabel("First Name");
    JLabel middleNameLabel = new JLabel("Middle Name");
    JLabel lastNameLabel = new JLabel("Last Name");
    JLabel phoneLabel = new JLabel("Phone Number");
    JLabel emailLabel = new JLabel("Email");
    JLabel notesLabel = new JLabel("Notes");
    //TODO: Switch to JTextField and when edit is clicked, set Editable to true?

    JButton addContactButton = new JButton();
    JButton saveContactButton = new JButton();
    JButton editFirstNameButton = new JButton();
    JButton editMiddleNameButton = new JButton();
    JButton editLastNameButton = new JButton();
    JButton editPhoneNumberButton = new JButton();
    JButton editEmailButton = new JButton();
    JButton editNotesButton = new JButton();

    ImageIcon editButtonImage = new ImageIcon();

    public ContactTab() {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        add(contactLabel);
        add(firstNameLabel);
        add(middleNameLabel);
        add(lastNameLabel);
        add(phoneLabel);
        add(emailLabel);
        add(notesLabel);
    }
}
