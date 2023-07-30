package com.wiki.problems.tree;

public class BTHeight {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.right = new Node(1);
        root.right.left = new Node(3);
        int res = height(root);
        System.out.println(res);
    }
    static int height(Node node){
        if(node==null){
            return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        return Math.max(lh,rh)+1;
    }
}
