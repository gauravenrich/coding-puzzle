package com.puzzle.greedy;

import java.util.Arrays;

/**
 * Leetcode 134
 * https://leetcode.com/problems/gas-station/
 *
 */
public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int current=0;
        int totalGas= Arrays.stream(gas).sum();
        int totalCost=Arrays.stream(cost).sum();
        if(totalGas<totalCost){
            return -1;
        }
        for(int i=0;i<gas.length;i++){
            current=current+gas[i]-cost[i];
            if(current<0){
                start=i+1;
                current=0;
            }
        }
        return start;
    }
}
