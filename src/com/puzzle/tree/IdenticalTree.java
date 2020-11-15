package com.puzzle.tree;

/**
 * Date 11/13/2020
 *
 * @author gauravenrich
 * Identical Tree Program
 */

public class IdenticalTree {

    public static void main(String args[]) {

        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.right = new Node(71);
        bt.inOrder(bt.root);
        System.out.println();
        System.out.println(isIdentical(bt.root, bt.root));
    }

    public static boolean isIdentical(Node r1, Node r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 == null)
            return false;
        if (r2 == null) {
            return false;
        }
        return (
                (r1.data == r2.data)
                        && (isIdentical(r1.left, r2.left))
                        && (isIdentical(r1.right, r2.right))
        );
    }

}
