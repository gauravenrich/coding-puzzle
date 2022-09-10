package com.blind75.slidingwindow;

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,6,5,3,1,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int min=Integer.MAX_VALUE;
        for(int num:prices){
            min=Integer.min(min,num);
            if(num-min>maxProfit){
                maxProfit=num-min;
            }
        }
        return maxProfit;
    }
}
