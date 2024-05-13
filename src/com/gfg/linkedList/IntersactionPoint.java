package com.gfg.linkedList;

import java.util.Stack;

public class IntersactionPoint {
    public static void main(String[] args) {
        Node f1 = new Node(4);
        Node f2 = new Node(1);
        Node c1 = new Node(8);
        Node c2 = new Node(4);
        Node c3 = new Node(5);
        Node s1 = new Node(5);
        Node s2 = new Node(6);
        Node s3 = new Node(1);
        f1.next = f2;
        f2.next = c1;
        c1.next = c2;
        c2.next = c3;
        s1.next = s2;
        s2.next = s3;
        s3.next = c1;

        int i = intersectPoint(f1, s1);
        System.out.println(i);
    }

    static int intersectPoint(Node head1, Node head2) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        Node curr = head1;
        while (curr != null) {
            stack1.push(curr);
            curr = curr.next;
        }
        curr = head2;
        while (curr != null) {
            stack2.push(curr);
            curr = curr.next;
        }
        Node last = null;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.peek() == stack2.peek()) {
                last = stack1.pop();
                stack2.pop();
            }else {
                stack1.pop();
                stack2.pop();
            }
        }
        if(last==null){
            return -1;
        }
        return last.data;
    }
}
