import java.util.Arrays;
import java.util.Collections;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 0) {
            return 0;
        }
        if (stones.length == 1) {
            return stones[0];
        }
        int result = 0;
        Arrays.sort(stones);

        int last = stones.length - 1;
        int secLast = stones.length - 2;
        System.out.println(last +" "+secLast);
        while (stones[secLast] != 0) {
            stones[last] = stones[last] - stones[secLast];
            stones[secLast] = 0;
            Arrays.sort(stones);
        }

        result= stones[last];
        return result;
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        printArray(stones);
        System.out.println(lastStoneWeight(stones));
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
