package logic;
public class Q26RemoveDuplicatesfromSortedArrayMethod1 {
    public static int removeDuplicates(int[] nums) {
        {
            int n = nums.length;
            if (n == 0 || n == 1) {
                return n;
            }
            // we are creating another array for only storing the unique elements
            int[] temp = new int[n];
            int j = 0;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    temp[j++] = nums[i];
                }
            }
            temp[j++] = nums[n - 1];
            // and we are changing the original array
            for (int i = 0; i < j; i++) {
                nums[i] = temp[i];
            }
            return j;
        }
    }

}
