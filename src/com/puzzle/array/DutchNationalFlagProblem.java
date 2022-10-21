package com.puzzle.array;

/**
 * Date 03/13/2020
 *
 * @author gauravenrich
 * Sort an array of 0s, 1s and 2s
 */
public class DutchNationalFlagProblem {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr_size = arr.length;
        sort012(arr, arr_size);
        System.out.println("Array after segregation ");
        for (int j : arr)
            System.out.print(j + " ");
    }

    private static void sort012(int[] a, int n) {
        int start = 0;
        int end = n - 1;
        int mid = 0;
        while (mid <= end) {
            switch (a[mid]) {
                case 0: {
                    swapElement(a, start, mid);
                    start++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swapElement(a, mid, end);
                    end--; // processing is not done yet so we are not doing mid-- as it can be 1 that can be swapped
                    break;
                }
            }
        }
    }

    private static void swapElement(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
