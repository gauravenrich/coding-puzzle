package com.puzzle.puzzle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamProgram {
    List<Integer> list;
    Map<Integer,Integer> map;
    int i=0;

    public StreamProgram(){
        map=new HashMap<>();
        list=new ArrayList<>();
    }

    public int getSum(int timeStamp){
        int sum=0;
        int left=map.get(timeStamp-100);
        for (int i=left;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }

    public void addStream(int timeStamp,int score){
        map.put(timeStamp,i);
        list.add(score);
        i++;
    }
    public static void main(String[] args) {
        StreamProgram streamProgram=new StreamProgram();
        streamProgram.addStream(1200,2);
        streamProgram.addStream(1201,2);
        streamProgram.addStream(1300,5);
        streamProgram.addStream(1340,7);
        streamProgram.addStream(1360,2);
        streamProgram.addStream(1410,10);
        streamProgram.addStream(1460,16);

        System.out.println(streamProgram.getSum(1500));

    }
}
