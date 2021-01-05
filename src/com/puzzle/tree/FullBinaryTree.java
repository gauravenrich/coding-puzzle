package com.puzzle.tree;

/**
 * Date 05/01/2021
 *
 * @author gauravenrich
 * Full Binary Tree
 * A binary tree is a full binary tree if all its nodes have either both children or no children.
 * In other words, if any of its node has only one child then it is not a full binary tree.
 */
public class FullBinaryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.inOrder(bt.root);
        System.out.println();
        if (isFullBinaryTree(bt.root)) {
            System.out.println("This is Full Binary Tree ");
        } else {
            System.out.println("This is not a Full Binary Tree ");
        }
    }

    private static boolean isFullBinaryTree(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right != null) {
            return false;
        } else if (root.left != null && root.right == null) {
            return false;
        } else
            return isFullBinaryTree(root.left) && isFullBinaryTree(root.right);
    }
}
