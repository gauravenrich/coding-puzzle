package com.puzzle.tree;

/**
 * Date 15/01/2020
 * @author gauravenrich
 * Remove the nodes of binary search tree which are outside the given range
 */
public class RemoveOutOfRangeNodesBST {

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree(new Node(8));
        bt.root.left = new Node(5);
        bt.root.left.left = new Node(2);
        bt.root.left.right = new Node(7);
        bt.root.left.right.left = new Node(6);

        bt.root.right = new Node(11);
        bt.root.right.left = new Node(9);
        bt.root.right.left.right = new Node(10);
        bt.root.right.right = new Node(12);
        bt.root.right.right.right = new Node(13);
        LevelOrderTraversal.levelOrderTraversal(bt.root);
        System.out.println("");
        System.out.println("--------");
        bt.root=removeOutOfRangeNodes(bt.root,2,6);
        LevelOrderTraversal.levelOrderTraversal(bt.root);
    }

    private static Node removeOutOfRangeNodes(Node root, int min, int max) {
        if(root==null){
            return null;
        }
        root.left=removeOutOfRangeNodes(root.left,min,max);
        root.right=removeOutOfRangeNodes(root.right,min,max);
        if(root.data<min) {
            return root.right;
        }
        if(root.data>max){
            return root.left;
        }
        return root;
    }
}
