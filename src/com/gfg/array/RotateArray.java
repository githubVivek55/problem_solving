package com.gfg.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotateArr(arr, 9, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArr(int[] arr, int d, int n) {
        d = d % n;
        if(d == 0){
            return;
        }
        int[] arr2 = new int[d];
        System.arraycopy(arr, 0, arr2, 0, d);
        int start = 0;
        for (int i = d; i < n; i++) {
            arr[start]=arr[i];
            start++;
        }
        for (int j : arr2) {
            arr[start] = j;
            start++;
        }
    }
}
