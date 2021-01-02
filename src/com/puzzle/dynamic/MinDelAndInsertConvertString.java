package com.puzzle.dynamic;
/**
 * Date 02/01/2021
 * @author gauravenrich
 * Minimum number of deletions and insertions to transform one string into another
 *
 * Total op= (length of str1 -length of lcs) +
 *           (length of str2 -length of lcs)

 */
public class MinDelAndInsertConvertString {

    public static void main(String[] args) {
        String str1 = "heap";
        String str2 = "pea";
        System.out.println("Minimum insert and delete operations needed to convert " + str1 + " into " + str2 +
                " is " +
                printMinDelAndInsert(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length()));

    }

    private static int printMinDelAndInsert(char[] x, char[] y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (x[i - 1] == y[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        return (m - dp[m][n])  // total deletions
                +
                (n-dp[m][n]); //total insertions
    }

}
