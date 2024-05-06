package com.gfg.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotateArr(arr, 9, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArr(int arr[], int d, int n) {
        d = d % n;
        if(d == 0){
            return;
        }
        int[] arr2 = new int[d];
        for (int i = 0; i < d; i++) {
            arr2[i] = arr[i];
        }
        int start = 0;
        for (int i = d; i < n; i++) {
            arr[start]=arr[i];
            start++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[start] = arr2[i];
            start++;
        }
    }
}
