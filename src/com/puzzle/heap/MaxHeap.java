package com.puzzle.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> queue = new PriorityQueue<>(10,Collections.reverseOrder());
        queue.offer(1);
        queue.offer(22);
        queue.offer(30);
        queue.offer(3);


        Integer val = null;
        while( (val = queue.poll()) != null) {
            System.out.println(val);
        }
    }
}
