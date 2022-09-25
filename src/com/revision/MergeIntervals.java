package com.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 * 56. Merge Intervals
 */
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,9},{7,10},{15,18}};
        int[][] result=merge(intervals);
        for (int[] ints : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] merge(int[][] intervals) {
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
