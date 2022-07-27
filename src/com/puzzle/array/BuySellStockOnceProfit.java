package com.puzzle.array;

/**
 * @author gsinha
 * Buy Sell Stock Once Profit
 * 02/08/21
 */
public class BuySellStockOnceProfit {

    public static int maxProfitOneTransaction(int[] prices) {
        int n = prices.length;
        int cost;
        int maxCost = 0;
        if (n == 0) {
            return 0;
        }
        int min_price = prices[0];
        for (int price : prices) {
            // now compare first element with all the element of array and find the minimum element

            min_price = Math.min(min_price, price);

            // since min_price is the smallest element of the array so subtract with every element of the array and return the maxCost
            cost = price - min_price;

            maxCost = Math.max(maxCost, cost);
        }
        return maxCost;
    }

    // Driver Code
    public static void main(String[] args) {
        // stock prices on consecutive days
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.print(maxProfitOneTransaction(prices));
    }
}
