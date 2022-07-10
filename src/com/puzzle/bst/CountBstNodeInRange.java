package com.puzzle.bst;

public class CountBstNodeInRange {
    int count=0;
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        //Your code here
        if(root==null){
            return 0;
        }
        getCount(root.left,l,h);
        if(root.key>=l && root.key<=h){
            count++;
        }
        getCount(root.right,l,h);
        return count;
    }
}
