package com.gfg.stackQueue;

import java.util.Stack;

class StackQueue{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    public void push(int x)
    {
        s1.push(x);
    }


    //Function to pop an element from queue by using 2 stacks.
    public int pop()
    {
        if(s1.isEmpty() && s2.isEmpty()){
            return -1;
        }else{
            while (s1.size()>1){
                s2.push(s1.pop());
            }
            int ans = s1.pop();
            while (!s2.empty()){
                s1.push(s2.pop());
            }
            return ans;
        }
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        StackQueue sq = new StackQueue();
        sq.push(2);
        sq.push(3);
        sq.push(4);
        sq.push(5);
        System.out.println(sq.pop());
        System.out.println(sq.pop());
        sq.push(6);
        System.out.println(sq.pop());
        System.out.println(sq.pop());
        System.out.println(sq.pop());
        System.out.println(sq.pop());

    }
}
