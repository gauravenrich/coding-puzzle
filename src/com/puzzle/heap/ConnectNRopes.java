package com.puzzle.heap;

import java.util.PriorityQueue;

/**
 * Given are N ropes of different lengths, the task is to connect these ropes into one rope with minimum cost,
 * such that the cost to connect two ropes is equal to the sum of their lengths.
 *
 * Examples:
 *
 * Input: arr[] = {4,3,2,6} , N = 4
 * Output: 29
 * Explanation:
 *
 * First, connect ropes of lengths 2 and 3. Now we have three ropes of lengths 4, 6, and 5.
 * Now connect ropes of lengths 4 and 5. Now we have two ropes of lengths 6 and 9.
 * Finally connect the two ropes and all ropes have connected.
 */
public class ConnectNRopes {
    public static void main(String[] args) {
        int[] len = { 4, 3, 2, 6 };
        System.out.println("Total cost for connecting"
                + " ropes is " + minCost(len));
    }

    private static int minCost(int[] len) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:len){
            pq.add(num);
        }
        int total=0;
        while(pq.size()>1){
            int first= pq.poll();
            int second= pq.poll();
            total+=first+second;
            pq.add(first+second);
        }
        return total;
    }
}
