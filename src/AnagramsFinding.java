import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//If the string contains the same spelling.
public class AnagramsFinding {
    public static void main(String[] args) {
        String[] names = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //printArray(names);
        System.out.println(groupAnagrams(names));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mapp = new HashMap<>();
        List<List<String>> values = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String wordTaken = strs[i];
            char[] ch = wordTaken.toCharArray();
            Arrays.sort(ch);
            String sortedElement = new String(ch);
            //System.out.println(sortedElement);

            if (mapp.containsKey(sortedElement)) {
                mapp.get(sortedElement).add(wordTaken);
            } else {
                List<String> words = new ArrayList<>();
                words.add(wordTaken);
                mapp.put(sortedElement, words);
            }
        }

        values.addAll(mapp.values());
        return values;
    }

    public static void printArray(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list + " ");
        }
        System.out.println();
    }
}
