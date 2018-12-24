package model;

import sun.util.calendar.LocalGregorianCalendar;

import java.util.ArrayList;

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

    public void addContactEvent(ContactEvent event) {
        if (!contactEvents.contains(event)) {
            contactEvents.remove(event);
        }
    }

    //TODO: update every time contactEvent is added - observer pattern will be needed
    public ContactEvent getLastContact() {
        return contactEvents.get(contactEvents.size());
    }

    public void setPreferredContactMethod(ContactMethod contactMethod) {
        this.preferredContactMethod = contactMethod;
    }

    //TODO: Override Hashcode/Equals, will need to determine what to match for it to be the same

}
