package com.puzzle.dynamic;
/**
 * Date 02/01/2021
 * @author gauravenrich
 * Print Shortest Common SuperSequence
 * Len(X)+Len(Y)-lcs(x,y,m,n)
 * if equal add char
 * if not then add the bigger
 * in the end append rest chars
 */

public class PrintShortestCommonSuperSequence {
    public static void main(String[] args) {
        String X = "pear";
        String Y = "peach";
        System.out.println("Shortest Common SuperSequence is "+
        displayShortestCommonSuperSeq(X.toCharArray(), Y.toCharArray(), X.length(), Y.length()));
    }

    private static String  displayShortestCommonSuperSeq(char[] x, char[] y, int m, int n) {
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
        int len = (m + n) - dp[m][n];
        char[] res = new char[len + 1];
        res[len] = '\u0000';
        int i = m;
        int j = n;
        len--;
        while (i > 0 && j > 0) {
            if (x[i - 1] == y[j - 1]) {
                res[len] = x[i - 1];
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                res[len] = x[i - 1];
                i--;
            } else {
                res[len] = y[j - 1];
                j--;
            }
            len--;
        }
        while (i > 0) {
            res[len] = x[i - 1];
            i--;
        }
        while (i > 0) {
            res[len] = y[j - 1];
            j--;
        }
        return new String(res);
    }
}
