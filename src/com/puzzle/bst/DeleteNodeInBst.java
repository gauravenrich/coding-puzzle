package com.puzzle.bst;

public class DeleteNodeInBst {
    public Node findMinimum(Node root) {
        if(root == null)
            return null;
        else if(root.left != null)
            return findMinimum(root.left);
        return root;
    }
    public Node deleteNode(Node root, int key) {
        if(root ==  null)
            return null;
        if(key > root.key)
            root.right = deleteNode(root.right, key);
        else if( key < root.key)
            root.left =  deleteNode (root.left, key);

        else{
            //No Child 
            if(root.right == null && root.left == null){
                return null;
            }
            //One child
            else if(root.right == null || root.left == null){
                Node temp =null;
                if(root.left == null)
                    temp = root.right;
                if(root.right == null)
                    temp = root.left;
                return temp;
            }
            //Two Children
            else{
                Node temp = findMinimum(root.right);
                root.key = temp.key;
                root.right = deleteNode(root.right, temp.key);
            }
        }
        return root;
    }
}
