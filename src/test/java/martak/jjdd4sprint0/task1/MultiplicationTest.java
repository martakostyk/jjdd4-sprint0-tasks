package martak.jjdd4sprint0.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    public void shouldReturnNegativeValueWhenOneParameterIsNegative() {
        // given
        Multiplication multiplication = new Multiplication();

        // when
        int result = multiplication.multiply3(20, -14);
        int expected = -280;

        // then
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnPositiveValueWhenTwoParameterIsNegative() {
        // given
        Multiplication multiplication = new Multiplication();

        // when
        int result = multiplication.multiply3(-20, -14);
        int expected = 280;

        // then
        assertEquals(expected, result);
    }

}