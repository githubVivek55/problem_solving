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
        HashSet<Node> hash = new HashSet<>();
        Node prev = null;
        while (head!=null){
            if(hash.contains(head)){
                prev.next=null;
            }else{
                hash.add(head);
                prev=head;
                head = head.next;
            }
        }
    }
    public static void detectLoop(Node head){
        Node slow =head;
        Node fast = head;
        while(fast!= null && fast.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                slow =head;
                while(slow!= fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }

                while(fast.next != slow)
                {
                    fast = fast.next;
                }
                // removing loop
                fast.next =null;
                return;
            }
        }
        return ;
    }

}
