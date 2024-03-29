package com.puzzle.heap;

import java.util.PriorityQueue;

/**
 *  Date 12/23/2020
 *  @author gauravenrich
 *  Sort a K sorted Array
 */

public class SortKSortedArray {

    public static void main(String[] args){
        int k = 3;
        int[] arr = { 2, 6, 3, 12, 56, 8 };
        int n = arr.length;
        kSort(arr, n, k);
        System.out.println("Following is sorted array");
        printArray(arr);

    }

    private static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static void kSort(int[] arr, int n, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        int index=0;
        for(int i=0;i<k+1;i++){
            queue.add(arr[i]);
        }
        for(int i=k+1;i<n;i++){
            arr[index++]=queue.poll();
            queue.add(arr[i]);
        }
        for (Integer integer : queue) {
            arr[index++] = integer;
        }
    }
}
