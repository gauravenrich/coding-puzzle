package com.puzzle.sortandsearch;

import java.util.Arrays;
import java.util.Collections;

/**
 * Permute two arrays such that sum of every pair is greater or equal to K
 *
 * @author gsinha
 * 16th july 2022
 */
public class PairSumGreaterThanK {
    public static void main(String[] args) {
        Integer[] a = {2, 1, 3};
        int[] b = {7, 8, 9};
        int k = 10;
        int n = a.length;

        if (isPossible(a, b, n, k))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    private static boolean isPossible(Integer[] a, int[] b, int n, int k) {
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }
        return true;
    }
}
