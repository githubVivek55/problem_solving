package com.gfg.linkedList;

public class MiddleElement {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        head.next = n2;
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;
//        n4.next = new Node(5);

        Node curr = head;
        int len = 0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int mid = Math.abs(len/2)+1;
        System.out.println(mid);
        curr = head;
        for(int i=0;i<mid-1;i++){
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
}
