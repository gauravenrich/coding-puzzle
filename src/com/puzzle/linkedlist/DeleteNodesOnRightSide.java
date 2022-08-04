package com.puzzle.linkedlist;

/**
 * Delete nodes which have a greater value on right side
 * @author gsinha
 * 4th aug 2022
 */
public class DeleteNodesOnRightSide {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.add(12);
        linkedList.add(15);
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.display();
        linkedList.head=deleteNodesOnRightSide(linkedList.head);
        System.out.println("\nList after removing ");
        linkedList.display();
    }
    public static Node deleteNodesOnRightSide(Node head){
        if(head==null|| head.next==null){
            return head;
        }
        Node next=deleteNodesOnRightSide(head.next);
        if(next.data> head.data){
            return next;
        }
        head.next=next;
        return head;
    }
}
