package com.puzzle.linkedlist;

/**
 *  Date 04/04/2021
 *  @author gauravenrich
 *  Remove Duplicatesin Sorted LinkedList
 */
public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.display();
        removeDuplicates(linkedList.head);
        System.out.println("\nList after removing duplicates ");
        linkedList.display();

    }

    static void removeDuplicates(Node head) {
        Node cur = head;
        while (cur != null) {
            Node temp = cur;
            while (temp != null && temp.data == cur.data) {
                temp = temp.next;
            }
            cur.next = temp;
            cur = cur.next;
        }
    }
}
