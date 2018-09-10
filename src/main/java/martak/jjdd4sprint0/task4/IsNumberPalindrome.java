package martak.jjdd4sprint0.task4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class IsNumberPalindrome {

    private Logger LOG = LoggerFactory.getLogger(IsNumberPalindrome.class);

    public boolean isNumberPalindrome(long number) {

        String stringNumber = String.valueOf(number);

        for (int i = 0; i < stringNumber.length()/2; i++) {
            if (stringNumber.charAt(i) != stringNumber.charAt(stringNumber.length()- (i + 1))) {
                return false;
            }
        }
        return true;
    }

    public boolean isNumberPalindrome2(long number) {

        String stringValue = String.valueOf(number);

        return stringValue.equals(new StringBuilder(stringValue).reverse().toString());
    }

    public boolean isNumberPalindrome3(long number) {

        int digits = 1;
        long newNumber = number;
        while (newNumber >= 10) {
            newNumber /= 10;
            digits++;
        }
        LOG.info("number has {} digits", digits);

        int[] integers = new int[digits];

        for (int i = 0; i < digits; i++) {
            integers[i] = (int) (number / Math.pow(10, digits - (i + 1)));
            number = (long) (number % Math.pow(10, digits - (i + 1)));
        }
        LOG.info("integer array: {}", Arrays.toString(integers));

        for (int i = 0; i < integers.length/2; i++) {
            if (integers[i] != integers[integers.length- (i + 1)]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsNumberPalindrome isNumberPalindrome = new IsNumberPalindrome();
        isNumberPalindrome.isNumberPalindrome3(41024);
    }
}
