package com.gfg.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PrintLargest {
    public static void main(String[] args) {
        String[] arr = {"3", "30", "34", "5", "9"};
        printLargest(arr.length,arr);
    }
    public static String printLargest(int n, String[] arr) {
        Arrays.sort(arr, (a,b)->(b+a).compareTo(a+b));
        return Arrays.stream(arr).collect(Collectors.joining(""));
    }
}
