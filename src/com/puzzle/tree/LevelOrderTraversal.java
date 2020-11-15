package com.puzzle.tree;

/**
 * Date 11/13/2020
 * @author gauravenrich
 * Level Order Traversal Program
 *
 */
public class LevelOrderTraversal {

    public static void main(String args[]){

        BinaryTree bt=new BinaryTree(new Node(1));
        bt.root.left=new Node(2);
        bt.root.right=new Node(3);

        bt.root.right.left=new Node(6);
        bt.root.right.right=new Node(7);
        bt.root.right.right.right=new Node(71);

        levelOrderTraversal(bt.root);
        System.out.println();

    }

    public static void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }
        int height=heightTree(root);
        for(int i=1;i<=height;i++){
            levelOrderUtil(root,i);
        }
    }

    public static void levelOrderUtil(Node root,int level){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.print(root.data+" ");
        }
        else {
            levelOrderUtil(root.left,level-1);
            levelOrderUtil(root.right,level-1);

        }
    }

    private static int heightTree(Node root) {
        if(root==null){
            return 0;
        }
        int lh=heightTree(root.left);
        int rh=heightTree(root.right);
        if(lh>rh){
            return lh+1;
        }
        else
            return rh+1;
    }
}
