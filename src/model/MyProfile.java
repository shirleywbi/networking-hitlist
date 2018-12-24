package model;

import java.util.HashSet;
import java.util.Set;

public class MyProfile {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Set<Contact> contacts = new HashSet<>();

    public MyProfile(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public void changePhone(String phone) {
        //TODO: phone number check with regex
        this.phone = phone;
    }

    public void removePhone(String phone) {

    }
}
