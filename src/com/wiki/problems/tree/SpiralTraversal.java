package com.wiki.problems.tree;

import java.util.*;

public class SpiralTraversal {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static Stack<Node> st1 = new Stack<>();
    static Stack<Node> st2 = new Stack<>();
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(7);
        root.left.right = new Node(9);
        root.right = new Node(12);
        root.right.left = new Node(11);
        root.right.right = new Node(13);
        BinaryTree tree = new BinaryTree(root);
        findSpiral(root);
    }
    static ArrayList<Integer> findSpiral(Node root)
    {
        st1.add(root);
        while(!st1.isEmpty() || !st2.isEmpty()){
            while(!st1.isEmpty()){
                Node curnode = st1.pop();
                list.add(curnode.value);
                RightToleft(curnode);
            }
            while(!st2.isEmpty()){
                Node curnode = st2.pop();
                list.add(curnode.value);
                leftToRight(curnode);
            }
        }
        return list;
    }
    static void leftToRight(Node curnode){
        if(curnode.left!=null){
            st1.add(curnode.left);
        }
        if(curnode.right!=null){
            st1.add(curnode.right);
        }
    }

    static void RightToleft(Node curnode){
        if(curnode.right!=null){
            st2.add(curnode.right);
        }
        if(curnode.left!=null){
            st2.add(curnode.left);
        }
    }
}
