package martak.jjdd4sprint0.task13;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JoinArraysTest {

    private JoinArrays joinArrays = new JoinArrays();

    @Test
    public void join1MethodTest() {
        // given
        int[] array1 = new int[]{1,4,7,0};
        int[] array2 = new int[]{2,0};

        // when
        int[] result = joinArrays.join(array1, array2);
        int[] expected = new int[]{7,4,2,1,0};

        // then
        assertTrue(Arrays.equals(expected, result));
    }

}