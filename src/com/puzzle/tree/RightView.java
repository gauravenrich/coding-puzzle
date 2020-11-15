package com.puzzle.tree;

/**
 * Date 11/16/2020
 * @author gauravenrich
 * Tree Right View
 *
 */
public class RightView {

    static int maxLevel = -1;

    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.right = new Node(71);
        rightView(bt.root, 0);
        System.out.println();
    }

    public static void rightView(Node root, int curLevel) {
        if (root == null) {
            return;
        }
        if (curLevel > maxLevel) {
            System.out.print(root.data + " ");
            maxLevel = curLevel;
        }
        rightView(root.right, curLevel + 1);
        rightView(root.left, curLevel + 1);

    }
}
