package com.puzzle.stackqueue;

import java.util.Stack;

/**
 * @author gsinha
 * Next Greater Element
 * 21 july 2022
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {11, 13, 21, 3};
        printNGE(arr);
    }

    private static void printNGE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "-->" + nge[i]);
        }
    }

    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        Stack<Long> st = new Stack<>();
        long[] res = new long[n];
        st.push(arr[n - 1]);
        res[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            long kk = (st.isEmpty()) ? ((long) -1) : st.peek();
            res[n - (n - i)] = kk;
            st.push(arr[i]);
        }
        return res;
    }
}
