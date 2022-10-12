package com.mustcode;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] interval={{1,2},{2,3},{1,3},{3,4}};
        System.out.println(eraseOverlapIntervals(interval));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(a -> a[1]));
        int ans = 0;
        int prev = intervals[0][1];

        for (int[] interval : intervals) {
            if (prev > interval[0]) { // overlap found
                ans += 1;
            } else {
                prev = interval[1];
            }

        }
        return --ans;

    }
}
