package com.puzzle.graph;

import java.util.*;

public class CheapestFlight {
    public static void main(String[] args) {
        int n = 4;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0, dst = 3, k = 1;
        CheapestFlight cheapestFlight = new CheapestFlight();
        System.out.println(cheapestFlight.findCheapestPrice(n, flights, src, dst, k));
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] f : flights) {
            map.putIfAbsent(f[0], new ArrayList<>());
            map.get(f[0]).add(new int[]{f[1], f[2]});
        }
        Comparator<int[]> comparator = Comparator.comparing(a -> a[1]);
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(comparator);
        priorityQueue.offer(new int[]{src, 0, k});
        while (!priorityQueue.isEmpty()) {
            int[] c = priorityQueue.poll();
            int cur = c[0];
            int cost = c[1];
            int stop = c[2];
            if (cur == dst) {
                return cost;
            }
            if (stop >= 0) {
                if (!map.containsKey(cur)) {
                    continue;
                }
                for (int[] next : map.get(cur)) {
                    priorityQueue.add(new int[]{next[0], cost + next[1], stop - 1});
                }
            }
        }
        return -1;
    }
}
