package com.puzzle.linkedlist;

/**
 * Date 03/29/2021
 *
 * @author gauravenrich
 * LinkedList
 */
public class CustomLinkedList {
    Node head;

    public void add(int a) {
        if (head == null) {
            head = new Node(a);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(a);
        }
    }

    public void display() {
        if (head == null) {
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    // 1 2 3 4
    public Node reverseIterative(Node head) {
        Node current = head;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /**
     * @return The general recursive algorithm for this is:
     * <p>
     * Divide the list in 2 parts - first node and rest of the list.
     * Recursively call reverse for the rest of the linked list.
     * Linke remaining to first.
     * Fix head pointer
     * <a href="https://stackoverflow.com/questions/14080758/reversing-a-linkedlist-recursively-in-c">...</a>
     */
    public Node reverseRecursive(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Node rest = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
}
