package com.puzzle.array;

public class KthSmallestElement {
    public static void main(String[] args) {
        int N = 6;
        int[] arr = {7, 10, 4, 3, 20, 15};
        int K = 3;
        System.out.println(kthSmallest(arr,0,arr.length-1,3));
    }

    public static int kthSmallest(int[] a, int l, int r, int k) {
        return quicksort(a, k, l, r);
    }

    public static int quicksort(int[] nums, int k, int l, int h) {
        if (l < h) {
            int piv = partition(nums, l, h);

            if (piv + 1 == k) {
                return nums[piv];
            } else if (piv + 1 < k) {
                l = piv + 1;
                return quicksort(nums, k, l, h);
            } else {
                h = piv - 1;
                return quicksort(nums, k, l, h);
            }
        }

        return nums[h];
    }

    public static int partition(int[] nums, int l, int h) {
        int i = l;
        int j = h;
        int pivot = nums[l];

        while (i < j) {
            while (i <= h && nums[i] <= pivot)
                i++;

            while (j >= l && nums[j] > pivot)
                j--;

            if (i < j)
                swap(nums, i, j);
        }
        swap(nums, j, l);

        return j;
    }

    public static void swap(int[] ar, int a, int b) {
        int t = ar[a];
        ar[a] = ar[b];
        ar[b] = t;
    }
}
