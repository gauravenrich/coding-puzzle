package com.mustcode;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
        System.out.println(isValid("{]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char cur = stack.pop();
                    if ((c == ')' && cur != '(') ||
                            (c == '}' && cur != '{') ||
                            (c == ']' && cur != '[')
                    )
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
