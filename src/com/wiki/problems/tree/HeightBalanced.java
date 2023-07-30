package com.wiki.problems.tree;

public class HeightBalanced {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(3);
        if(root==null){
            System.out.println("true");
        }
        int left = traverse(root);
        System.out.println(left);

    }
    public static int traverse(Node node){
        if(node==null){
            return 0;
        }
        int lh = traverse(node.left);
        if(lh==-1){
            return -1;
        }
        int rh = traverse(node.right);
        if(rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }else{
            return Math.max(lh,rh)+1;
        }
    }
}
