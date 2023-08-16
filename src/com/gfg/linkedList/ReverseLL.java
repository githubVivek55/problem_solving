package com.gfg.linkedList;

import java.util.Stack;

public class ReverseLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        head.next = n2;
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;
//        n4.next = new Node(5);

        Stack<Node> stk = new Stack<>();
        Node curr = head;
        while(curr!=null){
            stk.push(curr);
            curr=curr.next;
        }
        System.out.println(stk);
        head = stk.pop();
        curr = head;
        while(!stk.empty()){
            curr.next=stk.pop();
            curr = curr.next;
        }
        curr.next= null;

    }
}
