package testcase;

import logic.Q9PalindromeNumber;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Q9TestLogic {
    int input1 = 121;
    boolean output1 = true;
    int input2 = -121;
    boolean output2 = false;
    int input3 = 10;
    boolean output3 = false;

    @Test
    public void findReverseInteger() {
        assertEquals(output1, Q9PalindromeNumber.isPalindrome(input1));
        assertEquals(output2, Q9PalindromeNumber.isPalindrome(input2));
        assertEquals(output3, Q9PalindromeNumber.isPalindrome(input3));
    }
}

