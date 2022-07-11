package com.puzzle.stackqueue;

import java.util.Stack;

/**
 * CelebrityProblem
 * 11 july 2022
 */
public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] a = {{0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0}};
        CelebrityProblem celebrityProblem = new CelebrityProblem();
        System.out.println(celebrityProblem.celebrity(a, a.length));
    }

    public int celebrity(int[][] a, int n) {
        Stack<Integer> st = new Stack<>();
        int candidate;
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int one = st.pop();
            int two = st.pop();
            if (knows(a, one, two)) {
                st.push(two);
            } else {
                st.push(one);
            }
        }
        if (st.isEmpty()) {
            candidate = -1;
        } else {
            candidate = st.pop();
        }
        return candidate;
    }

    private boolean knows(int[][] a, int one, int two) {
        return a[one][two] == 1;
    }
}
