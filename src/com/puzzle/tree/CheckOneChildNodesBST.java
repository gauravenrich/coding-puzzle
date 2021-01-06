package com.puzzle.tree;

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
