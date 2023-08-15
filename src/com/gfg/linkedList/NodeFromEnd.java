package com.gfg.linkedList;

public class NodeFromEnd {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(3);
        head.next = n2;
        Node n3 = new Node(4);
        n2.next = n3;
        n3.next = new Node(5);

        Node ans = new Node(-1);
        int n = getNode(head,3,ans);
    }
    public static int getNode(Node node, int k, Node ans){
        if(node==null){
            return 0;
        }
        int sum = 1+getNode(node.next,k,ans);
        System.out.println(node.data+"-"+sum);

        return sum;
    }
}
