package com.puzzle.tree;

import java.util.Map;
import java.util.TreeMap;
/**
        1
      2    3
         6   7
           71
 * Date 14/01/2020
 * @author gauravenrich
 * Bottom View of Binary Tree using map Program
*/
public class BinaryTreeBottomView {

     class EntryItem {
        int NodeValue;
        int level;
         public EntryItem(int nodeValue, int level) {
             NodeValue = nodeValue;
             this.level = level;
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
        BinaryTreeBottomView bottomView=new BinaryTreeBottomView();
        bottomView.printBottomView(bt.root);
    }

    private void printBottomView(Node root) {
        if (root == null) {
            return;
        }
        Map<Integer, EntryItem> itemMap = new TreeMap<>();
        fillEntryMap(root, itemMap, 0, 0);
        for(Map.Entry<Integer,EntryItem> entry:itemMap.entrySet()){
            System.out.print(entry.getValue().NodeValue +" ");
        }
    }

    private void fillEntryMap(Node root, Map<Integer, EntryItem> itemMap, int level, int horizontalDistance) {
        if (root == null) {
            return;
        }
        EntryItem item = itemMap.get(horizontalDistance);
        EntryItem newEntryItem= new EntryItem(root.data,horizontalDistance);
        if (item != null) {
            if(level>item.level){
                itemMap.put(horizontalDistance,newEntryItem);
            }
        }else {
            itemMap.put(horizontalDistance,newEntryItem);
        }
        fillEntryMap(root.left,itemMap,level+1,horizontalDistance-1);
        fillEntryMap(root.right,itemMap,level+1,horizontalDistance+1);

    }
}
