package com.gfg.tree;

public class MirrorTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node l1 = new Node(2);
        Node r1 = new Node(3);
        Node l2 = new Node(4);
        Node l2r = new Node(5);
        root.left=l1;
        root.right=r1;
        l1.left=l2;
        l1.right=l2r;

        mirror(root);
    }

    private static void mirror(Node node) {
        if(node==null)
            return;
        if(node.left==null && node.right==null)
        {
            return;
        }
        Node t = node.left;
        node.left=node.right;
        node.right=t;
        mirror(node.left);
        mirror(node.right);
    }
}
