package test.java.com.paulisaris.codekatas.isogramfinder;

import main.java.com.paulisaris.codekatas.isogramfinder.IsogramFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsogramFinderTest {

    @Test
    public void testIsograms() {
        IsogramFinder isogramFinder = new IsogramFinder();

        assertTrue(isogramFinder.isIsogram(""));
        assertTrue(isogramFinder.isIsogram("ambidextrously"));
        assertTrue(isogramFinder.isIsogram("isogram"));
        assertTrue(isogramFinder.isIsogram("123"));
        assertTrue(isogramFinder.isIsogram("uncopyrightable"));
        assertTrue(isogramFinder.isIsogram("paul"));
    }

    @Test
    public void testNonIsograms() {
        IsogramFinder isogramFinder = new IsogramFinder();

        assertFalse(isogramFinder.isIsogram("qq"));
        assertFalse(isogramFinder.isIsogram("paull"));
        assertFalse(isogramFinder.isIsogram("DOCTORWHO"));
        assertFalse(isogramFinder.isIsogram("DoCTORWHO"));
    }

}
