package com.puzzle.dynamic;

/**
 * Date 12/31/2020
 *
 * @author gauravenrich
 * Unbounded Knapsack problem
 */
public class UnboundedKnapsackProblem {

    public static void main(String[] args) {
        int W = 8;
        int[] val = {10, 40, 50, 70};
        int[] wt = {1, 2, 4, 5};
        System.out.println(knapsackUnbounded(W, wt, val, val.length));
    }

    private static int knapsackUnbounded(int w, int[] wt, int[] val, int n) {
        int[][] t = new int[n + 1][w + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (j >= wt[i - 1]) {
                    t[i][j] = Integer.max((val[i - 1] + t[i][j - wt[i - 1]]), t[i - 1][j]);
                } else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][w];
    }
}
