package com.puzzle.greedy;

/**
 *  Date 09/12/2021
 *  @author gauravenrich
 *  Minimum Platform Needed
 */
public class MinimumPlatformNeeded {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;
        System.out.println("Minimum Number of Platforms Required = "
                + findPlatform(arr, dep, n));
    }

    private static int findPlatform(int[] arr, int[] dep, int n) {
        int pf = 1;
        int result = 1;
        int i = 1;
        int j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                pf++;
                i++;
            } else if (arr[i] > dep[j]) {
                pf--;
                j++;
            }
            if (pf > result) {
                result = pf;
            }
        }
        return result;
    }
}
