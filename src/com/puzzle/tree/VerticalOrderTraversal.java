package com.puzzle.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Date 15/01/2020
 *  *
 *  * @author gauravenrich
 *  Vertical Order Traversal
 */
public class VerticalOrderTraversal {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.left = new Node(71);
        LevelOrderTraversal.levelOrderTraversal(bt.root);
        System.out.println();
        VerticalOrderTraversal verticalOrderTraversal = new VerticalOrderTraversal();
        verticalOrderTraversal.printVerticalOrder(bt.root);
    }

    private void printVerticalOrder(Node root) {
        Map<Integer, List<Integer>> listMap=new TreeMap<>();
        fillMapUtil(root,listMap,0);
        for(Map.Entry<Integer,List<Integer>> listEntry:listMap.entrySet()){
            System.out.println(listEntry.getValue());
        }

    }

    private void fillMapUtil(Node root, Map<Integer, List<Integer>> listMap, int hd) {
        if(root==null){
            return;
        }
        List<Integer> list=listMap.get(hd);
        if(list==null){
            List<Integer> newList=new ArrayList<>();
            newList.add(root.data);
            listMap.put(hd,newList);
        }else {
            listMap.get(hd).add(root.data);
        }
        fillMapUtil(root.left,listMap,hd-1);
        fillMapUtil(root.right,listMap,hd+1);
    }
}
