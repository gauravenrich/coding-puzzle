package com.puzzle.array;

import java.util.Arrays;

/**
 *  Date 03/14/2020
 *  @author gauravenrich
 *  Minimize the height
 */
public class MinimizeTheHeight {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1,5,10,15};
        System.out.println("Result is " + getMinDiff(arr, arr.length, k));
    }

    static int getMinDiff(int[] arr, int n, int k) {
        if (n == 1)
            return 0;
        // Sort all elements
        Arrays.sort(arr);
        // Initialize result
        int ans = arr[n - 1] - arr[0];
        // Handle corner elements
        int small = arr[0] + k;
        int big = arr[n - 1] - k;
        int temp = 0;
        if (small > big) {
            temp = small;
            small = big;
            big = temp;
        }
        // Traverse middle elements
        for (int i = 1; i < n - 1; i++) {
            int subtract = arr[i] - k;
            int add = arr[i] + k;

           // if subtracting num doesn't cause
            if (subtract >= small || add <= big)
                continue;

            // Either subtraction causes a smaller
            // number or addition causes a greater
            // number. Update small or big using
            // greedy approach (If big - subtract
            // causes smaller diff, update small
            // Else update big)
            if (big - subtract <= add - small)
                small = subtract;
            else
                big = add;
        }

        return Math.min(ans, big - small);
    }
}