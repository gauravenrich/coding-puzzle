package com.puzzle.dynamic;
/**
 * Date 01/01/2021
 * @author gauravenrich
 * Print Longest Common SubString
 */
public class PrintLongestCommonSubstring {
    public static void main(String[] args) {
        String X = "AGGTAY";
        String Y = "GGTAYB";
        System.out.println("Length of longest common substring is " + printLcs(X.toCharArray(), Y.toCharArray(), X.length(), Y.length()));
    }

    private static String printLcs(char[] x, char[] y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        int len = 0;
        int resX = 0;
        int resY = 0;
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (x[i - 1] == y[j - 1]) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                        int oldLen = len;
                        len = Integer.max(dp[i][j], len);
                        if (len > oldLen) {
                            resX = i;
                            resY = j;
                        }
                    } else {
                        dp[i][j] = 0;
                    }
                }
            }
        }
        char[] res = new char[len + 1];
        res[len] = '\u0000';
        int i = resX;
        int j = resY;
        while (i > 0 && j > 0 && len > 0) {
            res[len - 1] = x[i - 1];
            len--;
            i--;
            j--;

        }
        return new String(res);
    }
}
