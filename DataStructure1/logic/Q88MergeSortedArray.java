package DataStructure1.logic;

import java.sql.Array;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Q88MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1_1 = {1,2,3,0,0,0}, nums1_2 = {2,5,6}; int[] output1={1,2,2,3,5,6}; int m1 = 3, n1 = 3;

      merge(nums1_1, m1,nums1_2, n1);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length!=(m+n)) return;
        for (int j=0; j<n; j++){
            nums1[j+m]=nums2[j];
        }
        nums2=new int[n];
        for (int j=0; j<n; j++){
            nums2[j]=nums1[j+m];
        }
        Arrays.sort(nums1);

        System.out.println("nums1:"+Arrays.toString(nums1));
        System.out.println("nums2:"+Arrays.toString(nums2));

        //return result;
    }
}
