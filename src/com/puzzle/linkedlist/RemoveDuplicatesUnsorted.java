package com.puzzle.linkedlist;

import java.util.HashSet;
import java.util.Set;
/**
 *  Date 04/04/2021
 *  @author gauravenrich
 *  Remove Duplicatesin UnSorted LinkedList
 */
public class RemoveDuplicatesUnsorted {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(2);

        linkedList.display();
        removeDuplicatesUnsorted(linkedList.head);
        System.out.println("\nList after removing duplicates ");
        linkedList.display();
    }

    private static Node removeDuplicatesUnsorted(Node head) {
        Set<Integer> hs=new HashSet<>();
        Node prev=null;
        Node cur=head;
        while(cur!=null){
            if(hs.contains(cur.data)){
                prev.next=cur.next;
            }else {
                hs.add(cur.data);
                prev=cur;
            }
            cur=cur.next;
        }
        return head;
    }
}
