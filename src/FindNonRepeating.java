import java.util.ArrayList;
import java.util.List;

public class FindNonRepeating {
    public static void main(String[] args) {
        int[] nums = {100, 99, 100, 98, 99};
        System.out.println(findNonRepeating(nums));
        System.out.println("USING XOR ");
        System.out.println(getSingleIntUsingXOR(nums));
    }

    private static int findNonRepeating(int[] nums) {
        printArray(nums);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            } else {
                list.remove(new Integer(nums[i]));
            }
        }
        return list.get(0);
    }
//{100, 99, 100, 98, 99};
    public static int getSingleIntUsingXOR(int[] arr) {
        int a = 0;
        for (Integer num : arr) {
            a = a ^ num;
        }
        return a;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}


