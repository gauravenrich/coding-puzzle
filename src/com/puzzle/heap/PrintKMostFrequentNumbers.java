package com.puzzle.heap;

/**
 *  Date 12/23/2020
 *  @author gauravenrich
 *  Print K Most Frequent Numbers
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class PrintKMostFrequentNumbers {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1};
        int n = arr.length;
        int k = 2;
        printNMostFrequentNumber(arr, n, k);
    }

    private static void printNMostFrequentNumber(int[] arr, int n, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i] + 1, 0));
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) ->
                a.getValue().equals(b.getValue()) ? Integer.compare(a.getKey(), b.getKey()) :
                        Integer.compare(a.getKey(), b.getKey())
        );

        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            queue.offer(entry);
        }
        for(int i=0;i<k;i++){
            System.out.println(Objects.requireNonNull(queue.poll()).getKey());
        }
    }
}
