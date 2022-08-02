package com.puzzle.array;

/**
 * Find if there is a pair with a given sum in the rotated sorted Array
 * @author gsinha
 * 2nd aug 2022
 */
public class GivenSumPair {
    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int X = 16;
        int N = arr.length;

        if (pairInSortedRotated(arr, N, X))
            System.out.print("true");
        else
            System.out.print("false");
    }

    private static boolean pairInSortedRotated(int[] arr, int n, int x) {
        // Find the pivot element
        int i;
        for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1])
                break;

        // l is now index of the smallest element
        int l = (i + 1) % n;

        // r is now index of the largest element
        int r = i;

        // Keep moving either l or r till they meet
        while (l != r) {
            // If we find a pair with sum x, we
            // return true
            if (arr[l] + arr[r] == x)
                return true;

            // If current pair sum is less, move
            // to the higher sum
            if (arr[l] + arr[r] < x)
                l = (l + 1) % n;

                // Move to the lower sum side
            else
                r = (n + r - 1) % n;
        }
        return false;
    }
}
