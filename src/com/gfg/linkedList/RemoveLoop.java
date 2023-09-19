package com.gfg.linkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveLoop {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        root.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=root;
        detectLoop(root);
    }

    public static void hashSolution(Node head){

    }
    public static void detectLoop(Node node){
        Node slow = node,fast = node;
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                removeLoop(node,slow);
                return;
            }
        }
    }
    public static void removeLoop(Node head,Node slow){
        Node p1 = head;
        Node p2 = slow;
        int k=1;
        Node prev = p1;
        while (p1.next !=p2){
            prev = p1;
            p1 = p1.next;
            k++;
        }
        prev.next = null;
    }
}
