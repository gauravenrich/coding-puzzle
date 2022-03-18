package com.puzzle.greedy;

import java.util.Arrays;

public class DiscountCandies {
    public static void main(String[] args) {
        int[] cost={6,5,7,9,2,2};
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
