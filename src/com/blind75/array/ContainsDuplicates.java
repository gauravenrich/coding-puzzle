package com.blind75.array;

import java.util.Arrays;

/**
 * Given an integer array nums, return true if
 * any value appears at least twice in the array, and return false if every element is distinct.
 * Leetcode 217. Contains Duplicate
 * 8th sep 2022
 */
public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        ContainsDuplicates duplicates = new ContainsDuplicates();
        System.out.println(duplicates.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
