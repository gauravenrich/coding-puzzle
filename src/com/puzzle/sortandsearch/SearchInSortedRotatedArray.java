package com.puzzle.sortandsearch;

/**
 * Date 03/17/2020
 *
 * @author gauravenrich
 * Search In Sorted Rotated Array
 */
public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.println("Element " + search(a, target));

    }

    public static int search(int[] a, int target) {
        int pivot = findPivot(a);
        if (pivot == -1) {
            return binarySearchUtil(a, 0, a.length - 1, target);
        }
        if (a[pivot] == target) {
            return pivot;
        }
        if (target > a[0]) {
            return binarySearchUtil(a, 0, pivot - 1, target);
        } else {
            return binarySearchUtil(a, pivot + 1, a.length - 1, target);
        }
    }

    private static int binarySearchUtil(int[] a, int start, int end, int target) {
        if (a.length == 0) {
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return -1;
    }


    private static int findPivot(int[] a) {
        if (a == null || a.length == 0) {
            return -1;
        }
        // Case when array is not rotated. Then first index is the pivot
        if (a.length == 1 || a[0] < a[a.length - 1]) {
            return 0;
        }
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] > a[mid + 1] && mid < a.length - 1)
                return mid + 1;
            else if (a[mid] <= a[start])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
