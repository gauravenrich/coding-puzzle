package com.puzzle.dynamic;

/**
 * Date 12/30/2020
 *
 * @author gauravenrich
 * Subset count with given sum
 */


public class SubsetCountWithGivenSum {

    public static void main(String[] args) {
        int wt[] = new int[]{2, 3, 7, 8, 1000};
        int W = 10;
        System.out.println("Sum of " + W + " exits " + subSetSum(W, wt, wt.length) + " times");
    }

    public static int subSetSum(int sum, int wt[], int n) {
        int[][] t = new int[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (wt[i-1]<=j) {
                    t[i][j] = t[i-1][j-wt[i-1]]+t[i-1][j];
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }
        return t[n][sum];
    }

}
