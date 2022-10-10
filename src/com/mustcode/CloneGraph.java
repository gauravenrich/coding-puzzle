package com.mustcode;

import java.util.*;

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

    public Node cloneGraph(Node root) {
        if (root == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        map.put(root, new Node(root.val, new ArrayList<>()));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
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
        return map.get(root);
    }
}
