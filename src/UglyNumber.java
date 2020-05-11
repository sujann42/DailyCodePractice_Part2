import java.util.*;

public class UglyNumber {

    public static void main(String[] args) {
        int num = 27;
        System.out.println(isUgly(num));
    }

    public static boolean isUgly(int num) {
        while (num >= 2) {
            if (num >= 5 && num % 5 == 0) {
                num /= 5;
            }
            if (num >= 3 && num % 3 == 0) {
                num /= 3; //9
            }
            if(num >= 2 && num % 2 == 0) {
                num /= 2;
            }
            if((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0)){
                num = num;
            }
            else {
                break;
            }

        }
        if (num == 1 || num == 2 || num == 3 || num == 5) {

            return true;
        } else {
            return false;
        }
    }
}
