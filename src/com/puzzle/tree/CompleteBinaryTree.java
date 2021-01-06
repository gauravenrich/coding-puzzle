package com.puzzle.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(6);
        bt.root.left.right = new Node(7);
        bt.root.left.right.right = new Node(9);

        bt.inOrder(bt.root);
        System.out.println();
        if (isCompleteBinaryTree(bt.root)) {
            System.out.println("This is Complete Binary Tree ");
        } else {
            System.out.println("This is not a Complete Binary Tree ");
        }
    }

    private static boolean isCompleteBinaryTree(Node root) {
        Queue<Node> queue = new LinkedList<>();
        boolean nonFullNodeSeen=false;
        if (root == null) {
            return true;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curNode=queue.remove();
            // there should not be any non-leaf node after first non full-node is seen
            // some node has non leaf node before this
            if(curNode.left!=null && curNode.right!=null){
                if(nonFullNodeSeen){
                    return false;
                }
                queue.add(curNode.left);
                queue.add(curNode.right);
            }
            if(curNode.left!=null && curNode.right==null){
                if(nonFullNodeSeen){
                    return false;
                }
                nonFullNodeSeen=true; // First Non leaf node is seen
                queue.add(curNode.left);
            }
            // this should never be the case for a complete binary tree
            if(curNode.left==null && curNode.right!=null){
                    return false;
            }
        }
        return true;
    }
}
