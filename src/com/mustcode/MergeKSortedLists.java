package com.mustcode;


import com.puzzle.common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {
        ListNode[] arr = new ListNode[3];

        arr[0] = new ListNode(1);
        arr[0].next = new ListNode(3);
        arr[0].next.next = new ListNode(5);
        arr[0].next.next.next = new ListNode(7);

        arr[1] = new ListNode(2);
        arr[1].next = new ListNode(4);
        arr[1].next.next = new ListNode(6);
        arr[1].next.next.next = new ListNode(8);

        arr[2] = new ListNode(0);
        arr[2].next = new ListNode(9);
        arr[2].next.next = new ListNode(10);
        arr[2].next.next.next = new ListNode(11);
        ListNode node=mergeKLists(arr);
        while (node.getNext()!=null){
            System.out.print(node.getVal()+" ");
            node=node.getNext();
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue=new PriorityQueue<>(Comparator.comparing(ListNode::getVal));
        ListNode result=new ListNode();
        for(ListNode node:lists){
            if(node!=null){
                queue.add(node);
            }
        }
        ListNode temp=result;
        while (!queue.isEmpty()){
            ListNode cur=queue.poll();
            temp.setNext(cur);
            temp=temp.getNext();
            if(cur.getNext()!=null){
                queue.add(cur.getNext());
            }
        }
        return result.getNext();
    }
}