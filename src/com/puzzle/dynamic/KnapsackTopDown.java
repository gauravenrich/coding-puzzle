package com.puzzle.dynamic;

/**
 * Date 12/20/2020
 *
 * @author gauravenrich
 * 0/1 Knapsack problem
 */

public class KnapsackTopDown {
    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;
        System.out.println(knapsack(W, wt, val, n));
    }

    private static int knapsack(int w, int[] wt, int[] val, int n) {
        int[][] t = new int[n + 1][w + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (i == 0 || w == 0) {
                    t[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = Integer.max(val[i - 1] + t[i - 1][j - wt[i - 1]],
                            t[i - 1][j]
                    );
                } else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][w];
    }


}
