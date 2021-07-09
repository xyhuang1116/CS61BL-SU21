import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModNCounterTest {

    @Test
    public void testConstructor() {
        int myN = 2;
        ModNCounter c = new ModNCounter(myN);
        assertEquals(0 , c.value());
        assertEquals(2 , c.getMyN());
    }

    @Test
    public void testIncrement() throws Exception {
        ModNCounter c = new ModNCounter(2);
        c.increment();
        assertEquals(1, c.value());
        c.increment();
        assertEquals(0, c.value());
    }

    @Test
    public void testReset() throws Exception {
        ModNCounter c = new ModNCounter(2);
        c.increment();
        c.reset();
        assertEquals(0, c.value());
    }
}