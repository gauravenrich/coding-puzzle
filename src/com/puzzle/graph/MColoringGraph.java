package com.puzzle.graph;

/**
 *     Create following graph and
 *            test whether it is
 *            3 colorable
 *           (3)---(2)
 *            |   / |
 *            |  /  |
 *            | /   |
 *           (0)---(1)
 *
 */
public class MColoringGraph {
    public static void main(String[] args) {
        MColoringGraph coloringGraph
                = new MColoringGraph();
        int graph[][] = {
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 },
                { 1, 1, 0, 1 },
                { 1, 0, 1, 0 },
        };
        int m = 3; // Number of colors
        coloringGraph.graphColoring(graph, m);
    }

    private void graphColoring(int[][] graph, int m) {
    }
}
