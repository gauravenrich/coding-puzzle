package com.puzzle.dynamic;

/**
 * Date 03/02/2020
 *
 * @author gauravenrich
 * Length of Longest Repeating Subsequence
 */
public class LongestRepeatingSubsequence {
    public static void main(String[] args) {
        String input = "AABEBCDD";
        System.out.println("Length of longest repeating subsequence is " + longestRepSubsequence(input.toCharArray()));
    }

    private static int longestRepSubsequence(char[] x) {
        int m = x.length;
        int[][] dp = new int[m + 1][m + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (x[i - 1] == x[j - 1] && i != j) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        return dp[m][m];
    }
}
