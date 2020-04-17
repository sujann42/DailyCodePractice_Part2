import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int nums[] = {9, 8, 4, 2, 6, 5, 7, 0, 1};
        //0 1 2 3 4 5 6 7 8 9
        System.out.println(findMissingNum(nums));

    }

    public static int findMissingNum(int[] nums) {
        int sum = 0;
        int result = 0;
        int totalSum = 0;
        Arrays.sort(nums);
        int n = nums[nums.length - 1];

        totalSum = (n) * ((n) + 1) / 2;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        result = totalSum - sum;

        return result;
    }
}
