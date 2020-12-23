package com.puzzle.heap;

/**
 *  Date 12/23/2020
 *  @author gauravenrich
 *  Kth Smallest Element
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public static void main(String[] args) {
        int[] a={7,3,9,10,2,33,17,4};
        System.out.println("Result is "+kSmallElement(a,4));
    }

    private static Integer kSmallElement(int[] a, int k) {
        if(a==null || k>a.length){
            return -99;
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            queue.add(a[i]);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }
}
