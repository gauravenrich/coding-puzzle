package com.puzzle.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Date 12/23/2020
 *
 * @author gauravenrich
 * Kth Smallest Element
 */
public class KthSmallestElement {

    public static void main(String[] args) {
        int[] a = {7, 3, 9, 10, 2, 33, 17, 4};
        System.out.println("Result is " + kSmallElement(a, 4));
    }

    private static Integer kSmallElement(int[] a, int k) {
        if (a == null || k > a.length) {
            return -99;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int j : a) {
            queue.add(j);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
