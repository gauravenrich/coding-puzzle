package com.puzzle.strings;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    static List<Integer> nextPermutation(int n, int[] arr) {
        // code here
        int i = n - 2;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i < 0) {
            reverse(arr, 0);
            return print(arr);
        }

        int j = n - 1;
        while (j >= 0 && arr[i] >= arr[j]) {
            j--;
        }
        swap(arr, i, j);
        reverse(arr, i + 1);
        return print(arr);
    }

    public static ArrayList<Integer> print(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int n : arr) {
            ans.add(n);
        }
        return ans;
    }

    public static void reverse(int[] nums, int i) {
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
