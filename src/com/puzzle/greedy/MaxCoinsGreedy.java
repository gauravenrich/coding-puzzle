package com.puzzle.greedy;

import java.util.Arrays;

public class MaxCoinsGreedy {
    public static void main(String[] args) {
        int n = 93;
        int[] deno = {1, 2, 5, 10, 20,
                50, 100, 500, 1000};
        System.out.print(
                "Following is minimal number "
                        + "of change for " + n + ": ");
        System.out.println( findMinCoins(deno,deno.length,93));
    }

    private static void findMin(int[] deno, int n) {
        Arrays.sort(deno);
        int coins = 0, i;

        for (i = 7; i >= 1; i--) {
            coins = coins + (n / deno[i]);
            n = n % deno[i];
        }
        System.out.println(coins);

    }

   static int findMinCoins(int[] coins, int size, int value) {
        int i, count = 0;
        for (i = 0; i < size; i++) {
            //take as much from coins[i]
            while (value >= coins[i]) {
                //after taking the coin, reduce the value.
                value -= coins[i];
          //      ans[count] = coins[i];
                count++;
            }
            if (value == 0)
                break;
        }
        return count;
    }
}
