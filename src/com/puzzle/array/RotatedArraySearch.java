package com.puzzle.array;

public class RotatedArraySearch {
    public static void main(String[] args) {
        int[] array = {21, 27, 34, 47, 2, 6};
        int index = searchRotated(array, 27);
        System.out.println("Index is " + index);
    }

    private static int searchRotated(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }

            }
        }
        return -1;
    }
}
