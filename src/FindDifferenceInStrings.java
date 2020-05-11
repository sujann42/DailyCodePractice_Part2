import java.util.Stack;

public class FindDifferenceInStrings {

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        System.out.println(findTheDifference(s, t));
    }
    public static char findTheDifference(String s, String t) {
        Stack<Character> st = new Stack<>();
        int sl = s.length();
        int tl = t.length();
        String tobeInserted;
        String tobeCompared;
        char result = 0;
        if (sl > tl) {
            tobeInserted = s;
            tobeCompared = t;
        } else {
            tobeInserted = t;
            tobeCompared = s;
        }
        for (int i = 0; i < tobeInserted.length(); i++) {
            st.push(tobeInserted.charAt(i));
        }
        System.out.println(st.toString());
        for (int i = 0; i < tobeCompared.length(); i++) {
            if (tobeCompared.charAt(i) == st.peek()) {
                st.pop();
            }
        }
        return st.firstElement();
    }
}
