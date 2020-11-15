package com.puzzle.tree;

/**
 * Date 11/15/2020
 * @author gauravenrich
 * Spiral Level Order Traversal Program
 *
 */

public class SpiralLevelOrder {

    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.right = new Node(71);

        spiralLevelOrderTraversal(bt.root);
        System.out.println();
    }

    public static void spiralLevelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        int h = heightTree(root);
        for (int i = 1; i <= h; i++) {
            boolean flag = (i % 2 == 0) ? true : false;
            spiralLevelOrderUtil(root, i, flag);
        }
    }

    private static void spiralLevelOrderUtil(Node root, int level, boolean flag) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");

        }

        if (!flag) {
            spiralLevelOrderUtil(root.left, level - 1, flag);
            spiralLevelOrderUtil(root.right, level - 1, false);

        }
        if (flag) {
            spiralLevelOrderUtil(root.right, level - 1, flag);
            spiralLevelOrderUtil(root.left, level - 1, flag);
        }

    }

    private static int heightTree(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = heightTree(root.left);
        int rh = heightTree(root.right);
        if (lh > rh) {
            return lh + 1;
        } else
            return rh + 1;
    }
}
