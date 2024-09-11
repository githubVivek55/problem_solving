package com.gfg.array;

import java.util.Arrays;

public class SegregateZeroOnes {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0};


        segregate0and1(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    static void segregate0and1(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            } else if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            }
        }
    }
}
