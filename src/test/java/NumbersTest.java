import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }


    @Test
    void min() {
        Numbers number = new Numbers();
        int actual = number.min(2, 5, 6);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void max() {
        Numbers number = new Numbers();
        int actual = number.max(2, 5, 6);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(6,2);
        int expected = 8;
        assertEquals(expected,actual);
    }
}