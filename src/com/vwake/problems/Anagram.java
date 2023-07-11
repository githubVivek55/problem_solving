package com.vwake.problems;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String a ="b";
        String b = "d";
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        if(a.length()!=b.length()){
            System.out.println(false);
        }else{
            for(int i=0;i<a.length();i++){
                map1.put(a.charAt(i), map1.getOrDefault(a.charAt(i),0)+1);
                map2.put(b.charAt(i), map2.getOrDefault(b.charAt(i),0)+1);
            }
            for(Map.Entry e : map1.entrySet()){
                if(!e.getValue().equals(map2.get(e.getKey()))){
                    System.out.println(false);
                }
            }
        }
        System.out.println(true);
    }
}
