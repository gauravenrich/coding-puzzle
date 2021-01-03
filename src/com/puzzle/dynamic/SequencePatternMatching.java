package com.puzzle.dynamic;

/**
 * Date 03/02/2020
 * @author gauravenrich
 * Sequence Pattern Matching
 * If seq pattern exists means length of lcs(a,b) should be same as min(len(a),len(b))
 */
public class SequencePatternMatching {
    public static void main(String[] args){
        String a="AXY";
        String b="ADXCPY";
        System.out.println("Sequence pattern exists "+seqPatternMatch(a.toCharArray(),b.toCharArray(),a.length(),b.length()));
    }

    private static boolean seqPatternMatch(char[] x, char[] y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (x[i - 1] == y[j - 1] ) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        return Integer.min(m,n)==dp[m][n];
    }
}
