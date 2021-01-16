package com.puzzle.tree;

/**
 * Date 17/01/2020
 * @author gauravenrich
 * Remove half nodes
 */
public class RemoveHalfNodes {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.left = new Node(71);
        LevelOrderTraversal.levelOrderTraversal(bt.root);
        System.out.println();
        bt.root = removeHalfNodes(bt.root);
        LevelOrderTraversal.levelOrderTraversal(bt.root);
        System.out.println();

    }

    private static Node removeHalfNodes(Node root) {
        if (root == null) {
            return null;
        }
        root.left = removeHalfNodes(root.left);
        root.right = removeHalfNodes(root.right);
        if (root.left != null && root.right == null) {
            root = root.left;
        }
        if (root.left == null && root.right != null) {
            root = root.right;
        }
        return root;
    }
}
