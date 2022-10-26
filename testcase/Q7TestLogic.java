package testcase;
import org.junit.Test;
import logic.Q7ReverseInteger;
import static junit.framework.Assert.assertEquals;
public class Q7TestLogic {
    int input1 = 123; int output1 = 321;
    int input2 = -123; int output2 = -321;
    int input3 = 120; int output3 = 21;

    @Test
    public void findReverseInteger() {
        assertEquals(output1, Q7ReverseInteger.reverse(input1));
        assertEquals(output2, Q7ReverseInteger.reverse(input2));
        assertEquals(output3, Q7ReverseInteger.reverse(input3));
    }
}

