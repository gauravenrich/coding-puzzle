package com.puzzle.linkedlist;

/**
 * Date 08/27/2021
 *
 * @author gauravenrich
 * Start of loop in linked list
 */
public class StartOfLoop {

    static Node newNode(int key) {
        Node temp = new Node();
        temp.key = key;
        temp.next = null;
        return temp;
    }

    static Node detectAndRemoveLoop(Node head) {
        if (head == null || head.next == null)
            return null;

        Node slow = head, fast = head;
        slow = slow.next;
        fast = fast.next.next;
        while (fast != null &&
                fast.next != null) {
            if (slow == fast)
                break;
            slow = slow.next;
            fast = fast.next.next;
        }
// If loop does not exist
        if (slow != fast)
            return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        return slow;
    }

    // Driver code
    public static void main(String[] args) {
        Node head = newNode(50);
        head.next = newNode(20);
        head.next.next = newNode(15);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(10);

// Create a loop for testing
        head.next.next.next.next.next = head.next.next;

        Node res = detectAndRemoveLoop(head);
        if (res == null)
            System.out.print("Loop does not exist");
        else
            System.out.print("Loop starting node is " + res.key);
    }

    static class Node {
        int key;
        Node next;
    }
}