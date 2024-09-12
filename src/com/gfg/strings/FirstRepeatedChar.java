package com.gfg.strings;

import java.util.*;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char c = firstRep(s);
        System.out.println(c);
    }
    public static char firstRep(String S)
    {
        Map<Character,Integer> map = new LinkedHashMap<>();
        // your code here
        for(char ch : S.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        Optional<Map.Entry<Character, Integer>> first = map.entrySet().stream()
                .filter(characterIntegerEntry -> characterIntegerEntry.getValue() > 1)
                .findFirst();
        return first.map(Map.Entry::getKey).orElse('#');
    }
}
