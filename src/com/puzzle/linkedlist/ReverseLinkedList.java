package com.puzzle.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        CustomLinkedList linkedList=new CustomLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.display();
        linkedList.head=linkedList.reverseIterative(linkedList.head);
        System.out.println();
        linkedList.display();
        linkedList.head=linkedList.reverseRecursive(linkedList.head);
        System.out.println();
        linkedList.display();
    }
}
