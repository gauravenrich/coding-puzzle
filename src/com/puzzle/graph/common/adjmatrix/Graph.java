package com.puzzle.graph.common.adjmatrix;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *  Date 30/01/2020
 *  @author gauravenrich
 *  Graph
 */
public class Graph {
    private final int MAX_VERTEX = 20;
    private int numberOfVertices;
    private Stack<Integer> stack;
    private Vertex[] vertexList;
    private int[][] adjMatrix;
    private Queue<Integer> queue;

    public Graph() {
        numberOfVertices = 0;
        adjMatrix = new int[MAX_VERTEX][MAX_VERTEX];
        vertexList = new Vertex[MAX_VERTEX];
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public void setNumberOfVertices(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
    }

    public Stack<Integer> getStack() {
        return stack;
    }

    public void setStack(Stack<Integer> stack) {
        this.stack = stack;
    }

    public Vertex[] getVertexList() {
        return vertexList;
    }

    public void setVertexList(Vertex[] vertexList) {
        this.vertexList = vertexList;
    }

    public int[][] getAdjMatrix() {
        return adjMatrix;
    }

    public void setAdjMatrix(int[][] adjMatrix) {
        this.adjMatrix = adjMatrix;
    }

    public void addVertex(char label) {
        vertexList[numberOfVertices++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].getLabel() + " ");
    }

    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < numberOfVertices; j++) {
            if (adjMatrix[v][j] == 1 && vertexList[j].isVisited() == false) {
                return j;
            }
        }
        return -1;
    }

    public void dfs() {
        vertexList[0].setVisited(true);
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int cur = stack.peek();
            int adj = getAdjUnvisitedVertex(cur);
            if (adj == -1) {
                stack.pop();
            } else {
                vertexList[adj].setVisited(true);
                displayVertex(adj);
                stack.push(adj);
            }
        }
    }

    public void bfs() {
        vertexList[0].setVisited(true);
        queue.add(0);
        displayVertex(0);
        int childLevel;
        while (!queue.isEmpty()){
            int curLevel = queue.remove();
            while((childLevel=getAdjUnvisitedVertex(curLevel))!=-1) {
                vertexList[childLevel].setVisited(true);
                displayVertex(childLevel);
                queue.add(childLevel);
            }
        }
    }
}
