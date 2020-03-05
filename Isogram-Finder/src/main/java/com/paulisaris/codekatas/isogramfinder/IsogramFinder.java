package com.paulisaris.codekatas.isogramfinder;

import java.util.Set;
import java.util.TreeSet;

public class IsogramFinder {

    protected Set<Character> letters;

    public IsogramFinder() {
        this.letters = new TreeSet<>();
    }

    public boolean isIsogram(String word) {
        // if string empty, we consider it to be an Isogram.
        if(word.length() == 0)
            return true;
        for(char letter : word.toCharArray()) {
            if(isLetterInFoundLetters(Character.toLowerCase(letter)))
                return false;
        }
        this.letters = new TreeSet<>();
        return true;
    }

    protected boolean isLetterInFoundLetters(char letter) {
        if(letters.contains(letter))
            return true;
        letters.add(letter);
        return false;
    }
}
