package com.puzzle.matrix;

import java.util.HashMap;
import java.util.Map;

/**
 *  Date 03/19/2021
 *  @author gauravenrich
 *  Common elements in all rows of a given matrix
 */
public class CommonElementOfAllRows {
    public static void main(String[] args) {
        int mat[][] =
                {
                        {1, 2, 1, 4, 8},
                        {3, 7, 8, 5, 1},
                        {8, 7, 7, 3, 1},
                        {8, 1, 2, 7, 9},
                };

        printCommonElements(mat);
    }

    private static void printCommonElements(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(a[0][i], 1);
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (hm.containsKey(a[i][j]) && hm.get(a[i][j]) == i) {
                    hm.put(a[i][j], i + 1);
                    // Since in last row its conclusive that the element is present in all rows
                    if (i == m - 1) {
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
        }

    }

}
