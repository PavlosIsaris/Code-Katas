package test.java.com.paulisaris.codekatas.binarynumbers;

import main.java.com.paulisaris.codekatas.binarynumbers.BinaryNumberFormatter;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryNumbersTest {

    @Test
    public void testBinaryNumbers() {
        BinaryNumberFormatter formatter = new BinaryNumberFormatter();
        assertEquals("100000", formatter.convertBase10ToBase2(32));
        assertEquals("101", formatter.convertBase10ToBase2(5));
        assertEquals("1", formatter.convertBase10ToBase2(1));
        assertEquals("0", formatter.convertBase10ToBase2(0));
        assertEquals("10", formatter.convertBase10ToBase2(2));
        assertEquals("11", formatter.convertBase10ToBase2(3));
    }

}
