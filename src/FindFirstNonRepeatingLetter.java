import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingLetter {
    public static void main(String[] args) {
        String ss = "aaabbccdddeefffgggh";
        System.out.println(getNonRepLet(ss));
    }

    public static int getNonRepLet(String s) {
        int index = 0;
        Map<Character, Integer> mapp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            if (!mapp.containsKey(s.charAt(i))) {
                mapp.put(s.charAt(i), i);
            } else {
                mapp.put(s.charAt(i), -1);
            }
        }
        System.out.println(mapp);
        index = Integer.MAX_VALUE;
        for (Character ch : mapp.keySet()) {
            if ((mapp.get(ch) > -1) && (mapp.get(ch) < index)) {
                index = mapp.get(ch);
            }
        }
        if (index == Integer.MAX_VALUE) {
            index = -1;
        } else {
            index = index;
        }
        return index;
    }
}
