package com.puzzle.graph;

import java.util.ArrayList;

/**
 * @author gsinha
 * Detect Cycle In Undirected Graph
 * 22 july 2022
 */
public class DetectCycleInUndirectedGraph {
    public static void main(String[] args) {

    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,-1,adj,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int cur, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[cur]=true;
        for(int j:adj.get(cur)){
            if(!visited[j]){
                if(dfs(j,cur,adj,visited)){
                    return true;
                }
            }else {
                if(parent!=j){
                    return true;
                }
            }
        }
        return false;
    }
}
