package com.gfg.array;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int p = partition(arr, low, high);
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        int p = arr[high];
        int i=low-1;
        for (int j=low;j<=high-1;j++){
            if(arr[j]<p){
                i++;
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr,i,high);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i]= arr[j];
        arr[j]=t;
    }
}
