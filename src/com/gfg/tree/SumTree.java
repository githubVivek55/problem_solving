package com.gfg.tree;

public class SumTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        Node l1 = new Node(20);
        Node l2 = new Node(10);
        Node l3 = new Node(10);
        Node r1 = new Node(30);
        root.setLeft(l1);
        l1.setLeft(l2);
        l1.setRight(l3);
        root.setRight(r1);
        boolean sumTree = isSumTree(root);
        System.out.println(sumTree);
    }
    static boolean isSumTree(Node root)
    {
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int sum = getSum(root.left);
        int sum1 = getSum(root.right);

        return sum+sum1==root.data ?true:false;
    }

    private static int getSum(Node node) {
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return node.data;
        }
        int leftsum = getSum(node.left);
        int rightsum = getSum(node.right);

        if(leftsum+rightsum ==node.data){
            return node.data + getSum(node.left)+getSum(node.right);
        }
        return Integer.MIN_VALUE;
    }
}
