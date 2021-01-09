package com.puzzle.tree;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


/**
 * Date 09/01/2020
 * @author gauravenrich
 * Top View of Binary Tree using map Program
 */

public class TopView {
    class MapEntry {
        int nodeValue;
        int nodeLevel;
        public MapEntry(int value, int level) {
            nodeValue = value;
            nodeLevel = level;
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.left = new Node(71);
        LevelOrderTraversal.levelOrderTraversal(bt.root);
        System.out.println();
        printTopView(bt.root);
    }

    private static void printTopView(Node root) {
        TopView topView = new TopView();
        Map<Integer, MapEntry> map = new TreeMap<>();
        topView.fillTreeMap(root, map, 0, 0);
        for (Map.Entry<Integer, MapEntry> entry : map.entrySet()) {
            System.out.print(entry.getValue().nodeValue + " ");
        }
    }

    private void fillTreeMap(Node root, Map<Integer, MapEntry> map, int level, int horizontalDistance) {
        if (root == null) {
            return;
        }
        MapEntry mapEntry = map.get(horizontalDistance);
        MapEntry nodeEntry = new MapEntry(root.data, level);
        if (mapEntry != null) {
            if (mapEntry.nodeLevel > level) {
                map.put(horizontalDistance, nodeEntry);
            }
        } else {
            map.put(horizontalDistance, nodeEntry);
        }
        fillTreeMap(root.left,map,level+1,horizontalDistance-1);
        fillTreeMap(root.right,map,level+1,horizontalDistance+1);

    }
}
