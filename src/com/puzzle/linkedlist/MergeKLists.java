package com.puzzle.linkedlist;

import com.puzzle.common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;


public class MergeKLists {
    
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(Comparator.comparingInt(ListNode::getVal));
        ListNode result=new ListNode();
        for(ListNode listNode:lists){
            if(listNode!=null){
                pq.add(listNode);
            }
        }
        ListNode temp=result;
        while (!pq.isEmpty()){
            ListNode e=pq.poll();
            temp.setNext(e);
            temp=temp.getNext();
            if(e.getNext()!=null){
                pq.add(e.getNext());
            }

        }
        return result.getNext();
    }
}
