package com.gfg.array;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 3, 2};
        int n = 5;
        ArrayList<Integer> res = duplicates(arr, n);
        System.out.println(res);
    }

    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return map.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toCollection(ArrayList::new));
    }
}
