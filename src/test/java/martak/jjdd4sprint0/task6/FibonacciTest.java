package martak.jjdd4sprint0.task6;

import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    public void shouldReturnZero() {
        // given
        Fibonacci fibonacci = new Fibonacci();

        // when
        long actual = fibonacci.fibonacciValue(0);
        long expect = 0;

        // then
        assert(expect == actual);
    }

    @Test
    public void shouldReturnRightValue() {
        // given
        Fibonacci fibonacci = new Fibonacci();

        // when
        long actual = fibonacci.fibonacciValue(14);
        long expect = 377;

        // then
        assert(expect == actual);
    }

}