package com.puzzle.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Date 11/23/2020
 *  @author gauravenrich
 *  Rotate Array
 */


public class RotateArray {

    public static void main(String args[]) {

        int array[] = {21, 32, 43, 74, 75, 86, 97, 108, 149};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = s.nextInt();
        rotateArray(array, n % array.length);
        System.out.println(Arrays.toString(array));
    }

    private static void rotateArray(int[] a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("k cannot be negative!");
        }

        if (a == null || a.length < 2) {
            return;
        }
        reverseArray(a, 0, n - 1);
        reverseArray(a, n, a.length - 1);
        reverseArray(a, 0, a.length - 1);

    }

    private static void reverseArray(int[] a, int start, int end) {
        while (start <= end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

    }
}
