package main.java.com.paulisaris.codekatas.binarynumbers;

public class BinaryNumberFormatter {

    protected String digits;

    public String convertBase10ToBase2(int number) {
        this.digits = "";
        return new StringBuilder(divideWith2AndGetDigits(number)).reverse().toString();
    }

    public String divideWith2AndGetDigits(int number) {
        int result = number / 2;
        int remainder = number % 2;

        if(result == 0)
            return digits + remainder;
        digits += remainder;
        return divideWith2AndGetDigits(result);
    }

}
