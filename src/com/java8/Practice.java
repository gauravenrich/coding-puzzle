package com.java8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Job1 {
    int id;
    int profit;
    int deadline;

    public Job1(int id, int deadline, int profit) {
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
}

public class Practice {
    public static void main(String[] args) {
        List<Job1> jobList = new ArrayList<>();
        int n = 4;
        jobList.add(new Job1(1, 4, 20));
        jobList.add(new Job1(2, 1, 10));
        jobList.add(new Job1(3, 1, 40));
        jobList.add(new Job1(4, 1, 30));
        int[] result = jobScheduling(jobList, n);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] jobScheduling(List<Job1> jobList, int n) {
        int[] result=new int[2];
        int totalJob=0;
        int totalProfit=0;
        Comparator<Job1> comparator=Comparator.comparing(j->j.profit);
        jobList.sort(comparator.reversed());
        boolean[] slots=new boolean[n];
        for(Job1 job:jobList){
            for(int i=Integer.min(n-1, job.deadline-1);i>=0;i--){
                if(!slots[i]){
                    slots[i]=true;
                    totalJob++;
                    totalProfit+=job.profit;
                    break;
                }
            }
        }
        result[0]=totalProfit;
        result[1]=totalJob;
        return result;
    }


}
