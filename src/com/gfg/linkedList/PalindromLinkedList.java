package com.gfg.linkedList;

import java.util.Stack;

public class PalindromLinkedList {
    public static void main(String[] args) {
        Node first = new Node(1);
        Node sec = new Node(2);
        Node thrd = new Node(3);
        first.next=sec;
        sec.next=thrd;
        boolean palindrome = isPalindrome(first);
        System.out.println(palindrome);
    }
    static boolean isPalindrome(Node head)
    {
        Stack<Integer> stack = new Stack<>();
        Node curr = head;
        while (curr!=null){
            stack.push(curr.data);
            curr=curr.next;
        }
        curr = head;
        while (curr!=null){
            if(curr.data!=stack.pop()){
                return false;
            }
            curr=curr.next;
        }
        return true;
    }
}
