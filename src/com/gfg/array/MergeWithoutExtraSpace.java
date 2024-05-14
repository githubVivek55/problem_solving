package com.gfg.array;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        long arr1[] = {1 ,3, 5, 7};
        long arr2[] = {0, 2, 6, 8, 9};
        merge(arr1,arr2, arr1.length,arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here
        int i=n-1,j=0;
        while (i>=0 && j<m){
            if(arr1[i]>arr2[j]){
                long t = arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=t;
            }
            i--;
            j++;
        }
        Arrays.sort(arr2);
        Arrays.sort(arr1);
    }

    private static void resuffle(long[] arr2) {
        for(int i=0;i< arr2.length-1;i++){
            if(arr2[i]<=arr2[i+1]){
                return;
            }else{
                long t = arr2[i];
                arr2[i]=arr2[i+1];
                arr2[i+1]=t;
            }
        }
    }
}
