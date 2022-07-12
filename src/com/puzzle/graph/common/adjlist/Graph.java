package com.puzzle.graph.common.adjlist;

import java.util.*;

/**
 * Date 30/01/2020
 *
 * @author gauravenrich
 * DFS Using adj list
 */
public class Graph {
    private final List<List<Integer>> graph;
    boolean[] isVisited;

    public Graph(int nodes) {
        graph = new ArrayList<>();
        isVisited = new boolean[nodes];
        for (int i = 0; i < nodes; i++) {
            graph.add(i, new ArrayList<>());
        }
    }

    public void addEdge(int start, int end) {
        graph.get(start).add(end);
        graph.get(end).add(start);
    }

    public void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        isVisited[start] = true;
        while (!stack.isEmpty()) {
            Integer node = stack.pop();
            System.out.print(node + " ");
            List<Integer> list = graph.get(node);
            for (Integer cur : list) {
                if (!isVisited[cur]) {
                    stack.push(cur);
                    isVisited[cur] = true;
                }
            }
        }
    }

    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        isVisited[start] = true;
        while (!queue.isEmpty()) {
            int adj = queue.remove();
            System.out.print(adj + " ");
            List<Integer> list = graph.get(adj);
            for (Integer cur : list) {
                if (!isVisited[cur]) {
                    queue.add(cur);
                    isVisited[cur] = true;
                }
            }
        }
    }

    // A recursive function used by topologicalSort
    void topologicalSortUtil(int v, boolean[] visited,
                             Stack<Integer> stack) {
        // Mark the current node as visited.
        visited[v] = true;
        Integer i;

        for (Integer integer : graph.get(v)) {
            i = integer;
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }

        // Push current vertex to stack
        // which stores result
        stack.push(v);
    }

    // The function to do Topological Sort.
    // It uses recursive topologicalSortUtil()
    public void topologicalSort() {
        Stack<Integer> stack = new Stack<>();

        // Mark all the vertices as not visited

        for (int i = 0; i < graph.size(); i++)
            isVisited[i] = false;

        // Call the recursive helper
        // function to store
        // Topological Sort starting
        // from all vertices one by one
        for (int i = 0; i < graph.size(); i++)
            if (!isVisited[i])
                topologicalSortUtil(i, isVisited, stack);

        // Print contents of stack
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
