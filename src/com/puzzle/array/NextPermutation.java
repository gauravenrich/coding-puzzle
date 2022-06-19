package com.puzzle.array;

import java.util.Arrays;

/**
 *  Date 08/02/2020
 *  @author gauravenrich
 *  Next Permutation
 */
public class NextPermutation {
    public static void main(String[] args) {
        int[] a = {1,2,3,7,3,4,9,6,5,2,1 };
        NextPermutation obj = new NextPermutation();
        obj.nextPermutation(a);
        System.out.println(Arrays.toString(a));
    }
    private void nextPermutation(int[] nums) {
        //find first decreasing digit from right
        int mark = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                mark = i - 1;
                break;
            }
        }
        if (mark == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        // find the element greater than marked element
        int idx = nums.length - 1;
        for (int i = nums.length - 1; i >= mark + 1; i--) {
            if (nums[i] > nums[mark]) {
                idx = i;
                break;
            }
        }

        swap(nums, mark, idx);

        reverse(nums, mark + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
