package com.puzzle.stackqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author gsinha
 * Queue reversal
 * 28 june 2022
 */
public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        QueueReversal queueReversal = new QueueReversal();
        Queue newQueue = queueReversal.rev(queue);
        System.out.println(newQueue);
        System.out.println(queue);
        queueReversal.reverse(queue);
        System.out.println(queue);
    }

    public Queue<Integer> rev(Queue<Integer> q) {
        //add code here.
        ArrayList<Integer> arrayList = new ArrayList<>(q);
        Collections.reverse(arrayList);
        Queue<Integer> queue = new LinkedList<>();
        for (Integer num : arrayList) {
            queue.add(num);
        }
        return queue;
    }

    public Queue<Integer> reverse(Queue<Integer> q) {
        func(q);
        return q;
    }

    private void func(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int x = q.peek();
        q.poll();
        func(q);
        q.add(x);
    }
}
