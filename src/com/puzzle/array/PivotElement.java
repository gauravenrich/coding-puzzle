package com.puzzle.array;

/**
 * Date 11/25/2020
 *
 * @author gauravenrich
 * Pivot Element
 */
public class PivotElement {

    public static void main(String[] args) {
        int[] array = {21, 27, 34, 47, 54, 66};
        int pivot = findPivot(array);
        System.out.println(array[pivot]);
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
