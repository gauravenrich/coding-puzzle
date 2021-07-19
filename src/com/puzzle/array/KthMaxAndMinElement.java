package com.puzzle.array;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Date 07/20/2020
 *
 * @author gauravenrich
 * Kth Smallest / Largest Element
 */
public class KthMaxAndMinElement {
    public static void main(String[] args) {
        int[] a = {7, 3, 9, 10, 2, 33, 17, 40};
        kLargestElement(a, 2);
        kSmallElement(a, 3);
    }

    private static void kLargestElement(int[] a, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < a.length; i++) {
            queue.add(a[i]);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        System.out.println(queue.poll());
    }

    private static void kSmallElement(int[] a, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < a.length; i++) {
            queue.add(a[i]);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        System.out.println(queue.poll());
    }
}
