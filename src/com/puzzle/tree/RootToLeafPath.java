package com.puzzle.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Date 11/13/2020
 *
 * @author gauravenrich
 *  Root to Leaf Path Program
 */

public class RootToLeafPath {

    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.right = new Node(71);
        bt.root.right.right.right.left = new Node(75);
        bt.inOrder(bt.root);
        System.out.println();
        List<Integer> list = new ArrayList<>();
        System.out.println("Root to Leaf Paths are : ");
        rootToLeaf(bt.root, list);

    }

    public static void rootToLeaf(Node root, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.data);
        if (root.left == null && root.right == null) {
            printRootToLeaf(list);
            System.out.println();
        }
        rootToLeaf(root.left, list);
        rootToLeaf(root.right, list);

    }

    private static void printRootToLeaf(List<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
