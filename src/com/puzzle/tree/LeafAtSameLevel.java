package com.puzzle.tree;

class Leaf {
    int leafLevel = 0;
}

public class LeafAtSameLevel {
    public static void main(String[] args) {
        LeafAtSameLevel leafAtSameLevel = new LeafAtSameLevel();
        Node root = new Node(12);
        BinaryTree tree = new BinaryTree(root);
        tree.root.left = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(9);
        tree.root.left.left.left = new Node(1);
        tree.root.left.right.left = new Node(1);
        if (leafAtSameLevel.check(tree.root))
            System.out.println("Leaves are at same level");
        else
            System.out.println("Leaves are not at same level");
    }

    public boolean check(Node node) {
        int level = 0;
        Leaf leaf = new Leaf();
        return checkUtil(node, level, leaf);
    }

    boolean checkUtil(Node node, int level, Leaf leafLevel) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            if (leafLevel.leafLevel == 0) {
                return true;
            }
            return leafLevel.leafLevel == level;
        }
        return checkUtil(node.left, level + 1, leafLevel) && checkUtil(node.right, level + 1, leafLevel);
    }
}
