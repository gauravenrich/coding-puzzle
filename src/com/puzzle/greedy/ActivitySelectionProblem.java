package com.puzzle.greedy;

/**
 * Date 09/11/2021
 * @author gauravenrich
 * Consider the following 3 activities sorted by
 * by finish time display max number of meetings at a time
 */

public class ActivitySelectionProblem {
    public static void main(String[] args) {
        int n = 3;
        int[] start = {10, 12, 20};
        int[] end = {20, 25, 30};
        System.out.println("Total meetings that can be held " + totalMeetingCount(start, end, n));

    }

    private static int totalMeetingCount(int[] start, int[] end, int n) {
        int total = 0;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (start[j] >= end[i]) {
                if (j == 1) {
                    total = 1;
                }
                total++;
                i = j;
            }
        }
        return total;
    }
}
