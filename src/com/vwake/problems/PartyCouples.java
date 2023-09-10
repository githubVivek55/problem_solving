package com.vwake.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PartyCouples {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 3, 2, 1, 4, 5, 6, 6};
        int N = 5;
        System.out.println(findSingle(N,arr));
    }
    static int findSingle(int N, int[] arr){
        Map<Integer,Integer> count = new HashMap<>();
        for (int i: arr){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        Optional<Map.Entry<Integer, Integer>> first = count.entrySet().stream()
                .filter(e -> e.getValue() == 1).findFirst();
        if(first.isPresent()){
            return first.get().getKey();
        }
        return -1;
    }
}
