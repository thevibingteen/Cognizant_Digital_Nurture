import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        assertEquals(5, 2 + 3);

        assertTrue(20 > 10);

        assertFalse(15 < 8);

        String name = null;
        assertNull(name);

        Object student = new Object();
        assertNotNull(student);
    }

}