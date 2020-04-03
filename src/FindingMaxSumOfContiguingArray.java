
public class FindingMaxSumOfContiguingArray {
    public static int testMaxSumConiguousArray(int[] nums) {
        int result_max = nums[0];
        int temp_max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp_max = Math.max(nums[i], temp_max + nums[i]);
            if (temp_max > result_max) {
                result_max = temp_max;
            }
        }
        return result_max;

    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        int[] nums3 = {-2, -1};
        System.out.println(testMaxSumConiguousArray(nums));
        System.out.println(testMaxSumConiguousArray(nums2));
        System.out.println(testMaxSumConiguousArray(nums3));
    }
}
