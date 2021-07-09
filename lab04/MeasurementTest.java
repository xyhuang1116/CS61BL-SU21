import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeasurementTest {

    @Test
    void getFeet() {
        Measurement m0 = new Measurement();
        assertEquals(0, m0.getFeet());

        Measurement m1 = new Measurement(1);
        assertEquals(1, m1.getFeet());

        Measurement m2 = new Measurement(1, 18);
        assertEquals(2, m2.getFeet());
    }

    @Test
    void getInches() {
        Measurement m0 = new Measurement();
        assertEquals(0, m0.getInches());

        Measurement m1 = new Measurement(1);
        assertEquals(0, m1.getInches());

        Measurement m2 = new Measurement(1, 18);
        assertEquals(6, m2.getInches());
    }

    @Test
    void plus() {
        Measurement m1 = new Measurement(1);
        Measurement m2 = new Measurement(2, 10);
        Measurement m3 = new Measurement(3, 7);

        assertEquals(3, m2.plus(m1).getFeet());
        assertEquals(10, m2.plus(m1).getInches());

        assertEquals(6, m3.plus(m2).getFeet());
        assertEquals(5, m3.plus(m2).getInches());
    }

    @Test
    void minus() {
        Measurement m1 = new Measurement(1);
        Measurement m2 = new Measurement(2, 10);
        Measurement m3 = new Measurement(3, 7);

        assertEquals(1, m2.minus(m1).getFeet());
        assertEquals(10, m2.minus(m1).getInches());

        assertEquals(0, m3.minus(m2).getFeet());
        assertEquals(9, m3.minus(m2).getInches());
    }

    @Test
    void multiple() {
        Measurement m = new Measurement(1, 7);

        assertEquals(1, m.multiple(1).getFeet());
        assertEquals(7, m.multiple(1).getInches());

        assertEquals(4, m.multiple(3).getFeet());
        assertEquals(9, m.multiple(3).getInches());

    }

    @Test
    void testToString() {
        Measurement m1 = new Measurement(1);
        Measurement m2 = new Measurement(2, 10);

        assertEquals("1'0\"", m1.toString());
        assertEquals("2'10\"", m2.toString());
    }
}