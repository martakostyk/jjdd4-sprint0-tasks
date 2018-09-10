package martak.jjdd4sprint0.task9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortingTest {

    BubbleSorting bubbleSorting = new BubbleSorting();

    @Test
    public void shouldReturnSortedArray() {
        // given
        int[] array = new int[]{10,6,-2,5,0,11,19,7};

        // when
        int[] expected = new int[]{-2,0,5,6,7,10,11,19};
        int[] actual = bubbleSorting.sort(array);

        // then
        assert(Arrays.equals(expected, actual));
    }

}