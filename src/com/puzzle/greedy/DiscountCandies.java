package com.puzzle.greedy;

import java.util.Arrays;

/**
 * Leetcode 2144. Minimum Cost of Buying Candies With Discount
 * A shop is selling candies at a discount. For every two candies sold, the shop gives a third candy for free.
 * <a href="https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/">...</a>
 * Input: cost = [1,2,3]
 * Output: 5
 * Explanation: We buy the candies with costs 2 and 3, and take the candy with cost 1 for free.
 * 9 + 7 + 5 + 2 = 23.
 */
public class DiscountCandies {
    public static void main(String[] args) {
        int[] cost = {6, 5, 7, 9, 2, 2};
        System.out.println(minimumCost(cost));
    }

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int curCost = 0;
        int counter = 0;
        int total = 0;
        int n = cost.length;
        if (n == 1)
            total = cost[0];
        else if (n == 2) {
            total = cost[0] + cost[1];
        } else if (n > 2) {
            for (int i = n - 1; i >= 0; i--) {
                curCost += cost[i];
                counter++;
                if (counter == 2) {
                    i--;
                    counter = 0;
                    total += curCost;
                    curCost = 0;
                }
            }
        }
        if (counter == 1) {
            total += curCost;
        }
        return total;
    }
}
