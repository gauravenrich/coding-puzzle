package com.puzzle.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        ReverseKElementQueue reverseKElementQueue=new ReverseKElementQueue();
        reverseKElementQueue.modifyQueue(queue,3);
        System.out.println(queue);

    }
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> st=new Stack<>();
        int[] a=new int[q.size()-k];
        for(int i=0;i<k;i++){
            st.push(q.poll());
        }
        for(int i=0;i<a.length;i++){
            a[i]=q.poll();
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        for(int i=0;i<a.length;i++){
            q.offer(a[i]);
        }
        return q;
    }
}
