package com.puzzle.greedy;

import java.util.PriorityQueue;

/**
 * 6th July 2022
 * Input: [5, 3, 0, 7, 4]
 * Output: 82
 * The minimum sum is formed by numbers
 * 35 and 047
 */
public class FormTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {6, 8, 4, 5, 2, 3};
        System.out.println("The required sum is "+ solve(arr));
    }

    private static long solve(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int num:arr){
            pq.add(num);
        }
        while (!pq.isEmpty()){
            sb1.append(pq.remove());
            if(!pq.isEmpty()){
                sb2.append(pq.remove());
            }
        }
        return Long.parseLong(sb1.toString())+Long.parseLong(sb2.toString());
    }
}
