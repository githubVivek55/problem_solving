package com.wiki.problems.tree;

import java.util.ArrayList;

public class LowestCommonAncestor {
    public static void main(String[] args) {
            Node root = new Node(2);
            root.left = new Node(1);
            root.right = new Node(3);
        int n1 = 1, n2 = 3;
        ArrayList<Node> res1 = new ArrayList<>();
        ArrayList<Node> res2 = new ArrayList<>();
        lca(root,res1,n1);
        lca(root,res2,n2);
        res1.retainAll(res2);

        System.out.println(res1.get(res1.size()-1).value);
    }

    static void lca(Node node, ArrayList<Node> res, int n) {
        if(node==null){
            return;
        }
        res.add(node);
        if (node.value == n) {
            return;
        }
        if (n < node.value) {
            lca(node.left, res, n);
        } else {
            lca(node.right, res, n);
        }
    }
}
