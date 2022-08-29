package com.puzzle.tree;

public class PrintLeafNodeLeftToRight {
    static void printLeafNodes(Node root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            System.out.println(root.data);
        }
        if(root.left!=null){
            printLeafNodes(root.left);
        }
        if(root.right!=null){
            printLeafNodes(root.right);
        }
    }
}
