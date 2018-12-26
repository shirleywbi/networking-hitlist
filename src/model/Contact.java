package model;

import sun.util.calendar.LocalGregorianCalendar;

import java.util.ArrayList;
import java.util.Objects;

public class Contact {
    private String name;
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

    public Contact(String name, String phone, String email, String address, String occupation,
                   LocalGregorianCalendar.Date birthday, String meeting, String notes){
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.occupation = occupation;
        this.birthday = birthday;
        this.meeting = meeting;
        this.notes = notes;
        this.contactEvents = new ArrayList<>();
        this.preferredContactMethod = preferredContactMethod;
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
    public String getOccupation() {
        return occupation;
    }
    public LocalGregorianCalendar.Date getBirthday() {
        return birthday;
    }
    public String getMeeting() {
        return meeting;
    }
    public String getNotes() {
        return notes;
    }
    public ArrayList<ContactEvent> getContactEvents() {
        return contactEvents;
    }
    public ContactMethod getPreferredContactMethod() {
        return preferredContactMethod;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public void setBirthday(LocalGregorianCalendar.Date birthday) {
        this.birthday = birthday;
    }
    public void setMeeting(String meeting) {
        this.meeting = meeting;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public void setContactEvents(ArrayList<ContactEvent> contactEvents) {
        this.contactEvents = contactEvents;
    }
    public void setLastContact(ContactEvent lastContact) {
        this.lastContact = lastContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
