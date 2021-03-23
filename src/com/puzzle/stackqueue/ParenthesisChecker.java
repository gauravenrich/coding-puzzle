package com.puzzle.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            //reading the string
            String st = sc.next();

            //calling ispar method of Paranthesis class
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if (ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");

        }
    }

    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        if (x.isEmpty() || x.isBlank())
            return true;
        stack.push(x.charAt(0));
        for (int i = 1; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                char p = stack.pop();
                if (c == ')') {
                    if (p != '(')
                        return false;
                }
                if (c == ']') {
                    if (p != '[')
                        return false;
                }
                if (c == '}') {
                    if (p != '{')
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }

}