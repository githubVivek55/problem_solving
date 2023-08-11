package com.vwake.problems;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String s = "hellogeeks";
        Set<String> set = new HashSet<>();
        String res = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!set.add(String.valueOf(c))){
                res = String.valueOf(c);
                break;
            }
        }
        System.out.println(res);
    }
}
