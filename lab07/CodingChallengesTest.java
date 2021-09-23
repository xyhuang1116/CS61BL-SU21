import org.junit.Test;
import static org.junit.Assert.*;

public class CodingChallengesTest {

    @Test
    public void missingNumberTest() {

        int[] values = new int[]{0,1,3};
        assertEquals(2, CodingChallenges.missingNumber(values));
    }

    @Test
    public void sumTo() {

        int[] values = new int[]{0,1,3};
        assertEquals(true, CodingChallenges.sumTo(values, 4));
        assertEquals(false, CodingChallenges.sumTo(values, 2));

    }
    @Test
    public void isPermutation() {

        String s1 = "ABCDA";
        String s2 = "AABCD";
        String s3 = "ABCD";
        String s4 = "ABCDE";
        String s5 = "ABCDEA";

        assertEquals(true, CodingChallenges.isPermutation(s1,s2));
        assertEquals(false, CodingChallenges.isPermutation(s1,s3));
        assertEquals(false, CodingChallenges.isPermutation(s1,s4));
        assertEquals(false, CodingChallenges.isPermutation(s1,s5));

    }
}