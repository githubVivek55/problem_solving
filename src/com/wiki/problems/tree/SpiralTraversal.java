package com.wiki.problems.tree;

import java.util.*;

public class SpiralTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(7);
        root.left.right = new Node(9);
        root.right = new Node(12);
        root.right.left = new Node(11);
        root.right.right = new Node(13);
        BinaryTree tree = new BinaryTree(root);
        Queue<Node> queue = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        queue.add(root);
        spiralOrder(queue, res);
        System.out.println(res);
    }

    public static void spiralOrder(Queue<Node> queue, ArrayList<Integer> res) {
        int level = 1;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(queue.poll());
        while (!s1.empty()) {
            int size1 = s1.size();
            for (int i = 0; i < size1; i++) {
                Node n = s1.pop();
                if(n==null){
                    break;
                }
                Optional.of(n).ifPresent((k)->res.add(k.value));
                if (level % 2 == 0) {
                    Optional.of(n).ifPresent((t) -> s1.push(t.left));
                    Optional.of(n).ifPresent((t) -> s1.push(t.right));
                } else {
                    Optional.of(n).ifPresent((t) -> s1.push(t.right));
                    Optional.of(n).ifPresent((t) -> s1.push(t.left));
                }
            }
            level++;
        }
    }
}
