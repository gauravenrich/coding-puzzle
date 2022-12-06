package com.leetcode;

import java.util.Arrays;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicatesAmTwice(nums));
        System.out.println(Arrays.toString(nums));
    }
    // 0 0 1 1 1 1 2 3 3
    // 0 0 1 1 2 3 3
    private static int removeDuplicatesAmTwice(int[] nums) {
        int j=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i] && count<2){
                if(i!=j){
                    System.out.println(i+" "+j);
                }
                nums[j]=nums[i]; // shifting current , dont shift only if num[i]==[num-1] and count>=2
                count++;
                j++;
            }else if(nums[i]!=nums[i-1]){
                count=1;
                nums[j]=nums[i]; // shifting current , dont shift only if num[i]==[num-1] and count>=2
                j++;
            }
        }
        return j;
    }
}
