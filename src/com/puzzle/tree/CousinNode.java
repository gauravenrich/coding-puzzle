package com.puzzle.tree;

/**
 * Date 11/22/2020
 *
 * @author gauravenrich
 * Cousin Node Program
 */


public class CousinNode {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.left.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.right = new Node(71);
        bt.root.right.right.right.left = new Node(75);

        bt.inOrder(bt.root);
        System.out.println();
        System.out.println("isCousin "+isCousin(bt.root,bt.root.left.left,bt.root.right.right));

    }

    private static boolean isCousin(Node root, Node a, Node b) {
        if (root == null) {
            return false;
        }
        return (!isSiblings(root, a, b) && hasSameLevel(root, a, b));

    }

    private static boolean isSiblings(Node root, Node a, Node b) {
        if (root == null) {
            return false;
        }
        return (root.left == a && root.right == b) || (root.right == a && root.left == b)
                || (isSiblings(root.left, a, b)) || (isSiblings(root.right, a, b));
    }

    private static boolean hasSameLevel(Node root, Node a, Node b) {
        return (getLevel(root,a,1) == getLevel(root,b,1));
    }

    private static int getLevel(Node root, Node a,int curLevel) {
        if(root==null)
            return 0;
        if(root==a){
            return curLevel;
        }
        int level=getLevel(root.left,a,curLevel+1);
        if(level!=0)
            return level;
        else
            return getLevel(root.right,a,curLevel+1);

    }
}
