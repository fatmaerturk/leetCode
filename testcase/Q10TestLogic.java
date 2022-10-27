package testcase;

import logic.Q10RegularExpressionMatching;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class Q10TestLogic {
    String input1_1 = "aa"; String input1_2 = "a"; boolean output1 = false;
    String input2_1 = "aa"; String input2_2 = "a*"; boolean output2 = true;
    String input3_1 = "aa"; String input3_2 = "a*"; boolean output3 = true;

    @Test
    public void findReverseInteger() {
        assertEquals(output1, Q10RegularExpressionMatching.isMatch(input1_1, input1_2));
        assertEquals(output2, Q10RegularExpressionMatching.isMatch(input2_1, input2_2));
        assertEquals(output3, Q10RegularExpressionMatching.isMatch(input3_1, input3_2));
    }
}

