package com.mustcode;

/**
 * Leetcode 53. Maximum Subarray
 */
public class KadaneAlgo {
    public static void main(String[] args) {
        //code
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(a));
    }

    static int maxSum(int[] nums) {
        int maxSoFar = 0;
        int maxEndingHere = 0;
        int maxInArr = Integer.MIN_VALUE;

        for (int num : nums) {
            maxEndingHere = maxEndingHere + num;
            if (num > maxInArr) {
                maxInArr = num;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }
        return (maxInArr < 0) ? maxInArr : maxSoFar;
    }
}

