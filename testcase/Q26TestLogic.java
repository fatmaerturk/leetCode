package testcase;
import logic.Q26RemoveDuplicatesfromSortedArrayMethod1;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Q26TestLogic {
    int[] nums1 = {1,1,2}; int output1=2;
    int[] nums2 = {1,1}; int output2=1;

    @Test
    public void findReverseInteger() {
        assertEquals(output1, Q26RemoveDuplicatesfromSortedArrayMethod1.removeDuplicates(nums1));
        assertEquals(output2, Q26RemoveDuplicatesfromSortedArrayMethod1.removeDuplicates(nums2));
    }
}

