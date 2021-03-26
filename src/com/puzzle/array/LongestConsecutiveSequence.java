package com.puzzle.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Date 03/27/2020
 * @author gauravenrich
 * Longest Consecutive Sequence
 */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = {1, 9, 3, 10, 4, 20, 2,5};
        int n = arr.length;
        System.out.println(
                "Length of the Longest consecutive subsequence is "
                        + findLongestConseqSubseq(arr, n));
    }

    private static int findLongestConseqSubseq(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i] - 1)) {
                int j = arr[i];
                while (set.contains(j)) {
                    j++;
                }
                if (max < j - arr[i]) {
                    max = j - arr[i];
                }
            }
        }
        return max;
    }
}
