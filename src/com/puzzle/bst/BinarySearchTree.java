package com.puzzle.bst;

/**
 * @author gsinha
 * 25/06/2022
 * BST Program
 */
public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private Node insertRec(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.key > val) {
            root.left = insertRec(root.left, val);
        } else if (root.key < val) {
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root == null) {
            return;
        }
        inorderRec(root.left);
        System.out.print(root.key + " ");
        inorderRec(root.right);
    }

    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
}
