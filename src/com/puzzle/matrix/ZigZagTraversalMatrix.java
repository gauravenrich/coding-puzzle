package com.puzzle.matrix;

/**
 * @author gsinha
 *
 */
public class ZigZagTraversalMatrix {
    public static void main(String[] args) {
        int[][] M = {
                {1, 2, 3, 4}, {5, 6, 7, 8},
                {9, 10, 11, 12}, {13, 14, 15, 16},
                {17, 18, 19, 20},
        };
        System.out.print("Given matrix is \n");
        printMatrix(M);

        System.out.print(
                "\nDiagonal printing of matrix is \n");
        diagonalOrder(M);
    }

    private static void printMatrix(int[][] m) {
        for (int[] ints : m) {
            for (int j = 0; j < m[0].length; j++)
                System.out.print(ints[j] + " ");
            System.out.print("\n");
        }
    }

    private static void diagonalOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int line = 1;
             line <= (row + col - 1);
             line++) {

            // Get column index of the first
            // element in this line of output.
            // The index is 0 for first ROW
            // lines and line - ROW for remaining lines
            int start_col = Integer.max(0, line - row);

            // Get count of elements in this line.
            // The count of elements is equal to
            // minimum of line number, COL-start_col and ROW
            int count = Integer.min((Integer.min(line, (col - start_col))), row);

            // Print elements of this line
            for (int j = 0; j < count; j++)
                System.out.print(matrix[Integer.min(row, line)
                        - j - 1][start_col + j]
                        + " ");

            // Print elements of next diagonal on next line
            System.out.println();
        }

    }
}
