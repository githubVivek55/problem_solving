package com.gfg.linkedList;

public class ArrangeZeroOneTwos {
    public static void main(String[] args) {
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
        n7.next=n8;

        int zeros =0;
        int ones =0;
        int tows = 0;
        Node curr = head;
        while (curr!=null){
               if(curr.data == 0){
                   zeros++;
               }else if(curr.data == 1){
                   ones++;
               }else{
                   tows++;
               }
               curr = curr.next;
        }
        Node head2 = null;
        curr = head2;
        for(int i=0;i<zeros;i++){
            if(i==0){
                Node n = new Node(0);
                head2 = n;
                curr = head2;
            }else{
                curr.next = new Node(0);
                curr = curr.next;
            }
        }
        for(int i=0;i<ones;i++){
            if(curr == null){
                Node n = new Node(1);
                head2 = n;
                curr = head2;
            }else {
                curr.next = new Node(1);
                curr = curr.next;
            }
        }
        for(int i=0;i<tows;i++){
            if(curr == null){
                Node n = new Node(2);
                head2 = n;
                curr = head2;
            }else {
                curr.next = new Node(2);
                curr = curr.next;
            }
        }
        System.out.println(head2);
    }
}
