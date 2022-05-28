package com.puzzle.tree.iterative;

import com.puzzle.tree.BinaryTree;
import com.puzzle.tree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Date 28/05/2022
 *
 * @author gauravenrich
 * IterativeInorder Tree Program
 */
public class IterativeInorder {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.getRoot().left = new Node(2);
        bt.getRoot().right = new Node(3);
        bt.getRoot().right.left = new Node(6);
        bt.getRoot().right.right = new Node(7);
        bt.getRoot().right.right.right = new Node(71);
        List<Integer> result=inorderTraversal(bt.getRoot());
        System.out.println(result);

    }

    public static List<Integer> inorderTraversal(Node root){
        List<Integer> list=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        Node cur=root;
        while (!stack.isEmpty()|| cur!=null){
            if(cur!=null){
                stack.push(cur);
                cur=cur.getLeft();
            }else {
                cur=stack.pop();
                list.add(cur.getData());
                cur=cur.getRight();
            }
        }
        return list;
    }
}
