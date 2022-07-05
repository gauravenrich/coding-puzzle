package com.puzzle.dynamic;

/**
 * Leetcode 198. House Robber
 * 5th july 2022
 */
public class HouseRobber {
    public static void main(String[] args) {
        int[] num={2,7,9,3,1};
        HouseRobber houseRobber=new HouseRobber();
        System.out.println(houseRobber.rob(num));
    }

    public int rob(int[] num) {
        int[] dp=new int[num.length];
        if(num.length==1){
            return num[0];
        }
        dp[0]=num[0];
        dp[1]=num[1];
        for(int i=2;i<num.length;i++){
            dp[i]=Integer.max(dp[i-1],num[i]+dp[i-2]);
        }
        return dp[num.length-1];
    }
}
