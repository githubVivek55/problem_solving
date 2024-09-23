package com.gfg.stackQueue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class SortStack {
    public static void main(String[] args) {

    }
    public static Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        List<Integer> list = new LinkedList<>();
        while (!s.isEmpty()){
            list.add(s.pop());
        }
        list.stream().sorted(Comparator.reverseOrder()).forEach(s::add);
        return s;
    }

    public static Stack<Integer> sort2(Stack<Integer> s){
        if(s.size()==1)
            return s;
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> res = new Stack<>();
        res.push(s.pop());
        while (!s.isEmpty()){
            int val = s.pop();
            while (!res.isEmpty() && val<res.peek()){
                temp.push(res.pop());
            }
            res.push(val);
            while (!temp.isEmpty()){
                res.push(temp.pop());
            }
        }
        return res;
    }

    public static Stack<Integer> sortSolution3(Stack<Integer> s){
        if(s.size()==1)
            return s;
        int val = s.pop();
        sort(s);
        if(!s.isEmpty() && s.peek()>val){
            int t = s.pop();
            s.push(val);
            s.push(t);
        }
        return s;
    }
    public static void insert(Stack<Integer> ins,int val){
        if(ins.peek()<val || ins.empty()){
            ins.push(val);
            return;
        }
        int x = ins.pop();
        insert(ins,x);
        ins.push(x);
    }
}
