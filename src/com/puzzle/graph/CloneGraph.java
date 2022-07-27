package com.puzzle.graph;

import java.util.*;

/**
 * leetcode 133. Clone Graph
 * @author gsinha
 * 28 july 2022
 */
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        map.put(node, new Node(node.val, new ArrayList<>()));
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            Node cloneNode = map.get(cur);
            for (Node n : cur.neighbors) {
                Node cloneNodeG = map.get(n);
                if (cloneNodeG == null) {
                    queue.add(n);
                    cloneNodeG = new Node(n.val);
                    map.put(n, cloneNodeG);
                }
                cloneNode.neighbors.add(cloneNodeG);
            }
        }
        return map.get(node);
    }
}
