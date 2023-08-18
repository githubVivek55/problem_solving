package com.gfg.greedy.heap;
class minHeapNode {
    char data;
    int freq;
    minHeapNode left,right;
    minHeapNode(char data, int freq){
        this.data = data;
        this.freq = freq;
        left=right=null;
    }
}
public class Hufffman {
    public static void main(String[] args) {
        String encodedStr = "00101";
        minHeapNode root = getMinHeapNode();
        /*
        * logic begins
        * */
        minHeapNode cur = root;
        StringBuilder sb = new StringBuilder("");
        for (int i=0;i<encodedStr.length();i++){
            char ch = encodedStr.charAt(i);
            if(ch==48){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
            if(cur.left==null && cur.right==null){
                sb.append(cur.data);
                cur = root;
            }
        }
    }

    private static minHeapNode getMinHeapNode() {
        minHeapNode root = new minHeapNode('@',2);
        minHeapNode l1 = new minHeapNode('@',1);
        minHeapNode ll1 = new minHeapNode('a',1);
        minHeapNode lr1 = new minHeapNode('c',1);
        minHeapNode r1 = new minHeapNode('b',1);
        root.left = l1;
        l1.left = ll1;
        l1.right = lr1;
        root.right = r1;
        return root;
    }
}
