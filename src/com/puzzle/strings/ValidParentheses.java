package com.puzzle.strings;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Input: s = "()[]{}"
 * Output: true
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValidPalindrome(s));
    }

    private static boolean isValidPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char cur = stack.pop();
                    if ((c == ')' && cur != '(') ||
                            (c == '}' && cur != '{') ||
                            (c == ']' && cur != '[')) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
