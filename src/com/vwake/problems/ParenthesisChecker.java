package com.vwake.problems;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String inp = "[[[{()(())}]]]";
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < inp.length(); i++) {
            switch (inp.charAt(i)) {
                case '}': {
                    if (!ch.empty() && ch.peek().equals('{')) {
                        ch.pop();
                    } else {
                        ch.add(inp.charAt(i));
                    }
                    break;
                }

                case ')': {
                    if (!ch.empty() && ch.peek().equals('(')) {
                        ch.pop();
                    } else {
                        ch.add(inp.charAt(i));
                    }
                    break;
                }
                case ']': {
                    if (!ch.empty() && ch.peek().equals('[')) {
                        ch.pop();
                    } else {
                        ch.add(inp.charAt(i));
                    }
                    break;
                }
                default: {
                    ch.add(inp.charAt(i));
                }
            }
        }
        if(ch.size()==0){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }

}
