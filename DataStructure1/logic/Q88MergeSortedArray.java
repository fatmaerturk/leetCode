package DataStructure1.logic;

import java.sql.Array;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Q88MergeSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length != (m + n)) return null;
        for (int j = 0; j < n; j++) {
            nums1[j + m] = nums2[j];
        }
        nums2 = new int[n];
        for (int j = 0; j < n; j++) {
            nums2[j] = nums1[j + m];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
