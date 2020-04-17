import java.util.HashMap;
import java.util.Map;

public class ContiguousArrayMaxLen {
    public static int findMaxLength(int[] nums) {
        int maxLen = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += nums[i];
            }
            if (map.containsKey(sum)) {
                maxLen = Math.max(sum, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a1 = {0,1,1,0,1,1,1,0};
        int[] a2 = {1, 0, 1, 1, 1, 0, 0};
        int[] a3 = {1, 1, 1, 1};
        System.out.println(findMaxLength(a1));
        //System.out.println(findMaxLength(a2));
        //System.out.println(findMaxLength(a3));
    }
}
