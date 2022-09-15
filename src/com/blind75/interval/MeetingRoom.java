package com.blind75.interval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given an array of meeting time intervals consisting of start and end times [s1, e1], [s2, e2],
 * ... , determine if a person could attend all meetings
 * For example,
 * Given [ [0, 30], [5, 10], [15, 20] ],
 * return false.
 */
class Interval{
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class MeetingRoom {
    public static void main(String[] args) {
        int[][] meeting={{0, 30}, {5, 10}, {15, 20}};
        Interval[] intervals=getIntervals(meeting);
        System.out.println(canAttendMeeting(intervals));

    }

    private static Interval[] getIntervals(int[][] meeting) {
        Interval[] intervals=new Interval[meeting.length];
        int i=0;
        for (int[] nums:meeting){
            intervals[i++]=new Interval(nums[0],nums[1]);
        }
        return intervals;
    }

    public static boolean canAttendMeeting(Interval[] intervals){
        Arrays.sort(intervals, Comparator.comparing(t->t.start));
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i].end>intervals[i+1].start){
                return false;
            }
        }
        return true;
    }
}
