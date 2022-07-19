package com.puzzle.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * Greedy algorithm to find minimum number of coins
 * @author gsinha
 * 18 july 2022
 */
public class MinimumCoins {

    static int[] denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

    public static void main(String[] args) {
        List<Integer> result = minPartition(103);
        System.out.println(result);
    }

    static List<Integer> minPartition(int num) {
        // code here
        List<Integer> result = new ArrayList<>();
        for (int i = denominations.length - 1; i >= 0; i--) {
            while (denominations[i] <= num) {
                num = num - denominations[i];
                result.add(denominations[i]);
            }
        }
        return result;
    }
}
