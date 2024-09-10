package com.gfg.array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr ={-1, 2, -1, 3, 2,3};
        int i = firstNonRepeating(arr);
        System.out.println(i);
    }
    public static int firstNonRepeating(int[] arr) {
        // Complete the function

        Optional<Map.Entry<Integer, Long>> first = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter((es) -> es.getValue() == 1).findFirst();

        return first.map(Map.Entry::getKey).orElse(0);
    }
}
