package com.gfg.array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int n=6;
        int i = secondLargest(arr, n);
        System.out.println(i);
    }
    public static int secondLargest(int[] arr, int n){
        int max = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int max2 = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>max2 && arr[i]!=max){
                max2 = arr[i];
            }
        }
        return max2;
    }
}
