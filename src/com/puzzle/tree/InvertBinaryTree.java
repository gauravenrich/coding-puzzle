package com.puzzle.tree;
/**
 * Date 11/15/2020
 *
 * @author gauravenrich
 * Mirror Tree Program
 */
public class MirrorTree {

    public static void main(String args[]){
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.right = new Node(71);
        LevelOrderTraversal.levelOrderTraversal(bt.root);
        System.out.println();
        mirrorOfTree(bt.root);
        LevelOrderTraversal.levelOrderTraversal(bt.root);
    }

    private static void mirrorOfTree(Node root) {
        if(root==null)
            return;
        else
        {
            mirrorOfTree(root.left);
            mirrorOfTree(root.right);
            Node temp=root.left;
            root.left=root.right;
            root.right=temp;
        }

    }
}
