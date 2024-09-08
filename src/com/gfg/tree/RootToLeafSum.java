package com.gfg.tree;

import java.util.Objects;

public class RootToLeafSum {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        boolean res = hasPathSum(root, 6);
        System.out.println(res);
    }

    static boolean hasPathSum(Node root, int target) {
        // Your code here
        if (Objects.equals(root, null)) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return target - root.data == 0;
        }
        return hasPathSum(root.left, target - root.data) ||
                hasPathSum(root.right, target - root.data);


    }

}
