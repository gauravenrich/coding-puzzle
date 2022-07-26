package com.puzzle.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// An Interval
class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals {
    // Function that takes a set of intervals, merges
    // overlapping intervals and prints the result
    public static void mergeIntervals(Interval[] arr) {
        // Sort Intervals in increasing order of
        // start time
        Arrays.sort(arr, Comparator.comparingInt(i -> i.start));

        int index = 0; // Stores index of last element
        // in output array (modified arr[])

        // Traverse all input Intervals
        for (int i = 1; i < arr.length; i++) {
            // If this is not first Interval and overlaps
            // with the previous one
            if (arr[index].end >= arr[i].start) {
                // Merge previous and current Intervals
                arr[index].end = Math.max(arr[index].end, arr[i].end);
                arr[index].start = Math.min(arr[index].start, arr[i].start);
            } else {
                index++;
                arr[index] = arr[i];
            }
        }

        // Now arr[0..index-1] stores the merged Intervals
        System.out.print("The Merged Intervals are: ");
        for (int i = 0; i <= index; i++) {
            System.out.print("[" + arr[i].start + ","
                    + arr[i].end + "]");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Interval[] arr = new Interval[5];
        arr[0] = new Interval(6, 8);
        arr[1] = new Interval(1, 9);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(4, 7);
        arr[4] = new Interval(4, 19);
        mergeIntervals(arr);
    }

    public int[][] merge(int[][] intervals) {
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int l=intervals[0][0];
        int r=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(r>=intervals[i][0]){
                r=Integer.max(r,intervals[i][1]);
            }else{
                res.add(new int[]{l,r});
                l=intervals[i][0];
                r=intervals[i][1];
            }
        }
        res.add(new int[]{l,r});
        return res.toArray(new int[res.size()][]);
    }
}
