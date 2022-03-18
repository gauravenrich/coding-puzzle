package com.puzzle.stackqueue;

import java.util.Stack;

public class QueueUsingStack {

    public static void main(String[] args) {
        /* Create a queue with items 1 2 3*/
        StackQueue q = new StackQueue();
        q.Push(2);
        q.Push(3);
        q.Push(4);
        q.Push(5);

        /* Dequeue items */
        System.out.print(q.pop() + " ");
        System.out.print(q.pop() + " ");
        System.out.println(q.pop() + " ");
        System.out.println(q.pop() + " ");
        System.out.println(q.pop() + " ");

    }
}

// } Driver Code Ends


class StackQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x) {
        // Your code here
        s1.push(x);
    }


    //Function to pop an element from queue by using 2 stacks.
    int pop() {
        // Your code here
        if (!s2.isEmpty()) {
        }
        else {
            if (s1.isEmpty()) {
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}

