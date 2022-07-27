package com.puzzle.linkedlist;

/**
 * SegregateEvenOdd
 * @author gsinha
 * 27 july 2022
 */
public class SegregateEvenOdd {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.display();
        SegregateEvenOdd segregateEvenOdd = new SegregateEvenOdd();
        segregateEvenOdd.segregateEvenOdd(linkedList);
        System.out.println("\nList after removing duplicates ");
        linkedList.display();
    }

    public void segregateEvenOdd(CustomLinkedList linkedList) {

        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = linkedList.head;

        while (currentNode != null) {
            int element = currentNode.data;

            if (element % 2 == 0) {

                if (evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }

            } else {

                if (oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
            // Move head pointer one step in forward direction
            currentNode = currentNode.next;
        }


        if (oddStart == null || evenStart == null) {
            return;
        }

        evenEnd.next = oddStart;
        oddEnd.next = null;
        linkedList.head = evenStart;
    }

}
