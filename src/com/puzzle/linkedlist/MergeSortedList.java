package com.puzzle.linkedlist;

/**
 * Leetcode 21. Merge Two Sorted Lists
 * 2ndJuly 2022
 */
public class MergeSortedList {

    public Node mergeTwoLists(Node l1, Node l2) {

        Node p = new Node(0);
        Node head = p;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.data > l2.data) {
                    p.next = l2;
                    l2 = l2.next;
                } else {
                    p.next = l1;
                    l1 = l1.next;

                }
                p = p.next;
            } else if (l1 == null) {
                p.next = l2;
                break;
            } else {
                p.next = l1;
                break;

            }

        }
        return head.next;

    }
}
