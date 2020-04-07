import java.util.HashMap;
import java.util.Map;

public class MoveZeroesToTheEnd {
    public static void main(String[] args) {
        System.out.println(findFirstSingleChar("pppsspplovveleettccoddey"));

    }

    public static int findFirstSingleChar(String str) {
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), i);
            } else {
                map.put(str.charAt(i), -1);
            }
        }

        System.out.println(map);
        int index = Integer.MAX_VALUE;
        for (Character cc : map.keySet()) {
            if (map.get(cc) > -1 && map.get(cc) < index) {
                index = map.get(cc);
            }
        }
        if (index == Integer.MAX_VALUE) {
            return -1;
        } else {
            return index;
        }

    }
}
