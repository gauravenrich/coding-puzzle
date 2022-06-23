package com.puzzle.linkedlist;

/***
 * Date 23/06/2022
 * @author gsinha
 * Leetcode 19. Remove Nth Node From End of List
 */
public class RemoveNthNode {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.display();
        System.out.println();
        removeNthFromEnd(linkedList.head, 5);
        linkedList.display();
    }

    public static Node removeNthFromEnd(Node head, int n) {
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        if (p1 == null) {
            return head;
        }
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return head;

    }
}
