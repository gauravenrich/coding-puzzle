package com.puzzle.backtracking;

public class LongestPossibleRoute {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
        LongestPossibleRoute possibleRoute = new LongestPossibleRoute();
        int res = possibleRoute.longestPath(matrix, matrix.length, matrix[0].length, 0, 0, 2, 6);
        System.out.println(res);
    }

    private int longestPath(int[][] matrix, int n, int m, int xs, int ys, int xd, int yd) {
        if (matrix[xs][ys] == 0 || matrix[xd][ys] == 0) {
            return -1;
        }
        int[] res = new int[1];
        helper(matrix, xs, ys, xd, yd, 0, res);
        return res[0];
    }

    private void helper(int[][] matrix, int xs, int ys, int xd, int yd, int ans, int[] res) {
        if(xs<0 || xs>=matrix.length || yd<0|| yd>= matrix[0].length){
            return;
        }
        if(matrix[xs][ys]==0 || matrix[xs][ys]==-1){
            return;
        }
        if (xs==xd && ys==yd){
            res[0]=Integer.max(res[0],ans);
        }
        matrix[xs][ys]=-1;
        helper(matrix, xs+1, ys, xd, yd, ans+1, res);
        helper(matrix, xs-1, ys, xd, yd, ans+1, res);
        helper(matrix, xs, ys+1, xd, yd, ans+1, res);
        helper(matrix, xs, ys-1, xd, yd, ans+1, res);
        matrix[xs][ys]=1;
    }
}
