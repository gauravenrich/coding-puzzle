package com.blind75.array;

import java.util.Arrays;

public class ProdOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right = nums[i] * right;
        }
        return res;
    }
}
