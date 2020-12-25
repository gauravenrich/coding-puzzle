package com.puzzle.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 8, 2, 6, 8, 8,0};
        int n = arr.length;
        System.out.println(Integer.compare(1,3));
        frequencySort(arr, n);

    }

    private static void frequencySort(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

       PriorityQueue<Map.Entry<Integer, Integer> > queue =
                new PriorityQueue<>(
                        (a, b) -> a.getValue().equals(b.getValue())?
                                Integer.compare(b.getKey(),a.getKey()):
                                Integer.compare(a.getValue(),b.getValue())

                );

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
        }
        for (Map.Entry<Integer, Integer> entry : queue) {
            int frequency = entry.getValue();
            int num = entry.getKey();
            for (int i = 0; i < frequency; i++) {
                System.out.print(num + " ");
            }
        }

    }
}
