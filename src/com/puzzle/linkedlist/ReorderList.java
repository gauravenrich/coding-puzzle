package com.puzzle.linkedlist;

import com.puzzle.common.ListNode;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        ListNode temp;
        ListNode prev=null;
        ListNode cur=slow;
        while(cur!=null){
            temp=cur.getNext();
            cur.setNext(prev);
            prev=cur;
            cur=temp;
        }

        //link first half and second half alternatively
        ListNode first = head, second = prev;
        while(second.next!=null){
            temp=first.next;
            first.next=second;
            first=temp;
            temp=second.next;
            second.next=first;
            second=temp;
        }

    }
}
