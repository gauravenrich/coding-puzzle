package com.puzzle.graph.common.generic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    private Map<T, List<T>> map=new HashMap<>();
    public void vertexCount(){
        System.out.println("Total Vertex count is "+map.keySet().size());
    }
    public void addVertex(T source){
        map.put(source,new LinkedList<>());
    }
    public void addEdge(T source,T destination,boolean isBidirectional){
        if(!map.containsKey(source)){
            addVertex(source);
        }
        if(!map.containsKey(destination)){
            addVertex(destination);
        }
        map.get(source).add(destination);
        if(isBidirectional){
            map.get(destination).add(source);
        }
    }

}
