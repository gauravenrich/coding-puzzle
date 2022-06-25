package com.puzzle.tree;

/**
 * @author gsinha
 * Left View of a tree
 *     1
 *    2  3
 *      6  7
 *        71
 */
public class LeftView {
    public static void main(String args[]){
        BinaryTree bt = new BinaryTree(new Node(1));
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.left = new Node(71);
        int[] maxLevel=new int[1];
        maxLevel[0]=-1;
        leftView(bt.root, 0,maxLevel);
        System.out.println();
    }

    private static void leftView(Node root, int level,int[] max) {
        if(root==null){
            return;
        }
        if(level>max[0]){
            System.out.print(root.data+" ");
            max[0]=level;
        }
        leftView(root.left,level+1,max);
        leftView(root.right,level+1,max);
    }
}
