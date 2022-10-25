package logic;

import java.util.Arrays;

public class Q4MedianofTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        double result = 0;
        int nums3[] = new int[nums1.length + nums2.length];
        while (i < nums1.length) {
            nums3[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            nums3[k++] = nums2[j++];
        }
        Arrays.sort(nums3);
        if (nums3.length % 2 == 1) {
            result = (double) nums3[nums3.length / 2];

        } else {
            result = (double) (nums3[nums3.length / 2 - 1] + nums3[nums3.length / 2]) / 2;
        }
        return result;
    }
}
