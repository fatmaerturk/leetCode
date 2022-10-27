package DataStructure1.testcases;

import DataStructure1.logic.Q217ContainsDuplicate;
import logic.Q1TwoSum;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Q217TestLogic {
    int[] nums1 = {1,2,3,1}; boolean output1=true;
    int[] nums2 = {1,2,3,4}; boolean output2=false;
    int[] nums3 = {1,1,1,3,3,4,3,2,4,2}; boolean output3=true;
    @Test
    public void findContainsDuplicate(){
        assertEquals(output1, Q217ContainsDuplicate.containsDuplicate(nums1));
        assertEquals(output2, Q217ContainsDuplicate.containsDuplicate(nums2));
        assertEquals(output3, Q217ContainsDuplicate.containsDuplicate(nums3));
    }
}
