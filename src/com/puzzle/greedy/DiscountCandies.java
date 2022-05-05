package com.puzzle.greedy;

import java.util.Arrays;

/**
 * Leetcode 2144. Minimum Cost of Buying Candies With Discount
 * https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
 * Input: cost = [1,2,3]
 * Output: 5
 * Explanation: We buy the candies with costs 2 and 3, and take the candy with cost 1 for free.
 */
public class DiscountCandies {
    public static void main(String[] args) {
        int[] cost={1,2,3};
        System.out.println(minimumCost(cost));
    }

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int curCost=0;
        int counter=0;
        int total=0;
        for(int i=cost.length-1;i>=0;i--){
            curCost+=cost[i];
            counter++;
            if(counter==2){
                i--;
                counter=0;
                total+=curCost;
                curCost=0;
                continue;
            }
        }
        return total;
    }
}
