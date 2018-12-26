package model;

import exception.InvalidEmailException;
import exception.InvalidPhoneException;

import java.util.ArrayList;

//Singleton pattern on Profile with personal information
public class Profile {
    private static Profile instance = null;
    private String name;
    private String phone;
    private String email;
    private String address;
    private ArrayList<Contact> contacts = new ArrayList<>();

    private Profile(String name, String phone, String email, String address) {
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    //EFFECTS: creates empty profile
    public static Profile getInstance() {
        if (instance == null) {
            instance = new Profile("", "", "", "");
        }
        return instance;
    }

    //MODIFIES: this
    //EFFECTS: adds contact to contact list, //TODO: in alphabetal order
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

    public ArrayList<Contact> sortContacts() {
        return null; //stub
    }

    //getters
    public String getName() {
        return name;
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
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) throws InvalidPhoneException {
        if (phone.matches("^([+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*){0,1}$")) {
            this.phone = phone;
        } else {
            throw new InvalidPhoneException();
        }
    }

    public void setEmail(String email) throws InvalidEmailException {
        if (email.matches("^([\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}){0,1}$")) {
            this.email = email;
        } else {
            throw new InvalidEmailException();
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

}