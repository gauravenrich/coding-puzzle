package com.puzzle.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Date 03/27/2020
 * @author gauravenrich
 * Stack Using Queue
 */
public class StackUsingQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            Queues g = new Queues();

            int q = sc.nextInt();
            while (q > 0) {
                int QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    g.push(a);
                } else if (QueryType == 2)
                    System.out.print(g.pop() + " ");
                q--;
            }
            System.out.println();


            t--;
        }
    }
}

// } Driver Code Ends


class Queues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    //Function to push an element into stack using two queues.
    void push(int a) {
        // Your code here
        if (q1.isEmpty()) {
            q1.add(a);
        } else {
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(a);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

    }

    //Function to pop an element from stack using two queues.
    int pop() {
        // Your code here
        if (!q1.isEmpty()) {
            return q1.remove();
        } else {
            return -1;
        }
    }

}

