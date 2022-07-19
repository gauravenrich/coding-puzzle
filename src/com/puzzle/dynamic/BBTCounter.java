package com.puzzle.dynamic;

/**
 * bbt counter
 * Given a height h, count the maximum number of balanced binary trees possible with height h. Print the result modulo 109 + 7.
 * @author gsinha
 * 20 july 2022
 */
public class BBTCounter {
    static int NUM = 1000000007;

    public static void main(String[] args) {
        System.out.println(countBT(3));
    }

    static long countBT(int h) {
        long dp0 = 1;
        long dp1 = 1;
        long dp2 = 3;
        if (h < 2) {
            return 1;
        }
        for (int i = 2; i <= h; i++) {
            dp2 = (dp1 * ((2 * dp0)%NUM + dp1)%NUM)%NUM;
            dp0=dp1;
            dp1=dp2;
        }
        return dp2;
    }
}
