package com.gfg.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecMostRepeatedStr {
    public static void main(String[] args) {
        String[] arr = {"geek", "for", "geek", "for", "geek", "aaa"};
        String s = secFrequent(arr);
        System.out.println(s);
    }
    public static String secFrequent(String[] arr)
    {
        // your code here
        Map<String,Integer> map = new HashMap<>();
        for(String str: arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        Optional<Map.Entry<String, Integer>> first = map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue()).skip(1)
                .findFirst();

        return first.map(Map.Entry::getKey).orElse(arr[0]);
    }
}
