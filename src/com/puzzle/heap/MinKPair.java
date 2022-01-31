package com.puzzle.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Pair{
    int key;
    int value;
    Pair(int key,int value){
        this.key=key;
        this.value=value;
    }
}
public class MinKPair {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int val: nums){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        int[] res=new int[k];
        PriorityQueue<Pair> minHeap=new PriorityQueue<>(Comparator.comparingInt(o -> o.value));
        for(Map.Entry<Integer, Integer>entry: map.entrySet()){
            minHeap.add(new Pair(entry.getKey(), entry.getValue()));
            if(minHeap.size()>k)
                minHeap.poll();
        }
        for(int i=0;i<k;i++){
            Pair p=minHeap.poll();
            res[i]=p.key;
        }
        return res;
    }
}
