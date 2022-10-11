package com.mustcode;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue;

    public StackUsingQueue(){
        queue=new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for(int i=0;i<queue.size()-1;i++){
            queue.add(queue.remove());
        }
        System.out.println(x+" pushed to stack");
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public int pop() {
        if(queue.isEmpty()){
            return -1;
        }
        System.out.println("Element removed "+queue.peek());
        return queue.poll();
    }

    public int top() {
        if(queue.isEmpty()){
            return -1;
        }
        System.out.println("Top element is "+queue.peek());
        return queue.peek();
    }
    public static void main(String[] args) {
        StackUsingQueue stack=new StackUsingQueue();
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.top();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.queue);
    }
}
