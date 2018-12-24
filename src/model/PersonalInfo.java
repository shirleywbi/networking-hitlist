package model;

import exception.InvalidEmailException;
import exception.InvalidPhoneException;

import java.util.ArrayList;

public class PersonalInfo {
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private ArrayList<Contact> contacts = new ArrayList<>();

    public PersonalInfo(String firstName, String lastName, String phone, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
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

    public void updateContact(Contact contact) {
        //TODO
    }

    //getters
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhone(String phone) throws InvalidPhoneException {
        if (phone.matches("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$")) {
            this.phone = phone;
        } else {
            throw new InvalidPhoneException();
        }
    }
    public void setEmail(String email) throws InvalidEmailException {
        if (email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
            this.email = email;
        } else {
            throw new InvalidEmailException();
        }
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void removePhone() {
        this.phone = null;
    }
    public void removeEmail() {
        this.email = null;
    }

}