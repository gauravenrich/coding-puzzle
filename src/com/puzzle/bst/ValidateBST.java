package com.puzzle.bst;

public class ValidateBST {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
        ValidateBST validateBST=new ValidateBST();
        System.out.println(validateBST.isValidBst(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }

    private boolean isValidBst(Node root,int min,int max){
        if (root==null){
            return true;
        }
        if(root.key<min && root.key>max){
            return false;
        }
        return isValidBst(root.left,min, root.key)||isValidBst(root.right, root.key, max);
    }
}
