import java.util.Stack;

public class BackSpaceInString {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "cd##"));
        System.out.println(backspaceCompare("a##c", "#a#c"));
        System.out.println(backspaceCompare("b", "a#c"));
    }

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#') {
                stack1.push(S.charAt(i));
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }
        String result1 = "";
        while (!stack1.isEmpty()) {
            result1 += stack1.pop();
        }
        System.out.println("Result 1 is: " + result1);

        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) != '#') {
                stack2.push(T.charAt(i));
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }
        String result2 = "";
        while (!stack2.isEmpty()) {
            result2 += stack2.pop();
        }
        System.out.printf("Result 2 is:" + result2);
        System.out.println();
        if (result1.equals(result2)) {
            return true;
        }
        return false;
    }
}
