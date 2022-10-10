package com.mustcode;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        NumberOfIslands obj = new NumberOfIslands();
        System.out.println(obj.numIslands(grid));
    }

    public int numIslands(char[][] grid) {
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                total += dfs(grid, i, j);
            }
        }
        return total;
    }

    private int dfs(char[][] grid, int i, int j) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return 0;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
        return 1;
    }
}
