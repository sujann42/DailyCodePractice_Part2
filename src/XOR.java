
public class XOR {
    public static int getSingleIntUsingXOR(int[] arr) {
        int a = 0;
        for (Integer num : arr) {
            a = a ^ num;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 5, 5, 6, 4};
        System.out.println(getSingleIntUsingXOR(arr));
    }
}
