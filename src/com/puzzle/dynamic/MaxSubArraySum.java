package com.puzzle.dynamic;

/**
 *  Date 11/23/2020
 *  @author gauravenrich
 *  Max SubArraySum
 */

public class MaxSubArraySum {

    public static void main(String args[]){
        int[] input = {2, -9, 5, 1, -4, 6, 0, -7, 8};
        System.out.println("Maximum subarray sum is " + findMaxSubArraySum(input));
    }

    private static int findMaxSubArraySum(int[] input) {
        int maxEndingHere=0;
        int maxSoFar=Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            maxEndingHere=maxEndingHere+input[i];
            if(maxEndingHere>maxSoFar){
                maxSoFar=maxEndingHere;
            }
            if(maxEndingHere<0){
                maxEndingHere=0;
            }
        }
        return maxSoFar;
    }
}
