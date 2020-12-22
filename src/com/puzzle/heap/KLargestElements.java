package com.puzzle.heap;

/**
 *  Date 12/23/2020
 *  @author gauravenrich
 *  K Largest Element
 */

import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] a = {7, 3, 9, 10, 2, 33, 17, 40};
        kLargestElement(a, 3);
    }

    private static void kLargestElement(int[] a, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        if (a == null || k > a.length) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            queue.add(a[i]);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        Integer num = null;
        while ((num = queue.poll()) != null) {
            System.out.println(num);
        }

    }

}
