package com.puzzle.bst;

/**
 * Check whether BST contains Dead End
 * 16th july 2022
 */
public class CheckBstDeadEnd {
    public static void main(String[] args) {

    }

    public static boolean isDeadEnd(Node root){
        if(root==null){
            return false;
        }
        return helper(root,1,Integer.MAX_VALUE);
    }

    private static boolean helper(Node root, int min, int max) {
        if(root==null){
            return false;
        }
        if(max==min){
            return true;
        }
        return helper(root.left,min,root.key-1)||helper(root.right,root.key+1,max);
    }
}
