package com.sample;

import java.util.Stack;

public class SampleClass {

    public static void main(String[] args) {
        int[] nums1 = {7, 1, 5, 3, 6, 4};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {7, 6, 4, 3, 1};
        buyNSellStock(nums1);
        buyNSellStock(nums2);
        buyNSellStock(nums3);
    }

    private static void buyNSellStock(int[] nums) {
        printArray(nums);

        printArray(nums);
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static class BackSpaceSpring {
        public static void main(String[] args) {
            System.out.println(backspaceCompare("ab#c", "ad#c"));
            System.out.println(backspaceCompare("ab##", "cd##"));
            System.out.println(backspaceCompare("a##c", "#a#c"));
            System.out.println(backspaceCompare("a#c", "b"));


        }

        public static boolean backspaceCompare(String S, String T) {
            Stack<Character> stack1 = new Stack<>();
            for (int i = S.length() - 1; i == 0; i--) {
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

            Stack<Character> stack2 = new Stack<>();
            for (int i = S.length() - 1; i == 0; i--) {
                if (T.charAt(i) != '#') {
                    stack2.push(S.charAt(i));
                } else if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
            String result2 = "";
            while (!stack2.isEmpty()) {
                result2 += stack2.pop();
            }
            System.out.printf("String 1 : %-6s       String 2 is: %-6s ", result1, result2);
            System.out.println();
            if (result1.equals(result2)) {
                return true;
            }
            return false;
        }
    }
}
