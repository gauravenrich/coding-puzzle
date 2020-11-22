package com.puzzle.tree;

/**
 * Date 11/22/2020
 *
 * @author gauravenrich
 * Deepest Odd Level Leaf Tree Program
 */

public class DeepestOddLevelLeaf {

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
        System.out.println("Deepest Odd level "+deepestOddLevel(bt.root, 1));

    }

    private static int deepestOddLevel(Node root,int level){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null && (level&1)!=0){
            return level;
        }
        int lMax=deepestOddLevel(root.left,level+1);
        int rMax=deepestOddLevel(root.right,level+1);
        return Integer.max(lMax,rMax);
    }
}
