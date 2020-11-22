package com.puzzle.tree;

/**
 * Date 11/22/2020
 *
 * @author gauravenrich
 * Left Leaf summ Tree Program
 */

public class SumLeftLeaves {

    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.right = new Node(71);
        int[] a = new int[1];
        leftLeafSum(bt.root, a);
        System.out.println("sum is " + a[0]);
    }

    private static void leftLeafSum(Node root, int a[]) {
        if (root == null) {
            return;
        }
        if (isLeaf(root.left)) {
            a[0] = a[0] + root.left.data;
        }
        leftLeafSum(root.left, a);
        leftLeafSum(root.right, a);
    }

    private static boolean isLeaf(Node node) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            return true;
        }
        return false;
    }
}
