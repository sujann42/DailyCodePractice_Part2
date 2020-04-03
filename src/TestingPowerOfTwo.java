public class TestingPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1 || n==2) {
            return true;
        }
        if(n % 2 != 0 || n == 0){
            return false;
        }

        while (n > 2) {  //10
            if (n % 2 == 1) {
                return false;
            }
            n /= 2;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(128));

    }
}
