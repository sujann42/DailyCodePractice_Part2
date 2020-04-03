public class RobbingHouseProblem {
    public static void main(String[] args) {
        int[] money = {2, 17, 9, 3, 15};
        int[] aa = {3, 1};
        int[] bb = {1, 7, 1};
        int[] cc = {2, 1, 1, 2};
        System.out.println(rob(money));
        System.out.println(rob(aa));
        System.out.println("Max: " + rob(bb));
        System.out.println("Max: " + rob(cc));
    }

    public static int rob(int[] nums) {
        int sizeOfArray = nums.length;

        if (sizeOfArray == 0) {
            return 0;
        } else if (sizeOfArray == 1) {
            return nums[0];
        }
        int[] newArr = new int[sizeOfArray];
        newArr[0] = nums[0];
        newArr[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < sizeOfArray; i++) {
            newArr[i] = Math.max((newArr[i - 2] + nums[i]), newArr[i - 1]);
        }

        return newArr[sizeOfArray-1];
    }
}
