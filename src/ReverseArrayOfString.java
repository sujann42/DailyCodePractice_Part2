public class ReverseArrayOfString {


    public static void main(String[] args) {
        char[] arrayofString = {'h', 'e', 'l', 'l', 'o'};
        reverstStringArray(arrayofString);
    }

    public static void reverstStringArray(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - 1 - i] = temp;
        }

        for (char aa : s
        ) {
            System.out.println(aa + " ");

        }
    }
}
