package com.blind75.interval;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...]
 * find the minimum number of conference rooms required.
 */
public class MeetingRoom2 {
    public static void main(String[] args) {
        int[][] meeting={{0, 30}, {5, 10}, {15, 20}};
        System.out.println(minMeetingRooms(meeting));
    }

    public static int minMeetingRooms(int[][] intervals) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        int count=0;
        Arrays.sort(intervals, Comparator.comparing((int[] itv)->itv[0]));
        for(int[] itv:intervals){
            if(heap.isEmpty()){
                count++;
                heap.offer(itv[1]);
            }else {
                if (itv[0] >= heap.peek()) {
                    heap.poll();
                } else {
                    count++;
                }
                heap.offer(itv[1]);
            }
        }
        return count;
    }
}
