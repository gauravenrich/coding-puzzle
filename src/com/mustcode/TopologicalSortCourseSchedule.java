package com.mustcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSortCourseSchedule {

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0},{0,1}};
        System.out.println(canFinish(numCourses, prerequisites));
    }

    public static boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for (int[] ints : pre) {
            adj.get(ints[1]).add(ints[0]);
        }
        int[] inDegree=new int[n];
        for(int i=0;i<n;i++){
            for(int num:adj.get(i)){
                inDegree[num]++;
            }
        }
        Queue<Integer> queue=new LinkedList<>();
        for (int i=0;i<n;i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }
        int count=0;
        while (!queue.isEmpty() && count<n){
            int cur=queue.poll();
            for(int num:adj.get(cur)){
                inDegree[num]--;
                if(inDegree[num]==0){
                    queue.add(num);
                }
            }
            count++;
        }
        return count==n;
    }
}
