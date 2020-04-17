public class BackSpaceString1SC {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a##c", "#a#c"));
        System.out.println(backspaceCompare("a#c", "b"));

    }

    public static boolean backspaceCompare(String S, String T) {
        String ss = "";
        String tt = "";

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#') {
                ss += S.charAt(i);
            } else {
                if (S.charAt(i) == '#' && ss.length() == 1) {
                   ss = "";
                }else if(S.charAt(i) == '#' && ss.length() >= 1){
                    int len = ss.length();
                    ss = ss.substring(0, len-1);
                }
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) != '#') {
                tt += T.charAt(i);
            } else {
                if (T.charAt(i) == '#' && tt.length() == 1) {
                    tt = "";

                } else if(T.charAt(i) == '#' && tt.length() >= 1){
                    int len = tt.length();
                    tt = tt.substring(0, len-1);
                }
            }
        }
        System.out.println("SS is: " + ss);
        System.out.println("TT is: " + tt);
        if (ss.equals(tt)) {
            return true;
        }
        return false;
    }
}
