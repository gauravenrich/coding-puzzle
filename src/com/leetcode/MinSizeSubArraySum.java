package com.leetcode;

/**
 * Leetcode 209. Minimum Size Subarray Sum
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray
 * whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 */
public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        MinSizeSubArraySum obj=new MinSizeSubArraySum();
        System.out.println(obj.minSubArrayLen(target,nums));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int n = nums.length;
        int sum = 0;
        while (j < n) {
            if (sum < target) {
                sum += nums[j];
                j++;
            } else {
                minLen = Integer.min(minLen, j - i);
                if (i == j - 1) {
                    return 1;
                }
                sum -= nums[i];
                i++;
            }
        }
        while (sum>=target){
            minLen=Integer.min(minLen,j-i);
            sum=sum-nums[i++];
        }
        return minLen;
    }
}
