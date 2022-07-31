package com.puzzle.linkedlist;

/**
 * QuickSort a linkedList
 * @author gsinha
 * 31 july 2022
 */
public class QuickSortList {
    public static void main(String[] args) {
        CustomLinkedList linkedList=new CustomLinkedList();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        Node n = linkedList.head;
        while (n.next != null)
            n = n.next;

        System.out.println("Linked List before sorting");
        linkedList.display();
        QuickSortList quickSortList=new QuickSortList();
        quickSortList.sort(linkedList.head, n);

        System.out.println("\nLinked List after sorting");
        linkedList.display();
    }
    void sort(Node start, Node end) {
        if (start == null || start == end || start == end.next)
            return;

        // split list and partition recurse
        Node pivot_prev = partitionLast(start, end);
        sort(start, pivot_prev);

        // if pivot is picked and moved to the start,
        // that means start and pivot is same
        // so pick from next of pivot
        if (pivot_prev != null && pivot_prev == start)
            sort(pivot_prev.next, end);

            // if pivot is in between of the list,
            // start from next of pivot,
            // since we have pivot_prev, so we move two nodes
        else if (pivot_prev != null
                && pivot_prev.next != null)
            sort(pivot_prev.next.next, end);
    }

    // takes first and last node,
    // but do not break any links in
    // the whole linked list
    Node partitionLast(Node start, Node end) {
        if (start == end || start == null || end == null)
            return start;

        Node pivot_prev = start;
        Node curr = start;
        int pivot = end.data;

        // iterate till one before the end,
        // no need to iterate till the end
        // because end is pivot
        while (start != end) {
            if (start.data < pivot) {
                // keep tracks of last modified item
                pivot_prev = curr;
                int temp = curr.data;
                curr.data = start.data;
                start.data = temp;
                curr = curr.next;
            }
            start = start.next;
        }

        // swap the position of curr i.e.
        // next suitable index and pivot
        int temp = curr.data;
        curr.data = pivot;
        end.data = temp;

        // return one previous to current
        // because current is now pointing to pivot
        return pivot_prev;
    }
}
