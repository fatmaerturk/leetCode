package testcase;
import logic.Q26RemoveDuplicatesfromSortedArrayMethod1;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Q26TestLogicMethod2 {
    int[] nums1 = {1,1,2}; int output1=2;
    int[] nums2 = {0,0,1,1,1,2,2,3,3,4}; int output2=5;

    @Test
    public void findReverseInteger() {
        assertEquals(output1, Q26RemoveDuplicatesfromSortedArrayMethod2.removeDuplicates(nums1));
        assertEquals(output2, Q26RemoveDuplicatesfromSortedArrayMethod2.removeDuplicates(nums2));
    }
}

