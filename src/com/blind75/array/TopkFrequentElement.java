package com.blind75.array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Pair {
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class TopkFrequentElement {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] res = topKFrequent(nums, k);
        System.out.println(res[0] + " " + res[1]);

    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(Comparator.comparing(o -> o.value));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.add(new Pair(entry.getKey(), entry.getValue()));
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        for (int i = 0; i < k; i++) {
            Pair p = minHeap.poll();
            if (p != null) {
                res[i] = p.key;
            }
        }
        return res;
    }
}
