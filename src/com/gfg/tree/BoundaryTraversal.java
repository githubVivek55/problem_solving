package com.gfg.tree;

import java.util.*;

public class BoundaryTraversal {
    public static void main(String[] args) {
        Node l1 = new Node(null, null, 6);
        Node l2 = new Node(null, null, 5);
        Node l3 = new Node(null, null, 7);
        Node l4 = new Node(null, null, 8);
        Node l5 = new Node(l1, l2, 4);
        Node l6 = new Node(l3, l4, 3);
        Node l7 = new Node(null, l6, 9);
        Node l8 = new Node(l5, l7, 2);
        Node root = new Node(l8, null, 1);

        ArrayList<Integer> boundary = boundary(root);

        System.out.println(boundary);
    }

    static ArrayList<Integer> boundary(Node node) {
        if (node == null) {
            return new ArrayList<>();
        }
        if (isLeaf(node)) {
            return new ArrayList<>(Arrays.asList(node.data));
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(node.data);
        traverseLeft(node, result);
        traverseLeafs(node,result);
        traverseRight(node, result);
        return result;
    }

    private static void traverseLeafs(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }

        if(isLeaf(node)){
            result.add(node.data);
            return;
        }
        traverseLeafs(node.left,result);
        traverseLeafs(node.right,result);
    }

    private static void traverseRight(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        Node t = node.right;
        Stack<Integer> stack = new Stack<>();
        while (t != null) {
            if (!isLeaf(t)) {
                stack.push(t.data);
            }
            if (t.right != null) {
                t = t.right;
            } else {
                t = t.left;
            }
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
    }


    private static void traverseLeft(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        Node t = node.left;

        while (t != null) {
            if (!isLeaf(t)) {
                result.add(t.data);
            }
            if (t.left != null) {
                t = t.left;
            } else {
                t = t.right;
            }
        }
    }

    private static boolean isLeaf(Node node) {
        if (node.left == null && node.right == null) {
            return true;
        }
        return false;
    }
}
