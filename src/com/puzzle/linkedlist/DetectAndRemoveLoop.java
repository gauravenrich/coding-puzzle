package com.puzzle.linkedlist;

public class DetectAndRemoveLoop {
    void detectAndRemoveLoop(Node node)
    {

        // If list is empty or has only one node
        // without loop
        if (node == null || node.next == null)
            return;

        Node slow = node, fast = node;

        // Move slow and fast 1 and 2 steps
        // ahead respectively.
        slow = slow.next;
        fast = fast.next.next;

        // Search for loop using slow and fast pointers
        while (fast != null && fast.next != null) {
            if (slow == fast)
                break;

            slow = slow.next;
            fast = fast.next.next;
        }

        /* If loop exists */
        if (slow == fast) {
            slow = node;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                /* since fast->next is the looping point */
            }
            /* This case is added if fast and slow pointer meet at first position. */
            else {
                while(fast.next != slow) {
                    fast = fast.next;
                }
            }
            fast.next = null; /* remove loop */
        }
    }
}
