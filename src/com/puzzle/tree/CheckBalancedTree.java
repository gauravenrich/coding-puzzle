package com.puzzle.tree;

/**
 * * Date 29/06/2022
 * * @author gauravenrich
 * * Check Balanced Tree
 */
public class CheckBalancedTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.left = new Node(71);
        LevelOrderTraversal.levelOrderTraversal(bt.root);
        System.out.println();
        CheckBalancedTree balancedTree = new CheckBalancedTree();
        System.out.println(balancedTree.isBalanced(bt.root));
    }

    boolean isBalanced(Node root) {
        // Your code here
        if (root == null) {
            return true;
        }
        boolean l = isBalanced(root.left);
        if (!l) {
            return false;
        }
        boolean r = isBalanced(root.right);
        if (!r) {
            return false;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.abs(lh - rh) <= 1;


    }

    int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        if (lh > rh) {
            return lh + 1;
        } else {
            return rh + 1;
        }
    }
}
