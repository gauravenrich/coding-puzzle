package com.puzzle.matrix;

/**
 *  Date 03/14/2021
 *  @author gauravenrich
 *  Search Element In Matrix
 */

public class SearchElementInMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        search(mat,10);
    }

    private static void search(int[][] mat, int target) {
        int r=mat.length;
        int c=mat[0].length;
        int i=0;
        int j=c-1;
        while(i<r-1 && j>=0){
            if(target>mat[i][j]){
                i++;
            }
            if(target<mat[i][j]){
                j--;
            }
            if(target==mat[i][j]){
                System.out.println("Element "+target+" found at i= "+i+" j="+j);
                break;
            }
        }
    }
}
