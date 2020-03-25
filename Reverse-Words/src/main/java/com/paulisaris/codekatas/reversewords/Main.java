package main.java.com.paulisaris.codekatas.reversewords;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Main {

    public static void main(String[] args) {
        assertArrayEquals(
                new char[]{'l', 'u', 'a', 'p'},
                ReverseWordsFormatter.reverseWords(new char[]{'p', 'a', 'u', 'l'}));
    }
}
