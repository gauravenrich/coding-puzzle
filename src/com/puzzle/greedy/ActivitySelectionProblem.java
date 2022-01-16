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
        printMaxActivities(start,end,n);

    }

    private static int totalMeetingCount(int[] start, int[] end, int n) {
        int total = 1;
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
    public static void printMaxActivities(int s[], int f[], int n)
    {
        int i, j;

        System.out.print("Following activities are selected : ");

        // The first activity always gets selected
        i = 0;
        System.out.print(i+" ");

        // Consider rest of the activities
        for (j = 1; j < n; j++)
        {
            // If this activity has start time greater than or
            // equal to the finish time of previously selected
            // activity, then select it
            if (s[j] >= f[i])
            {
                System.out.print(j+" ");
                i = j;
            }
        }
    }
}
