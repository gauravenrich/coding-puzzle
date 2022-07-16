package com.puzzle.heap;

import java.util.*;

/**
 *  Date 12/23/2020
 *  @author gauravenrich
 *  Closest K Numbers
 */
public class ClosestKNumbers {

    public static void main(String[] args){
        int[] arr = {33, 34, 22, 30, 35, 39, 42,
                45, 48, 50, 53, 55, 56
        };
        int n = arr.length;
        int x = 35, k = 4;
        printKClosest(arr, x, k, n);
    }

    private static void printKClosest(int[] arr, int x, int k, int n) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(Math.abs(arr[i]-x),arr[i]);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> queue=new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getKey)
        );
       for(Map.Entry<Integer,Integer> entry: hm.entrySet() ){
           queue.offer(entry);
       }

        for(int i=0;i<k;i++){
            System.out.println(Objects.requireNonNull(queue.poll()).getValue());
        }

    }
}
