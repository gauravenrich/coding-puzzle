package com.puzzle.array;

import java.util.Arrays;

/**
 *  Date 03/13/2020
 *  @author gauravenrich
 *  Merge two sorted arrays with O(1) extra space
 */
public class Merge2SortedArrayWithoutExtraSpace {
    public static void main(String[] args) {
        int m = 4, n = 5;
        int[] a = {1, 3, 5, 7};
        int[] b = {0, 2, 6, 8, 9};
        merge(a,b,a.length,b.length);
        System.out.print("After Merging nFirst Array: ");
        System.out.println(Arrays.toString(a));
        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(b));

    }

    public static void merge(int a[], int b[], int m, int n) {
        for (int i = n - 1; i >= 0; i--) {
            int last = a[m - 1];
            int j;
            // find smallest element greater than b[i]
            for (j = m - 2; j >= 0 && b[i] < a[j]; j--) {
                a[j + 1] = a[j];
            }
            if (j != m - 2 || last>b[i]) {
                a[j+1]=b[i];
                b[i]=last;
            }
        }
    }
}
