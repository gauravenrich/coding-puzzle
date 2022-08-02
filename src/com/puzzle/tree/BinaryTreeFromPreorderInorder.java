package com.puzzle.tree;

/**
 * @author gsinha
 * Binary Tree From Preorder and Inorder traversal
 */
public class BinaryTreeFromPreorderInorder {
    public static void main(String[] args) {

    }

    public Node buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, preorder.length - 1, preorder, inorder);
    }

    public Node helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {

        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        Node root = new Node(preorder[preStart]);
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (root.data == inorder[i]) {
                inIndex = i;
                break;
            }
        }
        root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
        return root;

    }
}
