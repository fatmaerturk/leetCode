package testcase;
import logic.Q12IntegertoRoman;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Q12TestLogic {
    int num1 = 3; String output1="III";
    int num2 = 58; String output2="LVIII";
    int num3 = 1994; String output3="MCMXCIV";
    @Test
    public void findIntegertoRoman() {
        assertEquals(output1, Q12IntegertoRoman.intToRoman(num1));
        assertEquals(output2, Q12IntegertoRoman.intToRoman(num2));
        assertEquals(output3, Q12IntegertoRoman.intToRoman(num3));
    }
}

