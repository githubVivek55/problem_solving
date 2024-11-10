package com.gfg.linkedList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class IntersactionPoint {

    public static class MyStack<T> {
        private T[] stack = null;
        int pointer = 0;

        public MyStack(Class<T> t) {
            stack = (T[]) new Object[10];
        }

        public void push(T node) {
            if (pointer < stack.length - 1) {
                stack[pointer] = node;
                pointer++;
                return;
            }
            stack = Arrays.copyOf(stack, stack.length +10);
            stack[pointer] = node;
            pointer++;
        }

        public boolean isEmpty() {
            if (pointer == 0)
                return true;
            return false;
        }

        public T peek() {
            return stack[pointer];
        }

        public T pop() {
            if (!isEmpty()) {
                T element = stack[pointer];
                stack[pointer] = null;
                pointer--;
                return element;
            }
            return null;
        }
    }

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

//        int i = intersectPoint(f1, s1);
//        int i = intersectionPointSolution2(f1, s1);
        int i = intersectionPointSolution3(f1, s1);
        System.out.println(i);
    }

    public static int findLength(Node head){
        int length = 0;
        while(head!=null){
            head = head.next;
            length++;
        }
        return length;
    }

    static int intersectionPointSolution3(Node head1, Node head2){
        int l1 = findLength(head1);
        int l2 = findLength(head2);

        if(l1>l2){
            while (l1>l2){
                head1=head1.next;
                l1--;
            }
        }
        if(l2>l1){
            while (l2>l1){
                head2 = head2.next;
                l2--;
            }
        }

        while (head1 !=null || head2!=null){
            if(head1==head2){
                return head1.data;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return -1;
    }

    static int intersectionPointSolution2(Node head1, Node head2){
        MyStack<Node> stack1 = new MyStack<>(Node.class);
        MyStack<Node> stack2 = new MyStack<>(Node.class);
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
            } else {
                stack1.pop();
                stack2.pop();
            }
        }
        if (last == null) {
            return -1;
        }
        return last.data;
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
            } else {
                stack1.pop();
                stack2.pop();
            }
        }
        if (last == null) {
            return -1;
        }
        return last.data;
    }
}
