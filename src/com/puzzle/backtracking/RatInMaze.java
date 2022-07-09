package com.puzzle.backtracking;

/**
 * @author gsinha
 * 9th july 2022
 */
public class RatInMaze {
    public static void main(String[] args) {
        RatInMaze rat = new RatInMaze();
        int[][] maze = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}};

        int n = maze.length;
        System.out.println(rat.solveMaze(maze, n));
    }

    private boolean solveMaze(int[][] maze, int n) {
        int[][] sol = new int[n][n];
        if (!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.println("Path doesn't exist");
            return false;
        }
        printSolution(sol);
        return true;
    }

    private void printSolution(int[][] sol) {
        for (int[] ints : sol) {
            for (int j = 0; j < sol[0].length; j++)
                System.out.print(
                        " " + ints[j] + " ");
            System.out.println();
        }
    }

    private boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
        int n = maze.length;
        if (x == n - 1 && y == n - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y)) {
            if (sol[x][y] == 1) {
                return false;
            }
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }
            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    private boolean isSafe(int[][] maze, int x, int y) {
        int n = maze.length;
        return x < n && y < n && maze[x][y] == 1;
    }
}
