package com.leetcode;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ProductOfArray obj=new ProductOfArray();
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i = 0; i < n - 1; i++) {
            left[i + 1] = left[i] * nums[i];
        }
        for (int i = n - 1; i > 0; i--) {
            right[i - 1] = right[i] * nums[i];
        }
        for(int i=0;i<n;i++){
            result[i]=left[i]*right[i];
        }
        return result;
    }
}
