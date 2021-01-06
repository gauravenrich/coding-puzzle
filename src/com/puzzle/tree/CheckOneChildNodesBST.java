package com.puzzle.tree;

/**
 * Date 06/01/2020
 * @author gauravenrich
 * Checks if each internal node of BST has only one child without actually building the tree. Runs in O(n) time.
 *
 * check if all elements in the sub-array from [i+1 to end] of the array
 * are less than current element - preorder[i]. If not, all these elements should
 * be greater than the current element.
 */

public class CheckOneChildNodesBST {
    public static void main(String[] args){

        int[] preorderTree1 = {9,8,7,6,5};
        System.out.println("Check if every internal node of this BST has only one child:\n" + checkOneChildNodesBST(preorderTree1));
    }

    private static boolean checkOneChildNodesBST(int[] preorderTree) {
        int n=preorderTree.length;
        int maxSoFar=preorderTree[preorderTree.length-1];
        int minSoFar=preorderTree[preorderTree.length-1];
        for(int i=n-2;i>=0;i--){
            if(!(preorderTree[i]>maxSoFar || preorderTree[i]<minSoFar)){
                return false;
            }
            maxSoFar=Integer.max(maxSoFar,preorderTree[i]);
            minSoFar=Integer.min(minSoFar,preorderTree[i]);
        }
        return true;
    }
}
