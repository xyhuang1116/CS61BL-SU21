import org.junit.Test;
import static org.junit.Assert.*;

public class CodingChallengesTest {

    @Test
    public void missingNumberTest() {

        int[] values = new int[]{0,1,3};
        assertEquals(2, CodingChallenges.missingNumber(values));
    }

//    @Test
//    void sumTo() {
//    }
//
//    @Test
//    void isPermutation() {
//    }
}