package com.vwake.problems;

public class Bitonic {
    public static void main(String[] args) {
        int arr[] = {1, 45, 47, 50};
        int max = arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                max = arr[i];
                break;
            }
        }
        System.out.println(max);
    }
}
