package com.puzzle.greedy;

import java.util.Arrays;

/**
 * Minimum cost for acquiring all coins with k extra coins allowed with every coin
 * pick 1 coin and 3 extra is allowed so total 4 , now pick another one and whole arrays is covered since 4 more is covered
 * to minimize those we take min values coin
 *
 * @author gsinha
 * 7 aug 2022
 */
public class MinCoinCost {
    public static void main(String[] args) {
        int[] coin = {8, 5, 3, 10,
                2, 1, 15, 25};
        int n = coin.length;
        int k = 3;

        System.out.print(minCost(coin, n, k));
    }

    private static int minCost(int[] coin, int n, int k) {

        // sort the coins value
        Arrays.sort(coin);

        // calculate no. of
        // coins needed
        int coins_needed = (int) Math.ceil(1.0 *
                n / (k + 1));

        // calculate sum of
        // all selected coins
        int ans = 0;

        for (int i = 0; i <= coins_needed - 1;
             i++)
            ans += coin[i];

        return ans;
    }
}
