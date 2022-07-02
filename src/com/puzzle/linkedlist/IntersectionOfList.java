package com.puzzle.linkedlist;

public class IntersectionOfList {

    public Node intersectPoint(Node head1, Node head2) {
        Node ptr1 = head1;
        Node ptr2 = head2;
        if (ptr1 == null || ptr2 == null) {
            return null;
        }
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            if (ptr1 == ptr2) {
                return ptr1;
            }
            if (ptr1 == null) {
                ptr1 = head2;
            }
            if (ptr2 == null) {
                ptr2 = head2;
            }
        }
        return ptr1;
    }
}
