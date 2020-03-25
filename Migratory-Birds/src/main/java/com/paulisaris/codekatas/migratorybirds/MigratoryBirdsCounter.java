package main.java.com.paulisaris.codekatas.migratorybirds;

import javafx.util.Pair;
import java.util.Collections;
import java.util.List;

public class MigratoryBirdsCounter {

    public int getSmallestIDOfMostShownBird(List<Integer> ids) {
        // sort the list in ascending order
        Collections.sort(ids);

        // iterate through the list and
        // count the occurrences for each element.
        // for each element, check if the number of occurrences
        // is larger than the one in the Pair, and substitute

        int occurrencesOfCurrentElement = 0;
        Integer currentElement = ids.get(0);
        // initialize a new Pair that will hold
        // the number of occurrences for the smallest id.
        Pair<Integer, Integer> pair = new Pair<>(currentElement, occurrencesOfCurrentElement);
        for (Integer id : ids) {
            // if we are on a different element
            if (!id.equals(currentElement)) {
                if (occurrencesOfCurrentElement > pair.getValue()) {
                    pair = new Pair<>(ids.get(ids.indexOf(id) - 1), occurrencesOfCurrentElement);
                }
                occurrencesOfCurrentElement = 1;
                currentElement = id;
            } else {
                occurrencesOfCurrentElement++;
            }
        }

        // return the id
        return pair.getKey();
    }

}
