package com.puzzle.linkedlist;
/**
 * Reverse double linked list
 *
 * @author gsinha
 * 9th july 2022
 */
class DNode {
    int data;
    DNode next, prev;

    DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseDoubleLinkedList {
    public static DNode reverseDLL(DNode head) {
        //Your code here
        while (head != null) {
            DNode pre = head.next;
            head.next = head.prev;
            head.prev = pre;
            if (pre == null) {
                return head;
            }
            head = pre;
        }
        return head;
    }

}
