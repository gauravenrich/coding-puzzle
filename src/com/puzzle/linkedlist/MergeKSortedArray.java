package com.puzzle.linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedArray {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        ListNode result=new ListNode();
        for(ListNode listNode:lists){
            if(listNode!=null){
                pq.add(listNode);
            }
        }
        ListNode temp=result;
        while (!pq.isEmpty()){
            ListNode e=pq.poll();
            temp.next=e;
            temp=temp.next;
            if(e.next!=null)
                pq.add(e.next);
        }
        return result.next;
    }
}
