package com.gfg.linkedList;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseInGroup {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(8);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        Node reverse = reverse(n1, 4);
        while (reverse!=null){
            System.out.println(reverse.data);
            reverse  =reverse.next;
        }
        //1->2->2->4->5->6->8
        //1<-2<-2-<4->5->6->8->Null
    }
    public static Node reverse(Node node, int k)
    {
        Node head = node;
        if(head==null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        int counter = 0;
        Node t = null;
        while (curr!=null && counter<k){
            t= curr.next;
            curr.next = prev;
            prev=curr;
            curr = t;
            counter++;
        }
        if(t!=null){
            head.next = reverse(t, k);
        }
        return prev;
    }
    
}
