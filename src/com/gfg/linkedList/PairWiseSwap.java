package com.gfg.linkedList;

public class PairWiseSwap {
    public static void main(String[] args) {
        Node head = getLinkedList();
        Node curr = head;
        Node t = null;
        Node h2 = head;
        Node p = null;
        while(curr.next!=null){
            t = curr.next;
            curr.next = t.next;
            t.next = curr;
            if(curr==head){
                h2 = t;
            }else{
                p.next = t;
            }
            if(curr.next!=null){
                p = curr;
                curr = curr.next;
            }
        }
        System.out.println(h2);
    }
    static Node getLinkedList(){
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(1);
        Node n5 = new Node(2);
        Node n6 = new Node(0);
        Node n7 = new Node(2);
        Node n8 = new Node(2);
        head.next = n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
//        n7.next=n8;
        return head;
    }
}
