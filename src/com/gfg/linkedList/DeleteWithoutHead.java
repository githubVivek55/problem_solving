package com.gfg.linkedList;

public class DeleteWithoutHead {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        head.next = n2;
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;

        //let say you given n2 pointer, you need to delete n2
        //without using head pointer

        n2.data = n2.next.data;
        n2.next = n2.next.next;
    }
}
