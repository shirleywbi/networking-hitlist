package model;

import exception.InvalidEmailException;
import exception.InvalidPhoneException;
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

    //EFFECTS: returns true if contact's name, phone, email, address, occupation, or notes contains given string
    //TODO: Does not work for ContactEvent or Birthday (yet?); Suggestion: have it show what it actually contains too
    public boolean checkContainsString(String s) {
        return checkInName(s)||checkInPhone(s)||checkInEmail(s)||checkInAddress(s)||checkInOccupation(s)||
                checkInMeetings(s)||checkInNotes(s);
    }
    public boolean checkInName(String string){
        return (name.contains(string));
    }
    public boolean checkInPhone(String string){
        return (phone.contains(string));
    }
    public boolean checkInEmail(String string){
        return (email.contains(string));
    }
    public boolean checkInAddress(String string){
        return (address.contains(string));
    }
    public boolean checkInOccupation(String string){
        return (occupation.contains(string));
    }
    public boolean checkInMeetings(String string){
        return (meeting.contains(string));
    }
    public boolean checkInNotes(String string){
        return (notes.contains(string));
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
