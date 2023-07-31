package com.wiki.problems.tree;

import java.util.ArrayList;

public class IdenticalTree {
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.right = new Node(3);
        root1.left = new Node(1);

        Node root2 = new Node(2);
        root2.right = new Node(3);
        root2.left = new Node(1);
        System.out.println(isIdentical(root1,root2));
    }

    static boolean isIdentical(Node root1,Node root2) {
        if (root1 == null && root2 ==null) {
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        return root1.value.equals(root2.value) &&
                isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
    }

}
