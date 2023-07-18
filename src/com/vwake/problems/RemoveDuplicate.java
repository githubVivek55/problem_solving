package com.vwake.problems;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String S = "gfg";
        Set<Character> store = new HashSet<>();
        String res="";
        for(int i=0;i<S.length();i++){
            if(store.add(S.charAt(i))){
                res+=S.charAt(i);
            }
        }
        System.out.println(res);
    }
}
