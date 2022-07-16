package com.puzzle.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeQueue {
    Deque<Integer> deque=new ArrayDeque<>();
    public void push(Integer num){
        deque.addLast(num);
    }
    public int pop(){
        if(deque.isEmpty()){
            return -1;
        }
      return deque.removeLast();
    }
    public void display(){
        System.out.println(deque);
    }
    public static void main(String[] args) {
        StackUsingDeQueue stackUsingDeQueue=new StackUsingDeQueue();
        stackUsingDeQueue.push(2);
        stackUsingDeQueue.push(3);
        stackUsingDeQueue.push(4);
        System.out.println("popped item is  "+stackUsingDeQueue.pop());
        stackUsingDeQueue.push(5);
        stackUsingDeQueue.display();

    }
}
