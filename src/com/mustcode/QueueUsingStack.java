package com.mustcode;

import java.util.Stack;

/**
 * Queue using stack
 */
class CustomQueue{
    private final Stack<Integer> s1;
    private final Stack<Integer> s2;

    public CustomQueue(){
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void add(int x){
        System.out.println(x+" Added to queue");
        s1.add(x);
    }

    public int remove(){
        int result;
        if(!s2.isEmpty()){
            result=s2.pop();
        }
        else if(!s1.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            result=s2.pop();
        }else {
            System.out.println("Queue is empty");
            result=-1;
        }
        System.out.println(result+" Removed from queue");
        return result;
    }

}
public class QueueUsingStack {
    public static void main(String[] args) {
        CustomQueue queue=new CustomQueue();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.add(90);
        queue.remove();
        queue.add(100);
        queue.remove();
    }
}
