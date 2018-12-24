package model;

import exception.InvalidEmailException;
import exception.InvalidPhoneException;

import java.util.ArrayList;

public class MyProfile {
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private ArrayList<Contact> contacts = new ArrayList<>();

    public MyProfile(String firstName, String lastName, String phone, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    //TODO: Remember to try/catch
    public void updatePhone(String phone) throws InvalidPhoneException {
        if (phone.matches("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$")) {
            this.phone = phone;
        } else {
            throw new InvalidPhoneException();
        }
    }

    public void removePhone() {
        this.phone = null;
    }

    //TODO: Remember to try/catch
    public void updateEmail(String email) throws InvalidEmailException {
        if (email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
            this.email = email;
        } else {
            throw new InvalidEmailException();
        }
    }

    public void removeEmail() {
        this.email = null;
    }

    //MODIFIES: this
    //EFFECTS: adds contact to contact list
    public void addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
        }
    }

    //MODIFIES: this
    //EFFECTS: removes contact from contact list
    public void removeContact(Contact contact) {
        if (contacts.contains(contact)) {
            contacts.remove(contact);
        }
    }

    public void updateContact(/*TODO: This will likely end up being a string*/) {
    }
}
