package com.java8;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args){
        int[] price = {10, 22, 5, 75, 65, 80};
        int n = price.length;
        System.out.println("Maximum Profit = " + maxProfit(price, n));
    }

    private static int maxProfit(int[] price, int n) {
        int[] profit=new int[n];
        Arrays.fill(profit,0);
        int maxPrice=price[n-1];
        for(int i=n-2;i>=0;i--){
          if(price[i]>maxPrice){
              maxPrice=price[i];
          }
          profit[i]=Integer.max(maxPrice-price[i],profit[i+1]);

        }
        System.out.println(Arrays.toString(profit));
        int minPrice=price[0];
        for(int i=1;i<n;i++){
            if(price[i]<minPrice){
                minPrice=price[i];
            }
            profit[i]=Integer.max(profit[i-1],price[i]-minPrice+profit[i]);
        }
        return profit[n-1];
    }

}
