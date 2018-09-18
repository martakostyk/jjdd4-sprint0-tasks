package martak.jjdd4sprint0.task14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommonDivisorsTest {

    private CommonDivisors commonDivisors;

    @BeforeEach
    void setUp() {
        commonDivisors = new CommonDivisors();
    }

    @Test
    public void commonDivisorsTest() {

        assertAll(
                () -> assertEquals(Arrays.asList(1,2,4), commonDivisors.getCommonDivisors(20, 16)),
                () -> assertEquals(Arrays.asList(1,2), commonDivisors.getCommonDivisors(22,48)),
                () -> assertEquals(Arrays.asList(1,7), commonDivisors.getCommonDivisors(21,49))

        );
    }

}