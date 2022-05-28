package com.puzzle.tree.iterative;

import com.puzzle.tree.BinaryTree;
import com.puzzle.tree.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class IterativePostOrder {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.getRoot().left = new Node(2);
        bt.getRoot().right = new Node(3);
        bt.getRoot().right.left = new Node(6);
        bt.getRoot().right.right = new Node(7);
        bt.getRoot().right.right.right = new Node(71);
        List<Integer> result=iterativePostOrder(bt.getRoot());
        System.out.println(result);
    }

    public static List<Integer> iterativePostOrder(Node root){
        LinkedList<Integer> list=new LinkedList<>();
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node cur=stack.pop();
            list.addFirst(cur.getData());
            if(cur.left!=null){
                stack.push(cur.left);
            }
            if(cur.right!=null){
                stack.push(cur.right);
            }
        }
        return list;
    }
}
