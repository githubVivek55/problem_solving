package com.gfg.array;

public class KthElement {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;
        int[] ar3 = mergeSort(arr1,0,arr1.length-1);
        int[] ar4 = mergeSort(arr2,0,arr2.length-1);
        int[] ar5 = mergeSortedArray(ar3,ar4);

        System.out.println(ar5[k-1]);

    }

    public static int[] mergeSort(int[] arr, int low, int high) {
        if(low==high){
            int[] brr = new int[1];
            brr[0]=arr[low];
            return brr;
        }
        int mid = (high + low) / 2;
        int[] arr1 = mergeSort(arr, low, mid);
        int[] arr2 = mergeSort(arr, mid + 1, high);
        return mergeSortedArray(arr1,arr2);
    }

    public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        if (i < arr1.length) {
            while (i < arr1.length) {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
        } else if (j < arr2.length) {
            while (j < arr2.length) {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        return arr3;
    }
}
