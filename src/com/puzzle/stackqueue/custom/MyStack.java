package com.puzzle.stackqueue.custom;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue;
    public MyStack(){
        queue=new LinkedList<>();
    }

    public void push(Integer num){
        queue.add(num);
        for(int i=0;i< queue.size()-1;i++){
            queue.add(queue.poll());
        }
        System.out.println(queue);
    }
    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.pop());
    }
}
