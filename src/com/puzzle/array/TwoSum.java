package com.puzzle.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Date 03/16/2021
 * @author gauravenrich
 * Two Sum Program
 *
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 15 };
        int sum = 6;
        System.out.println(getPairsCount(arr, sum));
    }

    private static int getPairsCount(int[] arr, int sum) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                count++;
            }else {
                map.put(sum-arr[i],sum);
            }
        }
        return count;
    }
}
