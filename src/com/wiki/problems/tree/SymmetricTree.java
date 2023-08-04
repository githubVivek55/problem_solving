package com.wiki.problems.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class SymmetricTree {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(20);
        root.right = new Node(10);
        root.right.right = new Node(20);
        root.right.left = new Node(10);
        System.out.println(traverse(root.left, root.right));
    }

    public static boolean traverse(Node left, Node right) {
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.value!=right.value){
            return false;
        }
        boolean l = traverse(left.left, right.right);
        boolean r = traverse(left.right, right.left);
        return l&&r;
    }

}
