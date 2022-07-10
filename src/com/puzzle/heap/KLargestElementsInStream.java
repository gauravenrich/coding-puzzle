package com.puzzle.heap;

import java.util.PriorityQueue;

public class KLargestElementsInStream {
    public static void main(String[] args) {

        int n = 6;
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 4;

        int[] v = kthLargest(k, arr, n);
        for (int it : v)
            System.out.print(it + " ");
    }

    private static int[] kthLargest(int k, int[] arr, int n) {
        int[] ans = new int[n];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(arr[i]);
            } else {
                if (arr[i] > priorityQueue.peek()) {
                    priorityQueue.remove();
                    priorityQueue.add(arr[i]);
                }
            }
            if (priorityQueue.size() < k) {
                ans[i] = -1;
            } else {
                ans[i] = priorityQueue.peek();
            }
        }
        return ans;
    }
}
