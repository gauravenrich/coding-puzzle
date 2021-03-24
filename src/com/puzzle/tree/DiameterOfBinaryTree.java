package com.puzzle.tree;

/**
 * Date 24/03/2021
 *
 * @author gauravenrich
 *      1
 *     2  3
 *       6  7
 *
 */
public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.inOrder(bt.root);
        System.out.println();
        System.out.println("Diameter is " + diameter(bt.root));

    }

    private static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        return Integer.max(lh + rh + 1, Integer.max(ld, rd));
    }

    private static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Integer.max(lh, rh);
    }

}
