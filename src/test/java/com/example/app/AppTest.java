package com.example.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    @Test
    public void testEligibleVoter() {
        Voter v = new Voter("John", 20, "Indian", "ID123", true);
        assertEquals("Eligible to Vote", v.checkEligibility());
    }

    @Test
    public void testUnderageVoter() {
        Voter v = new Voter("Sam", 16, "Indian", "ID456", true);
        assertEquals("Ineligible: Underage (Must be 18+)", v.checkEligibility());
    }

    @Test
    public void testNonCitizen() {
        Voter v = new Voter("Ali", 25, "Foreign", "ID789", true);
        assertEquals("Ineligible: Not an Indian citizen", v.checkEligibility());
    }
}
