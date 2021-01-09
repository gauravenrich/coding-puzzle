package com.puzzle.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Date 09/01/2020
 * @author gauravenrich
 * Top View of Binary Tree using level order traversal
 */
public class TopViewUsingLevelOrder {

    class MapEntry {
        Node node;
        int horizontalDistance;

        public MapEntry(Node node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
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
        Map<Integer, Integer> entryMap = new TreeMap<>();
        TopViewUsingLevelOrder topViewUsingLevelOrder=new TopViewUsingLevelOrder();
        topViewUsingLevelOrder.fillTreeMap(root, entryMap);

        for(Map.Entry<Integer,Integer> entry:entryMap.entrySet()){
            System.out.print(entry.getValue()+" ");
        }
    }

    private void fillTreeMap(Node root, Map<Integer, Integer> entryMap) {
        if (root == null) {
            return;
        }
        Queue<MapEntry> queue=new LinkedList<>();
        queue.add(new MapEntry(root,0));

        while (!queue.isEmpty()){
            MapEntry curMapEntry=queue.remove();
            Integer curEntry=entryMap.get(curMapEntry.horizontalDistance);
            if(curEntry==null){
                entryMap.put(curMapEntry.horizontalDistance,curMapEntry.node.data);
            }
            if(curMapEntry.node.left!=null){
                queue.add(new MapEntry(curMapEntry.node.left, curMapEntry.horizontalDistance-1));
            }
            if(curMapEntry.node.right!=null){
                queue.add(new MapEntry(curMapEntry.node.right,curMapEntry.horizontalDistance+1));
            }
        }
    }
}
