package com.mustcode;

class MyQueue{
    private final int MAX_SIZE=3;
    private int front;
    private int rear;
    private final int[] arr;

    public MyQueue(){
        arr=new int[MAX_SIZE];
        front=0;
        rear=0;
    }

    public void add(int num){
        if(rear>=MAX_SIZE){
            System.out.println("MAX Limit reached");
        }else {
            arr[rear++]=num;
            System.out.println(num+" added to queue");
        }
    }

    public int remove(){
        if (front<0 || front>=MAX_SIZE){
            System.out.println("Empty queue");
            return -1;
        }else {
            System.out.println(arr[front]+" removed");
            rear--;
            return arr[front++];
        }
    }

    public void display(){
        for(int i=front;i<rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class QueueUsingArray {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.add(2);
        queue.add(3);
        queue.add(6);
        queue.add(9);
        queue.add(19);
        queue.add(90);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.add(90);
        queue.add(91);
        queue.add(92);
        queue.add(93);
        queue.display();
    }
}