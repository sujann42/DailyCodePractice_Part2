public class FindingFactorialTraillingZeroes {
    public static int trailingZeroes(int n) {

        int zeroes = 0;
        if (n >= 5) {
            zeroes = n / 5 + trailingZeroes(n / 5);
        } else {
            zeroes = 0;
        }
        return zeroes;
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println("Trailing Zeroes for "+n+" :");
        System.out.println(trailingZeroes(n));


    }
}
