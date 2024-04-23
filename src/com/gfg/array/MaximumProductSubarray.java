package com.gfg.array;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {0, 1, -5, 7};
        System.out.println(maxProduct(arr, arr.length));
    }

    public static long maxProduct(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            long p = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (i == j) {
                    p = arr[i];
                } else {
                    p = p * arr[j];
                }
                if (p > max) {
                    max = p;
                }
            }
        }
        return max;
    }
}
