package com.blind75.stack;

/**
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums2));
    }

    public static boolean canJump(int[] nums) {
        int lastGoodIndex = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastGoodIndex) {
                lastGoodIndex = i;
            }
        }
        return lastGoodIndex == 0;
    }
}
