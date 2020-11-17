package com.puzzle.tree;

public class LeftView {
    static int maxLevel=-1;
    public static void main(String args[]){
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.left = new Node(71);
        leftView(bt.root, 0);
        System.out.println();
    }

    private static void leftView(Node root, int level) {
        if(root==null){
            return;
        }
        if(level>maxLevel){
            System.out.print(root.data+" ");
            maxLevel=level;
        }
        leftView(root.left,level+1);
        leftView(root.right,level+1);
    }
}
