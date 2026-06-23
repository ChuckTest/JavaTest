package hw01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void testAdd() {
        assertEquals(5, Task1.add(2, 3));
    }
}