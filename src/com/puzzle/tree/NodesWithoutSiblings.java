package com.puzzle.tree;

/**
 * Date 11/15/2020
 * @author gauravenrich
 * Nodes without Siblings Program
 *
 */
public class NodesWithoutSiblings {

    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.right = new Node(7);
        bt.root.right.right.right = new Node(71);

        printNodesWithoutSiblings(bt.root);

    }

    private static void printNodesWithoutSiblings(Node root) {
        if(root==null){
            return;
        }
        if(root.right!=null && root.left==null){
            System.out.print(root.right.data+" ");
        }
        if(root.right==null && root.left!=null){
            System.out.print(root.left.data+" ");
        }
        printNodesWithoutSiblings(root.left);
        printNodesWithoutSiblings(root.right);

    }
}
