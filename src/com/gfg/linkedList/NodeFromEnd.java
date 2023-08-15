package com.gfg.linkedList;

public class NodeFromEnd {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(3);
        head.next = n2;
        Node n3 = new Node(4);
        n2.next = n3;
        n3.next = new Node(5);

        Node curr = head;
        int c = 0;
        int n =5;
        while(curr!=null){
            c++;
            curr = curr.next;
        }
        for(int i=0;i<(c-n);i++){
            head = head.next;
        }
        System.out.println(head.data);
    }
}
