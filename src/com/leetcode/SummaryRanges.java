package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its ranges for consecutive numbers.
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"]
 */
public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums={0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        if(nums.length==0){
            return result;
        }
        if(nums.length==1){
            result.add(nums[0]+"");
        }
        int pre=nums[0];
        int first=pre; // first element of each range
        for(int i=1;i< nums.length;i++){
            if(pre+1==nums[i]){
                if(i== nums.length-1){
                    result.add(first+"->"+nums[i]);
                }
            }else {
                if(pre==nums[i]){
                    result.add(first+"");
                } else {
                    if(first==pre){
                        result.add(first+"");
                    }else {
                        result.add(first+"->"+pre);
                    }

                }
                if(i==nums.length-1){
                    result.add(nums[i]+"");
                }
                first=nums[i];
            }
            pre=nums[i];
        }
        return result;
    }
}
