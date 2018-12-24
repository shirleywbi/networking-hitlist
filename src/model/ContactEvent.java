package model;

import java.util.Date;

//Contact Event: created for every correspondence (phone/email/in-person) with contact
public class ContactEvent {
    private Date contactDate;
    private String contactComments;
    private ContactMethod contactMethod;

    //EFFECTS: event for a single correspondence with contact (phone/email/in-person/mail)
    public ContactEvent(Date contactDate, String contactComments, ContactMethod contactMethod) {
        this.contactDate = contactDate;
        this.contactComments = contactComments;
        this.contactMethod = contactMethod;
    }


}
