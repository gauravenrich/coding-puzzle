package com.puzzle.sortandsearch;

/**
 * Date 03/15/2021
 *
 * @author gauravenrich
 * Java program to check fixed point in an array using binary search
 */
public class FixedPointInArray {
    public static void main(String[] args) {
        int arr[] = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
        int n = arr.length;
        System.out.println("Fixed Point is "
                + binarySearch(arr, 0, n - 1));
    }

    private static int binarySearch(int[] a, int start, int end) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == mid) {
                return mid;
            } else if (mid > a[mid]) {
                start = mid + 1;
            } else if (mid < a[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
