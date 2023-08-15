package com.gfg.linkedList;

public class DetectLoop {
    public static void main(String[] args) {
        /*
         * Prepare sample linked list
         */
        Node head = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        head.next = n2;
        n2.next = n3;
        n3.next = n2;
        /*
         * traverse linked list*/
        Node curr = head;
        Node curr2 = head.next;

        boolean ans = false;
        while (curr.next != null && curr2!=null) {
            if (curr == curr2) {
                ans = true;
                break;
            }
            curr = curr.next;
            if (curr2.next != null) {
                curr2 = curr2.next.next;
            }
        }
        System.out.println(ans);
    }
}
