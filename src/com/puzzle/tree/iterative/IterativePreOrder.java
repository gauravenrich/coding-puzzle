package com.puzzle.tree.iterative;

import com.puzzle.tree.BinaryTree;
import com.puzzle.tree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Date 28/05/2022
 * @author gauravenrich
 * Iterative Preorder Tree Program
 */
public class IterativePreOrder {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.getRoot().left = new Node(2);
        bt.getRoot().right = new Node(3);
        bt.getRoot().right.left = new Node(6);
        bt.getRoot().right.right = new Node(7);
        bt.getRoot().right.right.right = new Node(71);
        List<Integer> result=iterativePreOrder(bt.getRoot());
        System.out.println(result);
    }

    public static List<Integer> iterativePreOrder(Node root){
        List<Integer> list=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            list.add(stack.peek().getData());
            Node cur=stack.pop();
            if(cur.right!=null){
                stack.push(cur.right);
            }
            if (cur.left!=null){
                stack.push(cur.left);
            }
        }
        return list;
    }
}
