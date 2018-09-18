package martak.jjdd4sprint0.task13;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class JoinArraysTest {

    private JoinArrays joinArrays;

    @BeforeAll
    public void setUp() {
        this.joinArrays = new JoinArrays();
    }

    @Test
    public void shouldJoinArraysWithoutDuplicatesAndSort() {
        // given
        int[] array1 = new int[]{1,4,7,0};
        int[] array2 = new int[]{2,0};

        // when
        int[] result = joinArrays.join(array1, array2);

        // then
        int[] expected = new int[]{7,4,2,1,0};
        assertEquals(expected, result);

    }

}