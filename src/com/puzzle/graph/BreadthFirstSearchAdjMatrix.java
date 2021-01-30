package com.puzzle.graph;

import com.puzzle.graph.common.Graph;

/**
 *  Date 30/01/2020
 *  @author gauravenrich
 *  BFS Using adj matrix
 */
public class BreadthFirstSearchAdjMatrix {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(1, 3);

        System.out.println("Graph BFS");
        graph.bfs();
        System.out.println();
    }
}
