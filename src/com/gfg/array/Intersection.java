package com.gfg.array;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int[] a = {89, 24, 75, 11, 23},
                b = {89, 2, 4};
        System.out.println(NumberofElementsInIntersection(a, b, a.length, b.length));
    }

    public static int NumberofElementsInIntersection(int[] a, int[] b, int n, int m) {
        Set<Integer> hash = new HashSet<>();
        Set<Integer> hash2 = new HashSet<>();
        for (int i : b) {
            hash.add(i);
        }
        for (int i : a) {
            hash2.add(i);
        }

        int count = 0;
        for (int i : hash) {
            if (hash2.contains(i)) {
                count++;
            }
        }
        return count;
    }
}
