package main.java.com.paulisaris.codekatas.migratorybirds;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public static void main(String[] args) {
        MigratoryBirdsCounter migratoryBirdsCounter = new MigratoryBirdsCounter();
        assertEquals(3, migratoryBirdsCounter.
                getSmallestIDOfMostShownBird(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }
}
