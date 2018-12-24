package model;

import sun.util.calendar.LocalGregorianCalendar;

import java.util.ArrayList;
import java.util.Objects;

public class Contact {
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private String occupation;
    private LocalGregorianCalendar.Date birthday;
    private String meeting;
    private String notes;
    private ArrayList<ContactEvent> contactEvents;
    private ContactEvent lastContact;
    private ContactMethod preferredContactMethod;

    public Contact(String firstName, String middleName, String lastName, String phone, String email){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    //MODIFIES: this
    //EFFECTS: adds contact event
    public void addContactEvent(ContactEvent event) {
        if (!contactEvents.contains(event)) {
            contactEvents.remove(event);
        }
    }

    //EFFECTS: returns last date, time, contact methods and comments
    public ContactEvent getLastContact() {
        return contactEvents.get(contactEvents.size());
    }

    //MODIFIES: this
    //EFFECTS: sets preferred contact method
    public void setPreferredContactMethod(ContactMethod contactMethod) {
        this.preferredContactMethod = contactMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) &&
                Objects.equals(middleName, contact.middleName) &&
                Objects.equals(lastName, contact.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName);
    }
}
