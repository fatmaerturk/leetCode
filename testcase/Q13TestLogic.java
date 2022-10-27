package testcase;

import logic.Q13RomantoInteger;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Q13TestLogic {
    String input1 = "III"; int output1 = 3;
    String input2 = "LVIII"; int output2 = 58;
    String input3 = "MCMXCIV"; int output3 = 1994;
@Test
public void findRomanToInteger(){
    assertEquals(output1, Q13RomantoInteger.romanToInt(input1));
    assertEquals(output2, Q13RomantoInteger.romanToInt(input2));
    assertEquals(output3, Q13RomantoInteger.romanToInt(input3));
}

}
