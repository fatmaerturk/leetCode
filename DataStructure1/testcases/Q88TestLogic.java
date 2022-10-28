package DataStructure1.testcases;
import DataStructure1.logic.Q88MergeSortedArray;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Q88TestLogic {
    int[] nums1_1 = {1,2,3,0,0,0}, nums1_2 = {2,5,6}; int[] output1={1,2,2,3,5,6}; int m1 = 3, n1 = 3;
    int[] nums2_1 = {1}, nums2_2 = {}, output2={1}; int m2 = 1, n2 = 0;
    int[] nums3_1 = {0}, nums3_2 = {1}, output3={1}; int m3 = 0, n3 = 1;
    @Test
    public void findMergeSortedArray(){
        //assertEquals(output1, Q88MergeSortedArray.merge(nums1_1, m1, nums1_2, n1));
//        assertEquals(output2, Q88MergeSortedArray.merge(nums2_1, m2, nums2_2, n2));
//        assertEquals(output3, Q88MergeSortedArray.merge(nums3_1, m3, nums3_2, n3));
    }
}
