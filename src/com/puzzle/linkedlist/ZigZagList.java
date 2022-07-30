package com.puzzle.linkedlist;

/**
 * Given a linked list, rearrange it such that the converted list should be of the form a < b > c < d > e < f …
 * where a, b, c… are consecutive data nodes of the linked list.
 * @author gsinha
 * 30 july 2022
 */
public class ZigZagList {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;
        temp.next = new Node(2);
        temp = temp.next;
        temp.next = new Node(3);
        temp = temp.next;
        temp.next = new Node(4);
        printList(head);
        ZigZagList zigZagList = new ZigZagList();
        zigZagList.zigZag(head, 0);
        System.out.print("\nSorted Linked List is: \n");
        printList(head);
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public Node zigZag(Node node, int flag) {
        if (node == null || node.next == null) {
            return node;
        }
        if (flag == 0) {
            if (node.data > node.next.data) {
                swap(node, node.next);
            }
            return zigZag(node.next, 1);
        } else {
            if (node.data < node.next.data) {
                swap(node, node.next);
            }
            return zigZag(node.next, 0);
        }
    }

    private void swap(Node a, Node b) {
        if (a == null || b == null)
            return;
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }

}
