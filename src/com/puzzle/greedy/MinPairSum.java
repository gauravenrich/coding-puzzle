package com.puzzle.greedy;

import java.util.Arrays;

/**
 * Minimum sum of absolute difference of pairs of two arrays
 * 6th July 2022
 */
public class MinPairSum {
    public static void main(String[] args) {
        // Both a[] and b[] must be of same size.
        long a[] = {4, 1, 8, 7};
        long b[] = {2, 3, 6, 5};
        int n = a.length;
        System.out.println(findMinSum(a, b, n));
    }

    private static long findMinSum(long[] a, long[] b, int n) {
        long result=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            result+=Math.abs(a[i]-b[i]);
        }
        return result;
    }

}
