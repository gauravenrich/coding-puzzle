package com.puzzle.graph;

/**
 * Create following graph and
 * test whether it is
 * 3 colorable
 * (3)---(2)
 * |   / |
 * |  /  |
 * | /   |
 * (0)---(1)
 */
public class MColoringGraph {
    public static void main(String[] args) {
        MColoringGraph coloringGraph
                = new MColoringGraph();
        boolean[][] graph = {
                {false, true, true, true},
                {true, false, true, false},
                {true, true, false, true},
                {true, false, true, false},
        };
        int m = 3; // Number of colors
        System.out.println(coloringGraph.graphColoring(graph, m, m));
    }

    public boolean graphColoring(boolean[][] graph, int m, int n) {
        // Your code here
        int[] color = new int[n];
        return solve(0, color, m, n, graph);
    }

    private boolean solve(int node, int[] color, int m, int n, boolean[][] graph) {
        if (node == n) {
            return true;
        }
        for (int i = 1; i <= m; i++) {
            if (isSafe(node, color, graph, n, i)) {
                color[node] = i;
                if (solve(node + 1, color, m, n, graph)) {
                    return true;
                }
                color[node] = 0;
            }
        }
        return false;
    }

    boolean isSafe(int node, int[] color, boolean[][] graph, int n, int col) {
        for (int i = 0; i < n; i++) {
            if (i != node && graph[i][node] && color[i] == col) {
                return false;
            }
        }
        return true;
    }
}
