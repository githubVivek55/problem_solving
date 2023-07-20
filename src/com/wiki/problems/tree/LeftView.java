package com.wiki.problems.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class LeftView {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(7);
        root.left.right = new Node(9);
        root.right = new Node(12);
        root.right.left = new Node(11);
        root.right.right = new Node(9);
        BinaryTree tree = new BinaryTree(root);
        Queue<Node> queue = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        queue.add(root);
        leftview(queue, res);
        System.out.println(res);
    }

    public static void leftview(Queue<Node> queue, ArrayList<Integer> res) {
        if (queue.isEmpty()) {
            return;
        }
        while (!queue.isEmpty()) {
            Node leftmost = null;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node != null) {
                    leftmost = node;
                    if (node.right != null)
                        queue.add(node.right);
                    if (node.left != null)
                        queue.add(node.left);
                }
            }
            if (leftmost != null)
                res.add(leftmost.value);

        }

    }
}
