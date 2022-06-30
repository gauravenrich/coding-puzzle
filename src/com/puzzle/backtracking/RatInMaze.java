package com.puzzle.backtracking;

/**
 * @author gsinha
 */
public class RatInMaze {
    public static void main(String[] args) {
        RatInMaze rat = new RatInMaze();
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        int n = maze.length;
        rat.solveMaze(maze,n);
    }

    private void solveMaze(int[][] maze, int n) {

    }
}
