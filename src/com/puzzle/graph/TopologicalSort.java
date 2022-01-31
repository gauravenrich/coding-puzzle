package com.puzzle.graph;

import com.puzzle.graph.common.adjlist.Graph;


public class TopologicalSort {
    public static void main(String[] args) {
        // Create a graph given in the above diagram
        int nodes = 7;
        com.puzzle.graph.common.adjlist.Graph a = new Graph(nodes);
        a.addEdge(0, 1);
        a.addEdge(0, 2);
        a.addEdge(1, 3);
        a.addEdge(2, 4);
        a.addEdge(3, 5);
        a.addEdge(4, 5);
        a.addEdge(4, 6);

        a.bfs(0);
        System.out.println();
        a.topologicalSort();

    }


}
