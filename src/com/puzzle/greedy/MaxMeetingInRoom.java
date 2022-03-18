package com.puzzle.greedy;

import java.util.*;

class Meeting {
    public int start;
    public int end;

    @Override
    public String toString() {
        return "Meeting{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MaxMeetingInRoom {
    public static void main(String[] args) {
        List<Meeting> meetingList=new ArrayList<>();
      //  [(3, 29), (50, 93), (88, 92), (54, 67), (50, 87)]
        meetingList.add(new Meeting(3,9));
        meetingList.add(new Meeting(50,93));
        meetingList.add(new Meeting(88,92));
        meetingList.add(new Meeting(54,67));
        meetingList.add(new Meeting(60,87));
        Meeting[] meetings= meetingList.toArray(Meeting[]::new);
        System.out.println("Max number of possible meeting is "+getMaxMeetings(meetings));

    }

    static int getMaxMeetings(Meeting[] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(o -> o.end));
        for(Meeting meeting:meetings){
            System.out.println(meeting);
        }
        int finish=0;
        if(meetings.length>0){
            finish=meetings[0].end;
        }
        int res=0;
        for(int i=1;i<meetings.length;i++){
            if(meetings[i].start>finish){
                res++;
                finish=meetings[i].end;
            }
        }
        return res;
    }
}

