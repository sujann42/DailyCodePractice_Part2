
public class BuySellStockOnly1TransAllowed {

    public static void main(String[] args) {
        int[] nums1 = {7, 1, 5, 3, 6, 4};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {7, 6, 4, 3, 1};
        System.out.println("First Stocks: ");
        System.out.println(buyNSellStock(nums1));
        System.out.println("Second Stocks: ");
        System.out.println(buyNSellStock(nums2));
        System.out.println("Third Stocks: ");
        System.out.println(buyNSellStock(nums3));
    }

    private static int buyNSellStock(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }

        int profit = 0;
        int init = Integer.MAX_VALUE;
        //{7, 1, 5, 3, 6, 4}
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < init) {
                init = prices[i]; //7
            }
            if (prices[i] > init) { //7>7
                profit = Math.max(profit, prices[i] - init);
            }

        }
        return profit;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

}
