package testcase;
import logic.*;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Q1TestLogic {
    int[] nums1 = {2,7,11,15}; int target1 = 9; int output1[]={0,1};
    int[] nums2 = {3,2,4}; int target2 = 6; int output2[]={1,2};
    int[] nums3 = {3,3}; int target3 = 6; int output3[]={0,1};

    @Test
    public void findtwoSum(){
        assertEquals(output1, Q1TwoSum.twoSum(nums1, target1));
        assertEquals(output2, Q1TwoSum.twoSum(nums2, target2));
        assertEquals(output3, Q1TwoSum.twoSum(nums3, target3));
    }
}

