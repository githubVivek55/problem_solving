package com.wiki.problems.tree;

import java.util.ArrayList;

public class ArrayToTree {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int start = 0;
        int end = arr.length-1;
        Node node = makeTree(start,end,arr);
        System.out.println(node.value);
        ArrayList<Integer> res= new ArrayList<>();
        preorder(node, res);
        System.out.println(res.stream().mapToInt(i->i).toArray());
    }
    public static void preorder(Node nd, ArrayList<Integer> arr){
        if(nd==null){
            return;
        }
        arr.add(nd.value);
        preorder(nd.left, arr);
        preorder(nd.right,arr);
    }
    public static Node makeTree(int left, int right, int[] arr){
        if(left>right){
            return null;
        }
        int mid = ((left+right))/2;
        Node nd = new Node(arr[mid]);
        nd.left = makeTree(left,mid-1,arr);
        nd.right = makeTree(mid+1,right,arr);
        return nd;
    }
}
