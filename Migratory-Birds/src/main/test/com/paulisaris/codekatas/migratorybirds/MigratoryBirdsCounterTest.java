package main.test.com.paulisaris.codekatas.migratorybirds;

import main.java.com.paulisaris.codekatas.migratorybirds.MigratoryBirdsCounter;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MigratoryBirdsCounterTest {

    @Test
    public void testMigratoryBirdsCounter() {
        MigratoryBirdsCounter migratoryBirdsCounter = new MigratoryBirdsCounter();
        assertEquals(3, migratoryBirdsCounter.
                getSmallestIDOfMostShownBird(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));

        assertEquals(1, migratoryBirdsCounter.
                getSmallestIDOfMostShownBird(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4, 1, 1, 1, 2, 2, 2, 5, 5, 5, 5)));
    }

}
