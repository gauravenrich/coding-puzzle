package com.puzzle.bst;

/**
 * Find successor and predecessor of a key in BST
 * @author gsinha
 * 20 july 2022
 */
class Res{
    Node pre;
    Node suc;
}
public class FindPreSuccessor {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
        Res pre=new Res();
        Res suc=new Res();
        findPreSuc(tree.root,pre,suc,40);
        System.out.println();
        System.out.println("pred of key is "+pre.pre.key);
        System.out.println("succ of key is "+suc.suc.key);
    }

    public static void findPreSuc(Node root, Res p, Res s, int key){
        if(root==null){
            return;
        }
        findPreSuc(root.left,p,s,key);
        if(root.key<key){
            p.pre=root;
        }
        if(root.key>key && s.suc==null){
            s.suc=root;
        }
        findPreSuc(root.right,p,s,key);
    }
}
