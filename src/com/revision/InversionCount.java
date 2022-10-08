package com.revision;

/**
 * Given an integer array nums, return the number of reverse pairs in the array.
 */
public class InversionCount {
    int count = 0;

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 1};
        InversionCount inversionCount = new InversionCount();
        System.out.println(inversionCount.reversePairs(nums));
    }

    public int reversePairs(int[] nums) {
        //brute force O(N^2)
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] > (long)2 * nums[j]) {
        //             count++;
        //         }
        //     }
        // }

        //merege sort optimized O(Nlogn)
        mergeSort(nums, 0, nums.length - 1);
        return count;
    }

    public int[] mergeSort(int[] arr, int low, int high) {
        if (low == high) {
            int[] base = new int[1];
            base[0] = arr[low];
            return base;
        }

        int mid = (low + high) / 2;

        int[] left = mergeSort(arr, low, mid);
        int[] right = mergeSort(arr, mid + 1, high);

        return mergeArrays(left, right);
    }

    public int[] mergeArrays(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] res = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > (long) 2 * arr2[j]) {
                count += (arr1.length - i);
                j++;
            } else {
                i++;
            }
        }

        i = 0;
        j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            res[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }

        return res;
    }

}
