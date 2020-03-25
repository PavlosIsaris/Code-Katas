package main.java.com.paulisaris.codekatas.reversewords;

public class ReverseWordsFormatter {

    /**
     * Reverses the order of the letters in an array of characters
     *
     * @param message the array of characters
     * @return an array of characters with reversed order
     */
    public static char[] reverseWords(char[] message) {
        char[] result = new char[message.length];

        for(int i = 0; i < message.length; i++) {
            char temp = message[i];
            result[i] = message[message.length - (i + 1)];
            result[message.length - (i + 1)] = temp;
        }

        return result;
    }

}
