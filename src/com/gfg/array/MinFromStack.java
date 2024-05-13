package com.gfg.array;

import java.util.Stack;

public class MinFromStack {
    int minEle;
    Stack<Integer> s;
    /*returns min element from stack*/
    int getMin() {
        if(s.isEmpty()){
            return -1;
        }

        return minEle;
    }

    /*returns poped element from stack*/
    int pop() {
        if(s.isEmpty()){
            return -1;
        }
        int el = s.pop();
        if(el==minEle){
            minEle=Integer.MAX_VALUE;
            for(int i:s){
                if (i<minEle){
                    minEle=i;
                }
            }
        }
        return el;
    }

    /*push element x into the stack*/
    void push(int x) {
        if(s.isEmpty()){
            minEle=x;
        }else if(x<minEle){
            minEle=x;
        }
        s.push(x);
    }
}
