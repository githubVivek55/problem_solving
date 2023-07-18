package com.wiki.problems.tree;

public class CheckBST {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(7);
        root.left.right = new Node(9);
        root.right = new Node(12);
        root.right.left = new Node(11);
        root.right.right = new Node(9);
        BinaryTree tree = new BinaryTree(root);

        System.out.println(tree.isBST());
    }

}
