package com.puzzle.dynamic;

/**
 * Date 01/01/2021
 * @author gauravenrich
 * Print Longest Common Subsequence
 */
public class PrintLongestCommonSubsequence {
    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        System.out.println("Longest common subsequence is ");
        printLcs(X.toCharArray(), Y.toCharArray(), X.length(), Y.length());
    }

    private static void printLcs(char[] x, char[] y, int m, int n) {
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
        int len = dp[m][n];
        char[] res = new char[len + 1];
        res[len] = '\u0000'; // Set the terminating character
        int i = m;
        int j = n;
        while (i > 0 && j > 0) {
            if (x[i - 1] == y[j - 1]) {
                res[len-1] = x[i - 1];
                i--;
                j--;
                len--;
            } else if (dp[i - 1][i] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        System.out.println(new String(res));
    }

}
