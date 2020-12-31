package com.puzzle.dynamic;

import java.util.Arrays;

/**
 * Date 12/31/2020
 *
 * @author gauravenrich
 * Subset count with given diff
 * Logic :
 * s1+s2=sum
 * s1-s2=diff
 * 2*s1=sum+diff
 * s1=(sum+diff)/2
 * Find total count of subset with sum (sum+diff)/2
 */
public class NumberOfSubSetWithGivenDiff {

    public static void main(String[] args) {
        int arr[] = {1,1,2,3};
        int diff = 1;
        System.out.println("Number of subset with diff " + diff + " is "
                + findSetWithGivenDiff(arr, diff));
    }

    private static int findSetWithGivenDiff(int[] arr, int diff) {
        if (arr == null)
            return 0;
        int sum = Arrays.stream(arr).sum();
        int res = (sum + diff) / 2;
        int n = arr.length;
        int[][] t = new int[n + 1][res + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < res + 1; j++) {
                if (i == 0)
                    t[i][j] = 0;
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < res + 1; j++) {
                if (j == 0)
                    t[i][j] = 1;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < res + 1; j++) {
                if (j >= arr[i - 1]) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][res];
    }
}

