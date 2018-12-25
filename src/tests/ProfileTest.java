package tests;

import exception.InvalidEmailException;
import exception.InvalidPhoneException;
import model.Profile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class ProfileTest {
    Profile testProfile;

    @BeforeEach
    public void testSetup() {
        testProfile = Profile.getInstance("John","Smith","604-555-1234","john.smith@gmail.com",
                "555 Test Street, City, Province, PostalCode");
    }

    @Test
    public void testUpdatePhoneValid() {
        try {
            testProfile.setPhone("604-555-4321");
        } catch (InvalidPhoneException e) {
            fail("");
        }
        assertTrue(testProfile.getPhone().equals("604-555-4321"));
    }

    @Test
    public void testUpdatePhoneInvalid() {
        try {
            testProfile.setPhone("testphone");
            fail("");
        } catch (InvalidPhoneException e) {
            //pass, exception should be thrown
        }
        assertTrue(testProfile.getPhone().equals("604-555-1234"));
    }

    @Test
    public void testUpdateEmailValid() {
        try {
            testProfile.setEmail("j.smith@ubc.ca");
        } catch (InvalidEmailException e) {
            fail("");
        }
        assertTrue(testProfile.getEmail().equals("j.smith@ubc.ca"));
    }

    @Test
    public void testUpdateEmailInvalid() {
        try {
            testProfile.setEmail("@");
        } catch (InvalidEmailException e) {
            //pass, exception should be thrown
        }
        assertTrue(testProfile.getEmail().equals("john.smith@gmail.com"));
    }

}
