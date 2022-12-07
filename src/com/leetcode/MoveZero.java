package com.leetcode;

import java.util.Arrays;

/**
 * Leetcode 283. Move Zeroes
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining the
 * relative order of the non-zero elements.
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 2, 12};
        moveZero(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZero(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
