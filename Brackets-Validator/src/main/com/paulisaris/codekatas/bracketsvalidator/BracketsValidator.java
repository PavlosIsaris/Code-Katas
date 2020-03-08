package main.com.paulisaris.codekatas.bracketsvalidator;

import java.util.Arrays;
import java.util.Stack;

public class BracketsValidator {

    protected char[] openers = {'{', '[', '('};
    protected char[] closers = {'}', ']', ')'};

    public boolean validate(String input) {

        Stack chars = new Stack();

        // for each character,
        // if it is an opener
            // put it in the stack
        // if it is a closer
            // check if the last item in the stack is the corresponding opener for example "{" for "}" and "(" for ")"
                // if not, return false
                // if yes, pop the item from the stack

        for(char c : input.toCharArray()) {
            if(isOpener(c)) {
                chars.push(c);
                continue;
            }
            if(isCloser(c)) {
                char lastInserted = (char) chars.peek();
                if(!charactersAreCorresponding(lastInserted, c)) {
                    return false;
                } else {
                    chars.pop();
                }
            }

        }
        return true;
    }

    protected boolean isOpener(char c) {
        return contains(openers, c);
    }

    protected boolean isCloser(char c) {
        return contains(closers, c);
    }

    private boolean contains(char[] charArray, char character) {
        for (char c : charArray) {
            if (c == character)
                return true;
        }
        return false;
    }

    protected boolean charactersAreCorresponding(char opener, char closer) {
        // if they have the same position (index) in the arrays
        return isOpener(opener) && (new String(openers).indexOf(opener) == new String(closers).indexOf(closer));
    }
}
