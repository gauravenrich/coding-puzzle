package com.puzzle.dynamic;

/**
 * Date 12/30/2020
 *
 * @author gauravenrich
 * Subset sum problem
 */

public class SubSetSumProblem {

    public static void main(String[] args) {
        int wt[] = new int[]{2, 3, 4, 8, 10};
        int W = 5;
        System.out.println(wt.length);
        System.out.println("Sum of " + W + " exits " + subSetSum(W, wt, wt.length));
    }

    public static boolean subSetSum(int sum, int wt[], int n) {

        boolean[][] t = new boolean[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = false;
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {

            for (int j = 0; j < sum + 1; j++) {
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {

            for (int j = 1; j < sum + 1; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - wt[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }

            }
        }
        return t[n][sum];
    }

}
