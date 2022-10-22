import java.util.Arrays;

public class Q1TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; int target = 9;
        int[] nums2 = {3,3}; int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++) {
                if(nums[i]+nums[j]==target && i!=j) {
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
