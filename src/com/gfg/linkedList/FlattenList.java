package com.gfg.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FlattenList {
    public static void main(String[] args) {

    }

    public static Node flatten(Node root) {
        if (root == null || root.next==null) {
            return root;
        }

        root.next = flatten(root.next);

        root = merge(root,root.next);
        return root;
    }

    static Node merge(Node a, Node b) {
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        Node result;
        if(a.data<b.data){
            result = a;
            result.bottom = merge(a.bottom,b);
        }else{
            result = b;
            result.bottom = merge(a,b.bottom);
        }
        result.next = null;
        return result;
    }
}
