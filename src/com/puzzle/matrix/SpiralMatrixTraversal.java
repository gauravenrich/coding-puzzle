package com.puzzle.matrix;

/**
 * Date 03/14/2021
 *
 * @author gauravenrich
 * Spiral Matrix Traversal Problem
 */
public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        int R = 3;
        int C = 6;
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        // Function Call
        spiralPrint(a.length, a[0].length, a);

    }

    private static void spiralPrint(int r, int c, int[][] a) {
        int k = 0;
        int l = 0;
        while (k < r && l < c) {
            for (int i = k; i < c; i++) {
                System.out.print(a[k][i] + " ");
            }
            k++;
            for (int i = k; i < r; i++) {
                System.out.print(a[i][c - 1] + " ");
            }
            c--;
            if (k < r) {
                for (int i = c - 1; i >= l; --i) {
                    System.out.print(a[r - 1][i] + " ");
                }
                r--;
            }
            if (l < c) {
                for (int i = r - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }
}
