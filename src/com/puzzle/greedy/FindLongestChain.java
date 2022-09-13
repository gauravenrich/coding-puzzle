package com.puzzle.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * FindLongestChain
 * @author gsinha
 * 29 july 2022
 */
public class FindLongestChain {
    public static void main(String[] args) {
        FindLongestChain longestChain = new FindLongestChain();
        int[][] pairs = {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90}};
        System.out.println(longestChain.findLongestChain(pairs));
    }

    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        int res = 0;
        int cur = Integer.MIN_VALUE;
        for (int[] pair : pairs) {
            if (cur < pair[0]) {
                cur = pair[1];
                res++;
            }
        }
        return res;
    }
}
