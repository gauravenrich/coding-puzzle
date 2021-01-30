package com.puzzle.graph.common.adjmatrix;

/**
 *  Date 30/01/2020
 *  @author gauravenrich
 *  Vertex
 */
public class Vertex {

    private boolean isVisited;
    private char label;

    public Vertex(char label) {
        this.isVisited = false;
        this.label = label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }
}
