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
        testProfile = Profile.getInstance();
        testProfile.setName("John Smith");
        try {
            testProfile.setEmail("john.smith@gmail.com");
            testProfile.setPhone("604-555-1234");
        } catch (InvalidEmailException e) {
            fail("");
        } catch (InvalidPhoneException e) {
            fail("");
        }
        testProfile.setAddress("555 Test Street, City, Province, PostalCode");
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
            //test passed
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
            fail("");
        } catch (InvalidEmailException e) {
            //test passed
        }
        assertTrue(testProfile.getEmail().equals("john.smith@gmail.com"));
    }

}