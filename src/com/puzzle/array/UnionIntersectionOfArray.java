package com.puzzle.array;

/**
 *  Date 03/13/2020
 *  @author gauravenrich
 *  Uninon and Intersection of two sorted array
 */
public class UnionIntersectionOfArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 14, 15};
        int[] b = {1, 2, 3, 5, 14};
        doUnion(a, b);
        System.out.println();
        doIntersection(a, b);
        System.out.println();
    }

    public static void doUnion(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                System.out.print(a[i++] + " ");
            } else if (b[j] < a[i]) {
                System.out.print(b[j++] + " ");
            } else {
                System.out.print(b[j++] + " ");
                i++;
            }
        }
        while (i < n) {
            System.out.print(a[i++] + " ");
        }
        while (j < m) {
            System.out.print(b[j++] + " ");
        }
    }

    public static void doIntersection(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                System.out.print(b[j] + " ");
                i++;
                j++;
            }
        }
    }

}