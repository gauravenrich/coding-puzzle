package com.puzzle.heap;

import java.util.*;

/**
 * Date 12/23/2020
 *
 * @author gauravenrich
 * Print K Most Frequent Numbers
 */

public class TopKFrequentElement {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1, 1, 1, 1};
        int n = arr.length;
        int k = 2;
        printNMostFrequentNumber(arr, n, k);
        topKFrequent(arr,k);
    }

    private static void printNMostFrequentNumber(int[] arr, int n, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) ->
                a.getValue().equals(b.getValue()) ? Integer.compare(a.getKey(), b.getKey()) :
                        Integer.compare(b.getValue(), a.getValue())
        );

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            queue.offer(entry);
        }
        for (int i = 0; i < k; i++) {
            System.out.println(Objects.requireNonNull(queue.poll()).getKey());
        }
    }

    public static void topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int val: nums){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        PriorityQueue<Pair> minHeap=new PriorityQueue<>(Comparator.comparingInt(o -> o.value));
        for(Map.Entry<Integer, Integer>entry: map.entrySet()){
            minHeap.add(new Pair(entry.getKey(), entry.getValue()));
            if(minHeap.size()>k)
                minHeap.poll();
        }
        for(int i=0;i<k;i++){
            Pair p=minHeap.poll();
            assert p != null;
            System.out.println(p.key);
        }
    }
}
