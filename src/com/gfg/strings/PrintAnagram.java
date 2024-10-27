package com.gfg.strings;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class PrintAnagram {

    interface Anagram extends BiPredicate<String, String> {
        boolean test(String a, String b);
    }

    public static void main(String[] args) {
//        String[] arr = {"act", "god", "cat", "dog", "tac"};
        String[] arr = {"no", "on", "is"};
        List<List<String>> anagrams = anagrams(arr);

        anagrams.forEach(System.out::println);

    }
    public static List<List<String>> anagrams(String[] arr) {
        // your code here
        Anagram checkAnagram = (a, b) -> {
            if (a.equals(b))
                return true;
            Map<Character, Long> res = a.chars().mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
            for (char c : b.toCharArray()) {
                if (!res.containsKey(c))
                    return false;
            }
            return true;
        };

        List<List<String>> res = new LinkedList<>();

        for(int i=0;i<arr.length;i++){
            List<String> list = new LinkedList<>();
            if(arr[i]==null)
                continue;
            list.add(arr[i]);
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]!=null && checkAnagram.test(arr[i],arr[j])){
                    list.add(arr[j]);
                    arr[j]=null;
                }
            }
            res.add(list);
        }
        return res;
    }
}
