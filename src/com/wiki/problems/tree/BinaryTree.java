package com.wiki.problems.tree;

public class BinaryTree {
    public Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBSTUtil(Node node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if (node.value < min || node.value > max) {
            return false;
        }
        return isBSTUtil(node.left, min, node.value - 1)
                && isBSTUtil(node.right, node.value + 1, max);
    }
}
