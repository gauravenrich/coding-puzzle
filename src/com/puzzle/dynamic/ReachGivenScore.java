package com.puzzle.dynamic;

import java.util.Arrays;

/**
 * @author gsinha
 * Reach Given Score
 * 17 july 2022
 */
public class ReachGivenScore {
    public static void main(String[] args) {
        ReachGivenScore reachGivenScore=new ReachGivenScore();
        System.out.println(reachGivenScore.count(20));
    }
    public long count(int n){
        long[] dp=new long[n+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        for(int i=3;i<=n;i++){
            dp[i]+=dp[i-3];
        }
        for(int i=5;i<=n;i++){
            dp[i]+=dp[i-5];
        }
        for(int i=10;i<=n;i++){
            dp[i]+=dp[i-10];
        }
        return dp[n];
    }
}
