package com.puzzle.matrix;

import com.puzzle.heap.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode 73. Set Matrix Zeroes
 * 3rd July 2022
 */
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        SetMatrixZeroes matrixZeroes=new SetMatrixZeroes();
        matrixZeroes.setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void setZeroes(int[][] matrix) {
        List<Pair> pairList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    pairList.add(new Pair(i, j));
                }
            }
        }
        for(Pair p:pairList){
            for(int i=0;i<matrix.length;i++){
                matrix[i][p.getValue()]=0;
            }
            for(int j=0;j<matrix[0].length;j++){
                matrix[p.getKey()][j]=0;
            }
        }
    }
}
