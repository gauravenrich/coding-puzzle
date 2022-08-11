package com.puzzle.bst;

/**
 * @author gsinha
 * BST From PreOrder
 * 26 july 2022
 */
public class BSTFromPreOrder {
    public static void main(String[] args) {

    }
    public Node bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, Integer.MAX_VALUE, new int[]{0});
    }

    private Node bstFromPreorder(int[] preorder, int maxValue, int[] a) {
        if (a[0] == preorder.length || preorder[a[0]] > maxValue) {
            return null;
        }
        Node root = new Node(preorder[a[0]++]); // a[0] is variable to track the index
        root.left = bstFromPreorder(preorder, root.key, a);
        root.right = bstFromPreorder(preorder, maxValue, a);
        return root;
    }
}
