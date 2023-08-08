package com.wiki.problems.tree;

import java.util.ArrayList;

public class KthLargestElement {
    public static void main(String[] args) {
        Node root = new Node(23);
        root.left = new Node(21);
        root.right = new Node(26);
        root.left.left = new Node(20);
        root.left.right = new Node(22);
        root.right.left = new Node(25);
        root.right.right = new Node(27);
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,res);
        System.out.println(res);
    }
    static void inorder(Node node, ArrayList<Integer> arr){
        if(node==null){
            return;
        }
        inorder(node.left,arr);
        arr.add(node.value);
        inorder(node.right,arr);
    }
}
