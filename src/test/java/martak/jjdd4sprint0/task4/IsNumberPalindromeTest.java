package martak.jjdd4sprint0.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsNumberPalindromeTest {

    private IsNumberPalindrome isNumberPalindrome = new IsNumberPalindrome();

    @Test
    public void shouldReturnTrueIfNumberIsPalidrome() {

        // given
        long number = 12321;

        // when
        boolean result = isNumberPalindrome.isNumberPalindrome3(number);

        // then
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotPalidrome() {

        // given
        long number = 12366521;

        // when
        boolean result = isNumberPalindrome.isNumberPalindrome3(number);

        // then
        assertFalse(result);
    }

}