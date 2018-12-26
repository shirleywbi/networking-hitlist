package tests;

import model.Profile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProfileTest {
    Profile testProfile;

    @BeforeEach
    public void testSetup() {
        testProfile = Profile.getInstance();
        testProfile.setName("John Smith");
        testProfile.setEmail("john.smith@gmail.com");
        testProfile.setPhone("604-555-1234");
        testProfile.setAddress("555 Test Street, City, Province, PostalCode");
    }

    @Test
    public void testUpdatePhoneValid() {
        testProfile.setPhone("604-555-4321");
        assertTrue(testProfile.getPhone().equals("604-555-4321"));
    }

    @Test
    public void testUpdatePhoneInvalid() {
        testProfile.setPhone("testphone");
        assertTrue(testProfile.getPhone().equals("604-555-1234"));
    }

    @Test
    public void testUpdateEmailValid() {
        testProfile.setEmail("j.smith@ubc.ca");
        assertTrue(testProfile.getEmail().equals("j.smith@ubc.ca"));
    }

    @Test
    public void testUpdateEmailInvalid() {
        testProfile.setEmail("@");
        assertTrue(testProfile.getEmail().equals("john.smith@gmail.com"));
    }

}