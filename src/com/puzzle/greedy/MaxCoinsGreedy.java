package com.puzzle.greedy;

import java.util.ArrayList;
import java.util.List;

public class MaxCoinsGreedy {
    public static void main(String[] args) {
        int[] deno = {1, 2, 5, 10, 20,
                50, 100, 500, 1000};
        System.out.println();
        System.out.println(findMinCoins(deno, deno.length, 1017));
    }

    static int findMinCoins(int[] coins, int size, int value) {
        int i;
        List<Integer> list = new ArrayList<>();
        for (i = size - 1; i >= 0; i--) {
            //take as much from coins[i]
            while (value >= coins[i]) {
                //after taking the coin, reduce the value.
                list.add(coins[i]);
                value -= coins[i];
            }
        }
        System.out.println("Coins are : ");
        list.forEach(a -> System.out.print(a + " "));
        System.out.println();
        return list.size();
    }
}
