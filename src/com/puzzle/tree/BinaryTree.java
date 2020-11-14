package com.puzzle.tree;

public class BinaryTree {

    Node root;

    public BinaryTree(Node h) {
        root=h;
    }

    public void preOrder(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public void inOrder(Node root)
    {
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    public void postOrder(Node root)
    {
        if(root==null)
            return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");

    }
}
