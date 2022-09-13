package com.blind75.greedy;

public class MaxSubArray {
    public static void main(String[] args) {
       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }
    public static int maxSubArray(int[] nums) {
        int maxSoFar=0;
        int maxEndingHere=0;
        int maxInArray=Integer.MIN_VALUE;
        for (int num : nums) {
            maxEndingHere += num;
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
            if(num>maxInArray){
                maxInArray=num;
            }
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }
        return (maxInArray<0)?maxInArray:maxSoFar;
    }
}
