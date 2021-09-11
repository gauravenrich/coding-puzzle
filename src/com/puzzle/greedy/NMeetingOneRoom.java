package com.puzzle.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Date 09/11/2021
 * @author gauravenrich
 * NMeetingOneRoom
 */
public class NMeetingOneRoom {
    static class Activity {
        int start;
        int end;

        public Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        NMeetingOneRoom meetingOneRoom=new NMeetingOneRoom();
        meetingOneRoom.displayActivity(start,end);
    }

    public void displayActivity(int[] start,int[] end){
        List<Activity> activityList=new ArrayList<>();
        for(int i=0;i<start.length;i++){
            activityList.add(new Activity(start[i], end[i]));
        }
        Comparator<Activity> activityComparator=Comparator.comparing((a) -> a.end);
        activityList.sort(activityComparator);
        List<Activity> result=new ArrayList<>();
        int begin;
        int finish=0;
        if(activityList.size()>0){
            Activity first=activityList.remove(0);
            begin=first.start;
            finish=first.end;
            result.add(new Activity(begin,finish));
        }
        for(Activity activity:activityList){
            if(activity.start>finish){
                result.add(activity);
                finish=activity.end;
            }
        }
        System.out.println("Activity List");
        result.forEach(
                t-> System.out.println("Activity started at "+t.start+" and ends at "+t.end)
        );
    }
}
