package com.puzzle.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Given an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline.
 * It is also given that every job takes a single unit of time, so the minimum
 * possible deadline for any job is 1. Maximize the total profit if only one job can be scheduled at a time.
 */
class Job {
    int id;
    int profit;
    int deadline;

    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
}

public class JobSchedulingProblem {
    public static void main(String[] args) {
        List<Job> jobList = new ArrayList<>();
        int n = 4;
        jobList.add(new Job(1, 4, 20));
        jobList.add(new Job(2, 1, 10));
        jobList.add(new Job(3, 1, 40));
        jobList.add(new Job(4, 1, 30));
        int[] result = jobScheduling(jobList, n);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] jobScheduling(List<Job> jobList, int n) {
        int[] result = new int[2];
        int jobCount = 0;
        int profit = 0;
        Comparator<Job> jobComparator = Comparator.comparing(t -> t.profit);
        jobList.sort(jobComparator.reversed());
        boolean[] slot = new boolean[n];
        for (Job t : jobList) {
            for (int i = Math.min(n - 1, t.deadline-1); i >= 0; i--) {
                if (!slot[i]) {
                    slot[i]=true;
                    profit += t.profit;
                    jobCount++;
                    break;
                }
            }
        }
        result[0]=profit;
        result[1]=jobCount;
        return result;
    }
}
