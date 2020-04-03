public class AddDigitsTillOne {
    public static void main(String[] args) {
        System.out.println(addDigits(59));
        //System.out.println(getSum(11));

    }

    public static int addDigits(int num) {
        if(num <= 9){
            return num;
        }
        int sum = 0;
        int myNum = num;
        while (myNum > 9) {
            int ttl = 0;
            while (myNum != 0) {
                ttl += myNum % 10;
                myNum /= 10;
            }
            myNum = ttl;
            sum = ttl;
        }
        return sum;
    }
}



   /* public static int addDigits(int num) {
        int sum = 0;
        int myNum = num;
        while (myNum > 9) {
            sum = getSum(myNum);
            myNum = sum;
        }
        return sum;
    }

    private static int getSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
*/
