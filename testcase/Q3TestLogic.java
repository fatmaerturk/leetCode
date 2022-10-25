package testcase;
import logic.*;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Q3TestLogic {
    String input1 = "abcabcbb"; int output1= 3;
    String input2 = "bbbbb"; int output2= 1;
    String input3 = "pwwkew"; int output3= 3;
    @Test
    public void findLongestSubstringWithoutRepeatingCharacters(){
        assertEquals(output1, Q3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input1));
        assertEquals(output2, Q3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input2));
        assertEquals(output3, Q3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input3));
    }
}

