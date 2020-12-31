package com.puzzle.dynamic;

/**
 * Date 01/01/2021
 * @author gauravenrich
 * Rod Cutting Problem
 */

public class RodCuttingProblem {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is " +
                cutRod(arr, size));
    }

    private static int cutRod(int[] arr, int n) {
        if(arr==null || n==0){
            return 0;
        }
        int[] length = new int[n];
        for (int i = 0; i < n; i++) {
            length[i] = i+1 ;
        }
        int[][] t = new int[n + 1][n + 1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n+1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (j >= length[i - 1]) {
                    t[i][j] = Integer.max(arr[i - 1] + t[i][j - length[i - 1]], t[i - 1][j] );
                } else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][n];
    }
}
