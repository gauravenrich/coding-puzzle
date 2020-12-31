package com.puzzle.dynamic;
/**
 * Date 01/01/2021
 * @author gauravenrich
 * Coin change problem: Minimum Number of coins for given sum
 */
public class CoinChangeMinCoin {
    public static void main(String[] args) {
        int[] coins = {9, 6, 5, 1,11};
        int m = coins.length;
        int V = 11;
        System.out.println("Minimum coins required is "
                + minCoins(coins, m, V));
    }

    private static int minCoins(int[] coins, int n, int v) {
        int[][] t = new int[n + 1][v + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < v + 1; j++) {
                if (i == 0)
                    t[i][j] = Integer.MAX_VALUE - 1;
                if (j == 0)
                    t[i][j] = 0;
                if (i == 1) {
                    if (j % coins[i - 1] == 0)
                        t[i][j] = j / coins[i - 1];
                    else
                        t[i][j] = Integer.MAX_VALUE - 1;
                }
            }
        }
        t[0][0] = 0;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < v + 1; j++) {
                if (j >= coins[i - 1]) {
                    t[i][j] = Integer.min(t[i][j - coins[i - 1]] + 1, t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][v];
    }
}
