package com.puzzle.dynamic;

/**
 * Date 01/01/2021
 * @author gauravenrich
 * Coin change problem: Maximum number of ways
 */

public class CountChangeNumberOfWays {
    public static void main(String[] args) {
        int[] coin = {1, 2, 3};
        int n = coin.length;
        int sum = 4;
        System.out.println(countWays(coin, n, sum));
    }

    private static int countWays(int[] coin, int n, int sum) {

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
                if (j>=coin[i-1]) {
                    t[i][j] = t[i][j-coin[i-1]]+t[i-1][j];
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }
        return t[n][sum];
    }


}
