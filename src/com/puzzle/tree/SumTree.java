package com.puzzle.tree;

/**
 *  Date 08/28/2021
 *  @author gauravenrich
 *  Sum Tree
 */
public class SumTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(new Node(1));
        tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);
        System.out.println(toSumTree(tree.root));
        tree.inOrder(tree.root);
    }

   public static int toSumTree(Node node) {
        // Base case
        if (node == null)
            return 0;
        int old_val = node.data;
        node.data = toSumTree(node.left) + toSumTree(node.right);
        return node.data + old_val;
    }
}
