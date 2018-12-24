package model;

import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactEvent that = (ContactEvent) o;
        return Objects.equals(contactDate, that.contactDate) &&
                Objects.equals(contactComments, that.contactComments) &&
                contactMethod == that.contactMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactDate, contactComments, contactMethod);
    }
}
