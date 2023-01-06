package com.puzzle.array;

/**
 * Date 07/17/2021
 *
 * @author gauravenrich
 * Find Min and Max Elemement in array
 */

public class MaxAndMinElement {

    static Pair getMinMax(int[] arr, int n) {
        Pair minMax = new Pair();
        int i;
        /* If array has even numbers of elements then initialize the first two elements as minimum and maximum */
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                minMax.max = arr[0];
                minMax.min = arr[1];
            } else {
                minMax.min = arr[0];
                minMax.max = arr[1];
            }
            i = 2;
            /* set the starting index for loop */
        } /* If array has odd number of elements then
    initialize the first element as minimum and
    maximum */ else {
            minMax.min = arr[0];
            minMax.max = arr[0];
            i = 1;
            /* set the starting index for loop */
        }

        /* In the while loop, pick elements in pair and
     compare the pair with max and min so far */
        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minMax.max) {
                    minMax.max = arr[i];
                }
                if (arr[i + 1] < minMax.min) {
                    minMax.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > minMax.max) {
                    minMax.max = arr[i + 1];
                }
                if (arr[i] < minMax.min) {
                    minMax.min = arr[i];
                }
            }
            i += 2;
            /* Increment the index by 2 as two
               elements are processed in loop */
        }

        return minMax;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minMax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minMax.min);
        System.out.printf("\nMaximum element is %d", minMax.max);

    }

    static class Pair {

        int min;
        int max;
    }
}