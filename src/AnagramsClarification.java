import java.util.*;

public class AnagramsClarification {
    public static void main(String[] args) {

        String[] names = {"eat", "tea", "tan", "ate", "nat", "bat", "fat", "atf"};
        printArray(names);
        System.out.println(groupAnagrams(names));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> return_List = new ArrayList<>();
        Map<String, List<String>> storingMap = new HashMap();
        for (String word : strs) {
            char[] chArr = word.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);
            if (storingMap.containsKey(key)) {
                storingMap.get(key).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                storingMap.put(key, list);
            }
        }
        return_List.addAll(storingMap.values());
        return return_List;
    }

    public static void printArray(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " ");
        }
        System.out.println();
    }
}
