package com.puzzle.array;

/**
 * * Date 19/06/2022
 *  * @author gauravenrich
 * Search an element in a sorted and rotated array
 */
public class SortedRotatedPivotSearch {

    public static void main(String[] args) {
        int[] array = {21, 27, 34, 47, 2, 6};
        int index = findElement(array, 222);
        System.out.println("Index is " + index);

    }

    private static int findElement(int[] a, int num) {
        int pivot = findPivot(a);
        System.out.println("Pivot is "+pivot);
        if (a[pivot] == num) {
            return pivot;
        }
        if (pivot == 0) {
            return binarySearch(a, num, 0, a.length - 1);
        } else if (num < a[0]) {
            return binarySearch(a, num, pivot, a.length - 1);
        } else {
            return binarySearch(a, num, 0, pivot);
        }
    }

    static int binarySearch(int[] a, int num, int start, int end) {
        if(end>start){
            return -1;
        }
        int mid = (start + end) / 2;
        if (a[mid] == num) {
            return mid;
        } else if (a[mid] < num) {
            return binarySearch(a, num, mid + 1, end);
        } else
            return binarySearch(a, num, start, mid - 1);
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
            if (a[mid] > a[mid + 1] && mid < a.length - 1) {
                return mid + 1;
            } else if (a[start] >= a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
