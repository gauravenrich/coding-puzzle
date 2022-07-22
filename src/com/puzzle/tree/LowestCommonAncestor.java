package com.puzzle.tree;

import static com.puzzle.tree.LevelOrderTraversal.levelOrderTraversal;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree(new Node(1));
        bt.root.left=new Node(2);
        bt.root.right=new Node(3);

        bt.root.right.left=new Node(6);
        bt.root.right.right=new Node(7);
        bt.root.right.right.right=new Node(71);

        levelOrderTraversal(bt.root);
        System.out.println();
        LowestCommonAncestor lowestCommonAncestor=new LowestCommonAncestor();
        Node lca=lowestCommonAncestor.lowestCommonAncestor(bt.root,bt.root.left,bt.root.right);
        System.out.println(lca.data);
    }

    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root==null){
            return null;
        }
        if(root.data==p.data || root.data==q.data){
            return root;
        }
        Node left=lowestCommonAncestor(root.left,p,q);
        Node right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        return left!=null?left:right;
    }
}
