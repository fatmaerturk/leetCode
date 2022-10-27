package testcase;

import logic.Q8StringtoInteger;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Q8TestLogic {
    String input1 = "42"; int output1 = 42;
    String input2 = "   -42"; int output2 = -42;
    String input3 = "4193 with words"; int output3 = 4193;

    @Test
    public void findReverseInteger() {
        assertEquals(output1, Q8StringtoInteger.myAtoi(input1));
        assertEquals(output2, Q8StringtoInteger.myAtoi(input2));
        assertEquals(output3, Q8StringtoInteger.myAtoi(input3));
    }
}

