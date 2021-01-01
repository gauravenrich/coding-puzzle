package com.puzzle.dynamic;

/**
 * Date 02/01/2021
 * @author gauravenrich
 * Shortest Common SuperSequence
 *
 * Len(X)+Len(Y)-lcs(x,y,m,n)
 */

public class ShortestCommonSuperSequence {

    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GGTAYB";
        System.out.println("Length of Shortest Common SuperSequence is " + shortestCommonSuperSeq(X.toCharArray(), Y.toCharArray(), X.length(), Y.length()));
    }

    private static int shortestCommonSuperSeq(char[] x, char[] y, int m, int n) {
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
        return (m + n) - dp[m][n];
    }
}
