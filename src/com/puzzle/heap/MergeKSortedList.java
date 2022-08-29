package com.puzzle.heap;


import com.puzzle.common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {
    public static void main(String[] args) {
        // an array of pointers storing the head nodes
        // of the linked lists
        int k = 3; // Number of linked lists
        ListNode[] arr = new ListNode[k];

        arr[0] = new ListNode(1);
        arr[0].next = new ListNode(3);
        arr[0].next.next = new ListNode(5);
        arr[0].next.next.next = new ListNode(7);

        arr[1] = new ListNode(2);
        arr[1].next = new ListNode(4);
        arr[1].next.next = new ListNode(6);
        arr[1].next.next.next = new ListNode(8);

        arr[2] = new ListNode(0);
        arr[2].next = new ListNode(9);
        arr[2].next.next = new ListNode(10);
        arr[2].next.next.next = new ListNode(11);

        // Merge all lists
        ListNode head = mergeKLists(arr);
        printList(head);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(ListNode::getVal));
        ListNode result = new ListNode();
        for (ListNode listNode : lists) {
            if (listNode != null) {
                pq.add(listNode);
            }
        }
        ListNode temp = result;
        while (!pq.isEmpty()) {
            ListNode e = pq.poll();
            temp.setNext(e);
            temp = temp.getNext();
            if (e.getNext() != null)
                pq.add(e.getNext());
        }
        return result.getNext();
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.getVal() + " ");
            node = node.next;
        }
    }
}
