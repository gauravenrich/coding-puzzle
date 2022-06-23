package com.puzzle.heap;

import java.util.PriorityQueue;

/**
 * Date 12/23/2020
 *
 * @author gauravenrich
 * K Largest Element
 */
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
        for (int j : a) {
            queue.add(j);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        Integer num;
        while ((num = queue.poll()) != null) {
            System.out.println(num);
        }

    }


}
