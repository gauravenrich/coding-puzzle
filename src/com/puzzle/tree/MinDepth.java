package com.puzzle.tree;

public class MinDepth {

    public static void main(String args[]){

        BinaryTree bt=new BinaryTree(new Node(1));
        bt.root.left=new Node(2);
        bt.root.right=new Node(3);

        bt.root.right.left=new Node(6);
        bt.root.right.right=new Node(7);
        System.out.println();

        int min=minDepth(bt.root);
        System.out.println(min);

    }

    public static int minDepth(Node root){
        if (root==null){
            return 0;
        }
        else
        {
            int lDepth=minDepth(root.left);
            int rDepth=minDepth(root.left);
            if(lDepth>rDepth){
                return 1+rDepth;
            }
            else
                return 1+lDepth;


        }
    }

}
