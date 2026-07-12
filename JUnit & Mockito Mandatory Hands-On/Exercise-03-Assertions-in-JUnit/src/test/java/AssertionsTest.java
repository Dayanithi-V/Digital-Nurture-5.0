import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void testAssertEquals() {
        assertEquals(5, 2 + 3);
    }

    @Test
    void testAssertNotEquals() {
        assertNotEquals(10, 2 + 3);
    }

    @Test
    void testAssertTrue() {
        assertTrue(5 > 2);
    }

    @Test
    void testAssertFalse() {
        assertFalse(2 > 5);
    }

    @Test
    void testAssertNull() {
        String str = null;
        assertNull(str);
    }

    @Test
    void testAssertNotNull() {
        String str = "JUnit";
        assertNotNull(str);
    }
}