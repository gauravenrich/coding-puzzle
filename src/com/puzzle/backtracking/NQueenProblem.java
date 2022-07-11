package com.puzzle.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueenProblem {
    public static void main(String[] args) {
        NQueenProblem nQueenProblem = new NQueenProblem();
        List<List<String>> result = nQueenProblem.solveNQueens(4);
        System.out.println(result);
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = '.';
            }
        }
        nQueenHelper(n, result, matrix, 0);
        return result;
    }

    private void nQueenHelper(int n, List<List<String>> result, char[][] matrix, int col) {
        if (col == n) {
            List<String> res = resultBuilder(matrix);
            result.add(res);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isValid(n, matrix, row, col)) {
                matrix[row][col] = 'Q';
                nQueenHelper(n, result, matrix, col + 1);
                matrix[row][col] = '.';
            }
        }
    }

    /*
    if we move forward (row-wise or col-wise, doesn't matter),
     we know that there is no queen there, because we haven't even reached there.
     We should only check in the opposite direction of where we are moving to check
     if there is a queen in any of three directions which I mentioned before.
     */
    private boolean isValid(int n, char[][] matrix, int row, int col) {
        for (int i = col; i >= 0; i--) {
            if (matrix[row][i] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> resultBuilder(char[][] matrix) {
        List<String> list = new ArrayList<>();
        for (char[] chars : matrix) {
            list.add(new String(chars));
        }
        return list;
    }
}
