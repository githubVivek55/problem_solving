package com.vwake.problems;

import java.util.HashMap;
import java.util.Map;

public class MinimumIndexChar {
    public static void main(String[] args) {
       String str = "geeksforgeeks";
       String patt = "set";
       int ans=-1;
        Map<Character, Integer> map = new HashMap<>();
       for(int i=0;i<patt.length();i++){
           map.put(patt.charAt(i),1);
       }
       for(int i=0;i<str.length();i++){
           if(map.containsKey(str.charAt(i))){
               ans = i;
               break;
           }
       }
        System.out.println(ans);
    }
}
