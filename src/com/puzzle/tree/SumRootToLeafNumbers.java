package com.puzzle.tree;

/**
 *       1
 *    2      3
 *         6    7
 *                8
 * 12+136+1378=1526
 * Date 29/05/2022
 * @author gauravenrich
 * Leetcode 129. Sum Root to Leaf Numbers
 */
public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        SumRootToLeafNumbers obj=new SumRootToLeafNumbers();
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.left = new Node(8);
        LevelOrderTraversal.levelOrderTraversal(bt.root);
        System.out.println();
        System.out.println(obj.sumPath(bt.root, 0));
    }

    public int sumPath(Node root,int sum){
        if (root==null){
            return 0;
        }
        int val=10*sum+ root.data;
        if(root.right==null && root.left==null){
            return val;
        }
        return sumPath(root.left,val)+sumPath(root.right,val);
    }
}
