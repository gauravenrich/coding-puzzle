package com.puzzle.stackqueue;

/**
 * @author gsinha
 * 25 june 2022
 * Implement two stacks in an array
 * Following functions must be supported by twoStacks.
 * <p>
 * push1(int x) –> pushes x to first stack
 * push2(int x) –> pushes x to second stack
 * pop1() –> pops an element from first stack and return the popped element
 * pop2() –> pops an element from second stack and return the popped element
 */
public class TwoStack {
    int[] a;
    int size;
    int top1;
    int top2;

    public TwoStack(int n) {
        size = n;
        a = new int[n];
        top1 = -1;
        top2 = size;
    }

    public static void main(String[] args) {
        TwoStack ts = new TwoStack(10);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from"
                + " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from"
                + " stack2 is " + ts.pop2());
    }

    void push1(int n) {
        if (top1 < top2 - 1) {
            top1++;
            a[top1] = n;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    void push2(int n) {
        if (top1 < top2 - 1) {
            top2--;
            a[top2] = n;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    int pop1() {
        if (top1 > 0) {
            int x = a[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack underflow");
            return -1;
        }
    }

    int pop2() {
        if (top2 < size) {
            int x = a[top2];
            top1++;
            return x;
        } else {
            System.out.println("Stack underflow");
            return -1;
        }
    }
}
