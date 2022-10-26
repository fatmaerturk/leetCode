package testcase;
import static org.junit.Assert.*;
import logic.Q5LongestPalindromicSubstring;
import org.junit.Test;
public class Q5TestLogic {
    String input1= "babad"; String output1= "bab";
    String input2= "cbbd"; String output2= "bb";
    @Test
    public void findMedianSortedArrays(){
        assertEquals(output1,Q5LongestPalindromicSubstring.longestPalindrome(input1));
        assertEquals(output2,Q5LongestPalindromicSubstring.longestPalindrome(input2));
    }
}

