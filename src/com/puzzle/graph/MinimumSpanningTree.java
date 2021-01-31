package com.puzzle.graph;

import com.puzzle.graph.common.adjmatrix.Graph;

/**
 *  Date 31/01/2020
 *  @author gauravenrich
 *  Minimum spanning tree program
 */
public class MinimumSpanningTree {

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

        System.out.println("Minimum spanning tree is ");
        mst(graph);
        System.out.println();

    }

    public static void mst(Graph graph) {
        graph.getVertexList()[0].setVisited(true);
        graph.getStack().push(0);
        while (!graph.getStack().isEmpty()) {
            int cur = graph.getStack().peek();
            int visited = graph.getAdjUnvisitedVertex(cur);
            if (visited == -1) {
                graph.getStack().pop();
            } else {
                graph.getVertexList()[visited].setVisited(true);
                graph.displayVertex(cur);
                graph.displayVertex(visited);
                System.out.print(" ");
                graph.getStack().push(visited);
            }
        }
    }
}
