package com.puzzle.dynamic;

import java.util.Arrays;

public class MaxChainLength {
    public static void main(String[] args) {
        int[][] a={{1,2},{7,8},{4,5}};
        MaxChainLength maxChainLength=new MaxChainLength();
        System.out.println(maxChainLength.findLongestChain(a));
    }

    public int findLongestChain(int[][] pairs) {
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        Arrays.sort(pairs,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }else{
                return a[0]-b[0];
            }
        });
        int max = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        for (int j : dp) {
            max = Integer.max(max, j);
        }
        return max;
    }
}
