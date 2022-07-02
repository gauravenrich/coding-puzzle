package com.puzzle.heap;

import java.util.Arrays;

/**
 * Date 02/07/2022
 *
 * @author gauravenrich
 * Given an array of n integers and a positive number k. We are allowed to take any k integers from the given array.
 * The task is to find the minimum possible value of the difference between maximum and minimum of K numbers.
 */
public class KElementsWithMinDifference {
    public static void main(String[] args) {
        int[] arr = {10, 100, 300, 200, 1000, 20, 30};
        int n = arr.length;
        int k = 3;

        System.out.println(minDiff(arr, n, k));
    }

    private static int minDiff(int[] arr, int n, int k) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i <= n - k; i++) {
            result = Integer.min(result, arr[i + k - 1] - arr[i]);
        }
        return result;
    }
}
