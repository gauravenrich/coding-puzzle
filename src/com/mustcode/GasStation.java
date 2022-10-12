package com.mustcode;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int deficit=0;
        int balance=0;
        for (int i=0;i<gas.length;i++){
            balance+=gas[i]-cost[i];
            if(balance<0){
                deficit+=balance;
                start=i+1;
                balance=0;
            }
        }
        if(deficit+balance>=0){
            return start;
        }
        return -1;
    }
}
