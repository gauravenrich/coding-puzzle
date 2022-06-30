package com.puzzle.array;
/**
 * Leetcode 153. Find Minimum in Rotated Sorted Array
 * @author gsinha
 * 30 june 2022
 */
public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        MinInRotatedSortedArray minInRotatedSortedArray = new MinInRotatedSortedArray();
        System.out.println(minInRotatedSortedArray.findMin(a));
    }

    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (start > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[end] < nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }
}
