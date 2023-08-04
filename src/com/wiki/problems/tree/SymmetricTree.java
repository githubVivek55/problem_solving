package com.wiki.problems.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class SymmetricTree {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(20);
        root.right = new Node(10);
        root.right.right = new Node(20);
        root.right.left = new Node(20);
        ArrayList<Integer> res1 = new ArrayList<>();
        ArrayList<Integer> res2 = new ArrayList<>();
        traverse(root, res1);
        System.out.println(res1);
        mirror(root);
        traverse(root,res2);
        System.out.println(res2);
        System.out.println(res1.equals(res2));
    }
    public static void traverse(Node root, ArrayList<Integer> res){
        if(root==null){
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node n = queue.poll();
                res.add(n.value);
                if(n.left!=null){
                    queue.add(n.left);
                }
                if(n.right!=null){
                    queue.add(n.right);
                }
            }
        }

    }
    public static void mirror(Node node){
        if(node==null){
            return;
        }
        Node t = node.left;
        node.left = node.right;
        node.right = t;
        mirror(node.left);
        mirror(node.right);
    }
}
