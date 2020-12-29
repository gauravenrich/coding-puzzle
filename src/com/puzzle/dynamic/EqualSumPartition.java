package com.puzzle.dynamic;

/**
 * Date 12/30/2020
 *
 * @author gauravenrich
 * Equal sum partition problem
 */


public class EqualSumPartition {
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        System.out.println("Equal sum partition exits " + equalSumPartition(arr));
    }

    private static boolean equalSumPartition(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        if(sum%2!=0){
            return false;
        }
        return subSetSum(a, sum / 2, a.length);
    }

    private static boolean subSetSum(int[] a, int w, int n) {
        boolean[][] t = new boolean[n + 1][w + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (i == 0)
                    t[i][j] = false;
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (j == 0)
                    t[i][j] = true;
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (j >= a[i - 1])
                    t[i][j] = t[i - 1][j - a[i - 1]] || t[i - 1][j];
                else
                    t[i][j] = t[i - 1][j];
            }
        }

        return t[n][w];
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

