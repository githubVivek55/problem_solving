package com.gfg.strings;

import java.util.*;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String s = "hello";
        char c = nonrepeatingCharacter(s);
        System.out.println(c);
    }
    static char nonrepeatingCharacter(String S)
    {
        if(S.length()==1){
            return S.charAt(0);
        }
        LinkedHashMap<Character,Integer> map =new LinkedHashMap<>();
        for(Character ch: S.toCharArray()){
            Integer i=map.putIfAbsent(ch,1);
            if(i!=null){
                map.computeIfPresent(ch,(k,v)->v+1);
            }
        }
        Optional<Map.Entry<Character, Integer>> first = map.entrySet().stream().filter(es -> es.getValue() == 1).findFirst();
        return first.isPresent()?first.get().getKey() : '-'+'1';
    }
}
