package com.puzzle.bst;

/**
 * @author gsinha
 * 25/06/2022
 * LowestCommonAncestor
 */
public class LowestCommonAncestor {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        LowestCommonAncestor obj = new LowestCommonAncestor();
        Node lca = obj.lowestCommonAncestor(tree.root, tree.root.left, tree.root.left.right);
        System.out.println(lca.key);
    }

    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) {
            return null;
        }
        if (root.key > p.key && root.key > q.key) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.key < p.key && root.key < q.key) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
