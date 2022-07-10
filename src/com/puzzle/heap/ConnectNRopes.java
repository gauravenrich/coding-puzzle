package com.puzzle.heap;

import java.util.PriorityQueue;

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
