package com.gfg.strings;

import java.util.Stack;

public class NumberPattern {
    public static void main(String[] args) {
        String input = "IIDDD";
        String s = printMinNumberForPattern(input);
        System.out.println(s);
    }

    /*
        1232
         II DDDD II
        127 6543 89
        125 4369 87

         II DDDD
        1276543

         ID
        132

         IDIDID
        1325476
     */
    static String printMinNumberForPattern(String S) {
        // code here
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<=S.length();i++){
            stack.push(i+1);
            if(i==S.length() || S.charAt(i)=='I'){
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        return sb.toString();
    }
}
