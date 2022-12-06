package com.leetcode;

/**
 * Leetcode 26. Remove Duplicates from Sorted Array
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 */
public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        int[] nums2 = {1,1,3};
        System.out.println(removeDuplicates(nums2));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}
