package com.puzzle.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 *       1
 *    2      3
 *         6    7
 *           71
 * Date 14/01/2020
 *
 * @author gauravenrich
 * Bottom View of Binary Tree using level order
 */
public class BottomViewUsingLevelOrder {
    class MapEntry{
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
        BottomViewUsingLevelOrder bottomView = new BottomViewUsingLevelOrder();
        bottomView.printBottomViewLevelOrder(bt.root);
    }

    private void printBottomViewLevelOrder(Node root) {
        Map<Integer,Integer> mapEntryMap=new TreeMap<>();
        fillBottomViewTreeMap(root,mapEntryMap);
        for(Map.Entry<Integer,Integer> entry: mapEntryMap.entrySet()){
            System.out.print(entry.getValue()+ " ");
        }
    }

    private void fillBottomViewTreeMap(Node root, Map<Integer,Integer> mapEntryMap) {
        Queue<MapEntry> queue=new LinkedList<>();
        queue.add(new MapEntry(root,0));
        while (!queue.isEmpty()){
            MapEntry curEntry= queue.remove();
            mapEntryMap.put(curEntry.horizontalDistance, curEntry.node.data);
            if(curEntry.node.left!=null){
                queue.add(new MapEntry(curEntry.node.left,curEntry.horizontalDistance-1));
            }
            if(curEntry.node.right!=null){
                queue.add(new MapEntry(curEntry.node.right,curEntry.horizontalDistance+1));
            }
        }
    }
}
