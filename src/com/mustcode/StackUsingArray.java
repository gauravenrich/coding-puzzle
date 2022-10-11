package com.mustcode;

class MyStack{
    private final int[] arr;
    private final int MAX_SIZE=3;
    private int top=-1;

    public MyStack(){
        arr=new int[MAX_SIZE];
    }

    public void push(int num){
        if(top>=MAX_SIZE-1){
            System.out.println("Stack overflow");
        }else {
            arr[++top]=num;
            System.out.println(num+" pushed to stack");
        }
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack Empty");
            return -1;
        }
        return arr[top--];
    }

    public void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(2);
        stack.push(4);
        stack.push(9);
        stack.push(10);
        System.out.println(stack.pop());
        stack.push(44);
        stack.display();
    }
}
