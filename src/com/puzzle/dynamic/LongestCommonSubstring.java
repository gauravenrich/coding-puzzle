package com.puzzle.dynamic;

/**
 * Date 01/01/2021
 *
 * @author gauravenrich
 * Longest Common Substring
 */
public class LongestCommonSubstring {

    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GGTAYB";
        System.out.println("Length of longest common substring is " + lcs(X.toCharArray(), Y.toCharArray(), X.length(), Y.length()));
    }

    private static int lcs(char[] x, char[] y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        int result=Integer.MIN_VALUE;
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (x[i - 1] == y[j - 1]) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                        result=Integer.max(result,dp[i][j]);

                    } else {
                        dp[i][j] = 0;
                    }
                }
            }
        }
        return result;
    }
}
