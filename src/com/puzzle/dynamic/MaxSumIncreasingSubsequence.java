package com.puzzle.dynamic;

/**
 * Date 03/26/2021
 * @author gauravenrich
 * Max Sum Increasing Subsequence
 */
public class MaxSumIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {1, 101, 2, 3, 100};
        System.out.println("Max Sum Increasing Subsequence is " + msis(arr, arr.length));
    }

    private static int msis(int[] arr, int length) {
        int[] dp = new int[length];
        for (int i = 0; i < length; i++) {
            dp[i] = arr[i];
        }
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[j] + arr[i] > dp[i]) {
                    dp[i] = dp[j] + arr[i];
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            max = Integer.max(max, dp[i]);
        }
        return max;
    }
}
