package com.puzzle.common;

public class ListNode {
    int val;
    public ListNode next;

    public ListNode(int num) {
        this.val=num;
    }

    public ListNode(){}

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
