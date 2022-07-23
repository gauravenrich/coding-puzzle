package com.puzzle.dynamic;

/**
 * MaxIncreasing Sum Subsequence
 * @author gsinha
 * 23 jun 2022
 */
public class MaxIncreasingSumSubsequence {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 101, 2, 3, 100};
        MaxIncreasingSumSubsequence sumSubsequence = new MaxIncreasingSumSubsequence();
        System.out.println(sumSubsequence.maxSumIS(arr, n));
    }

    public int maxSumIS(int[] arr, int n) {
        //code here.
        int ans = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            int p = 0;
            for (int j = 0; j <= i; j++) {
                if (arr[i] > arr[j]) {
                    p = Integer.max(p, dp[j]);
                }
                dp[i] = p + arr[i];
                ans = Integer.max(ans, dp[i]);
            }
        }
        return ans;
    }
}
