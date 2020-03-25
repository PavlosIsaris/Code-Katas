package main.test.com.paulisaris.codekatas.reversewords;

import main.java.com.paulisaris.codekatas.reversewords.ReverseWordsFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseWordsFormatterTest {

    @Test
    public void testReverseWordsFormatter() {
        assertArrayEquals(
                new char[]{'l', 'a', 'e', 't', 's', ' ', 'd', 'n', 'u', 'o', 'p', ' ', 'e', 'k', 'a', 'c'},
                ReverseWordsFormatter.reverseWords(new char[]{'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l'}));

        assertArrayEquals(
                new char[]{'l', 'u', 'a', 'p'},
                ReverseWordsFormatter.reverseWords(new char[]{'p', 'a', 'u', 'l'}));
    }
}
