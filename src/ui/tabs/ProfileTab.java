package ui.tabs;

import exception.InvalidEmailException;
import exception.InvalidPhoneException;
import model.Profile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import static ui.tabs.ActionCommand.EDIT_PROFILE;
import static ui.tabs.ActionCommand.SAVE_PROFILE;

public class ProfileTab extends JPanel implements ActionListener{
    Profile profile = Profile.getInstance();
    JLabel profileLabel = new JLabel("My Profile");
    JLabel nameLabel = new JLabel("Name");
    JLabel phoneLabel = new JLabel("Phone Number");
    JLabel emailLabel = new JLabel("Email Address");
    JTextField nameField = new JTextField("");
    JTextField phoneField = new JTextField("");
    JTextField emailField = new JTextField("");
    JButton editButton = new JButton();
    JButton saveButton = new JButton("Save");
    TabFormat format = new TabFormat();

    public ProfileTab() {
        format.setInset(this);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        format.setFieldSize(nameField);
        format.setFieldSize(phoneField);
        format.setFieldSize(emailField);
        format.setEditButton(editButton);

        //set font
        format.setTitleFont(profileLabel);
        format.setSubtitleFont(nameLabel);
        format.setSubtitleFont(phoneLabel);
        format.setSubtitleFont(emailLabel);
        format.setSubtitleFont(nameField);
        format.setSubtitleFont(phoneField);
        format.setSubtitleFont(emailField);
        format.setButtonFont(saveButton);

        //make fields uneditable
        nameField.setEditable(false);
        emailField.setEditable(false);
        phoneField.setEditable(false);

        //add labels, buttons, fields
        add(profileLabel);
        add(nameLabel);
        add(nameField);
        add(phoneLabel);
        add(phoneField);
        add(emailLabel);
        add(emailField);
        add(editButton);
        add(saveButton);

        //add action
        editButton.setActionCommand(EDIT_PROFILE.toString());
        editButton.addActionListener(this);
        saveButton.setActionCommand(SAVE_PROFILE.toString());
        saveButton.addActionListener(this);
        phoneField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (phoneField.getText().contains("Invalid")) {
                    format.validSettings(phoneField);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        emailField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (emailField.getText().contains("Invalid")) {
                    format.validSettings(emailField);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(EDIT_PROFILE.toString())) {
            nameField.setEditable(true);
            emailField.setEditable(true);
            phoneField.setEditable(true);
        }
        if (e.getActionCommand().equals(SAVE_PROFILE.toString())) {
            profile.setName(nameField.getText());
            try {
                profile.setEmail(emailField.getText());
                profile.setPhone(phoneField.getText());
                nameField.setEditable(false);
                emailField.setEditable(false);
                phoneField.setEditable(false);
            } catch (InvalidEmailException e1) {
                format.invalidSettings(emailField,"email");
            } catch (InvalidPhoneException e1) {
                format.invalidSettings(phoneField,"phone");
            }

        }
    }
}
