package com.puzzle.graph;

import java.util.Arrays;

public class NegativeWeightedCycle {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0, 1, -1},
                {1, 2, -2}, {2, 0, -3}};
        NegativeWeightedCycle negativeWeightedCycle=new NegativeWeightedCycle();
        boolean flag=negativeWeightedCycle.isNegativeWeightCycle(n,edges)==1?true:false;
        System.out.println("Graph contains Negative Weighted Cycle "+flag);
    }

    public int isNegativeWeightCycle(int n, int[][] edges) {
        //code here
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int[] edge : edges) {
                int src = edge[0];
                int dest = edge[1];
                int weight = edge[2];
                if (dist[src] != Integer.MAX_VALUE && dist[src] + weight < dist[dest]) {
                    dist[dest] = dist[src] + weight;
                }
            }
        }
        for (int[] edge : edges) {

            int src = edge[0];
            int dest = edge[1];
            int weight = edge[2];

            if (dist[src] != Integer.MAX_VALUE && dist[src] + weight < dist[dest]) {
                return 1;
            }
        }
        return 0;
    }
}
