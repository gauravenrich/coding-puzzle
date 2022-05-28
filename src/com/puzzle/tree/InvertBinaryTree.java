package com.puzzle.tree;
/**
 * Date 11/15/2020
 *
 * @author gauravenrich
 * Mirror Tree Program
 */
public class InvertBinaryTree {

    public static void main(String[] args){
        InvertBinaryTree invertBinaryTree=new InvertBinaryTree();
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.right = new Node(71);

        System.out.println("Original tree");
        LevelOrderTraversal.levelOrderTraversal(bt.root);
        System.out.println();
        mirrorOfTree(bt.root);
        System.out.println("Inverted tree");
        LevelOrderTraversal.levelOrderTraversal(bt.root);
        System.out.println();
        System.out.println("Inverted again");
        bt.root= invertBinaryTree.invertTree(bt.root);
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

    private Node invertTree(Node root){
        if(root==null){
            return  null;
        }
        root.left=invertTree(root.left);
        root.right=invertTree(root.right);
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        return root;
    }


}
