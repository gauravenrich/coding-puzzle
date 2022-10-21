package com.puzzle.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Leetcode 646. Maximum Length of Pair Chain
 * @author gsinha
 * 29 july 2022
 *
 * You are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti.
 * A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.
 * Input: pairs = [[1,2],[2,3],[3,4]]
 * Output: 2
 * Explanation: The longest chain is [1,2] -> [3,4].
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
