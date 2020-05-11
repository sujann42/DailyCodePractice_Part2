public class FindMissingNumberInContArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println(findMissingNum(arr));
    }

    private static int findMissingNum(int[] arr) {
        int result = 0;
        int subtotal = 0;
        int totalNumCount = arr.length + 1;
        int totalSum = (totalNumCount * (totalNumCount + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            subtotal += arr[i];
        }
        result = totalSum - subtotal;
        return result;
    }

    private static int findMissingNumUsingXOR(int[] arr) {
        int result = 0;
        int subtotal = 0;
        int totalNumCount = arr.length + 1;
        int totalSum = (totalNumCount * (totalNumCount + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            subtotal += arr[i];
        }
        result = totalSum - subtotal;
        return result;
    }

}
