package com.leetcode;

/**
 * Leetcode 27. Remove Element
 * Given an integer array nums and an integer val,
 * remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Return k after placing the final result in the first k slots of nums.
 */
public class RemoveElements {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 3};
        System.out.println(removeElement(arr, 2));
    }

    private static int removeElement(int[] arr, int k) {
        int index = 0;
        for (int num : arr) {
            if (num != k) {
                arr[index++] = num;
            }
        }
        return index;
    }
}
