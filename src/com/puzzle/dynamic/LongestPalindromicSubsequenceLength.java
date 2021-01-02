package com.puzzle.dynamic;

/**
 * Date 02/01/2021
 * @author gauravenrich
 * Length of Longest Palindromic Subsequence
 */
public class LongestPalindromicSubsequenceLength {
    public static void main(String[] args) {
        String input = "agbcba";
        System.out.println("Length of longest palindromic subsequence is " + lps(input.toCharArray()));
    }
    private static int lps(char[] x) {
        String str2 = new StringBuilder(new String(x)).reverse().toString();
        char[] y = str2.toCharArray();
        int m = x.length;
        int n = y.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (x[i - 1] == y[j - 1]) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        return dp[m][n];
    }
}
