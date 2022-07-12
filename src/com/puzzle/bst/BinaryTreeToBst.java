package com.puzzle.bst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * BinaryTree To Bst
 */
public class BinaryTreeToBst {
    List<Integer> list=new ArrayList<>();
    int i=0;
    Node binaryTreeToBST(Node root){
        inorder(root);
        Collections.sort(list);
        createBst(root);
        return root;
    }

    private void createBst(Node root) {
        if(root==null){
            return;
        }
        createBst(root.left);
        root.key=list.get(i);
        i++;
        createBst(root.right);
    }

    private void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root.key);
        inorder(root.right);
    }
}
