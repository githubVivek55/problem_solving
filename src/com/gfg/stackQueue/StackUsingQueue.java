package com.gfg.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

class QueueStack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int a){
        q1.add(a);
    }
    public int pop(){
        if(q1.isEmpty()){
            return -1;
        }
        while (q1.size()>1){
            q2.add(q1.poll());
        }
        int ans = q1.poll();
        Queue<Integer> t = q1;
        q1=q2;
        q2=t;
        return ans;
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        QueueStack qs = new QueueStack();
        qs.push(1);
        qs.push(2);
        qs.push(3);
        qs.push(4);
        qs.push(5);

        System.out.println(qs.pop());
        System.out.println(qs.pop());
        System.out.println(qs.pop());

        qs.push(3);
        qs.push(4);
        qs.push(5);



        System.out.println(qs.pop());
        System.out.println(qs.pop());


    }
}
