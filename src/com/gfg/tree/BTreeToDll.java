package com.gfg.tree;

import java.util.ArrayList;
import java.util.List;

public class BTreeToDll {
    public static void main(String[] args) {
        Node root = new Node(10);
        Node l1 = new Node(20);
        Node r1 = new Node(30);
        Node l2 = new Node(40);
        Node r2 = new Node(60);
        root.left = l1;
        root.right = r1;
        l1.left = l2;
        l1.right = r2;
        Node node = bToDLL(root);
        while (node!=null){
            System.out.println(node.data);
            node=node.right;
        }
    }

    public static Node bToDLL(Node root) {
        List<Node> inordertraversal = new ArrayList<>();
        inorder(root,inordertraversal);

        Node head=null,temp=null;
        for (Node node : inordertraversal) {
            if (head == null) {
                head = node;
                temp = head;
            } else {
                temp.right = node;
                node.left = temp;
                temp = node;
            }
        }

        return head;
    }
    public static void inorder(Node root, List<Node> res){
        if(root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root);
        inorder(root.right,res);
    }
}
