package model;

import sun.util.calendar.LocalGregorianCalendar;

import java.util.ArrayList;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String occupation;
    private String phone;
    private String email;
    private LocalGregorianCalendar.Date birthday;
    private String meeting;
    private String notes;
    private ArrayList<ContactEvent> contactEvents;
    private ContactEvent lastContact;
    private ContactMethod preferredContactMethod;

    //TODO: Override Hashcode/Equals, will need to determine what to match for it to be the same

}
