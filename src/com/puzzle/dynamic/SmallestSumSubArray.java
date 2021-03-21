package com.puzzle.dynamic;

/**
 * Date 03/21/2020
 * @author gauravenrich
 * Smallest Sum SubArray
 */
public class SmallestSumSubArray {
    public static void main(String[] args) {
        int arr[] = {3, -4, 2, -3, -1, 7, -5};
        int n = arr.length;

        System.out.print("Smallest sum: "
                + smallestSumSubarr(arr, n));
    }

    private static int smallestSumSubarr(int[] arr, int n) {
        int minEndingHere = Integer.MAX_VALUE;
        int minSoFar = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (minEndingHere > 0) {
                minEndingHere = arr[i];
            } else {
                minEndingHere = minEndingHere + arr[i];
            }
            minSoFar = Integer.min(minEndingHere, minSoFar);

        }
        return minSoFar;
    }
}
